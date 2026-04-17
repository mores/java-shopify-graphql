package io.github.mores;

import com.netflix.graphql.dgs.client.codegen.*;

import graphql.GraphQLContext;
import graphql.language.Argument;
import graphql.language.AstPrinter;
import graphql.language.Directive;
import graphql.language.Field;
import graphql.language.OperationDefinition;
import graphql.language.SelectionSet;
import graphql.language.StringValue;
import graphql.language.Value;
import graphql.language.VariableReference;
import graphql.schema.Coercing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GraphQLQueryRequest {

    private final GraphQLQuery query;
    private final BaseProjectionNode projection;
    private final List<GraphQLDirective> directives;
    private SelectionSet selectionSet;

    public final InputValueSerializer inputValueSerializer;
    public final ProjectionSerializer projectionSerializer;

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /** Minimal constructor — no options, no directives. */
    public GraphQLQueryRequest(GraphQLQuery query) {
        this(query, null, null, Collections.emptyList());
    }

    /** Query + projection, no options, no directives. */
    public GraphQLQueryRequest(GraphQLQuery query, BaseProjectionNode projection) {
        this(query, projection, null, Collections.emptyList());
    }

    /** Query + projection + options, no directives. */
    public GraphQLQueryRequest(GraphQLQuery query, BaseProjectionNode projection,
                               GraphQLQueryRequestOptions options) {
        this(query, projection, options, Collections.emptyList());
    }

    /** Query + projection + scalars convenience constructor (mirrors Kotlin secondary constructor). */
    public GraphQLQueryRequest(GraphQLQuery query, BaseProjectionNode projection,
                               Map<Class<?>, Coercing<?, ?>> scalars) {
        this(query, projection, new GraphQLQueryRequestOptions(scalars), Collections.emptyList());
    }

    /**
     * Query + raw {@link SelectionSet} + optional scalars
     * (mirrors the Kotlin secondary constructor that accepts a SelectionSet).
     */
    public GraphQLQueryRequest(GraphQLQuery query, SelectionSet selectionSet,
                               Map<Class<?>, Coercing<?, ?>> scalars) {
        this(query, null,
                new GraphQLQueryRequestOptions(scalars != null ? scalars : Collections.emptyMap()),
                Collections.emptyList());
        this.selectionSet = selectionSet;
    }

    /** Full constructor — all parameters including directives. */
    public GraphQLQueryRequest(GraphQLQuery query, BaseProjectionNode projection,
                               GraphQLQueryRequestOptions options,
                               List<GraphQLDirective> directives) {
        this.query = query;
        this.projection = projection;
        this.directives = directives != null ? directives : Collections.emptyList();

        boolean allowNullable = options != null && options.isAllowNullablePropertyInputValues();
        if (allowNullable) {
            this.inputValueSerializer = new NullableInputValueSerializer(options.getScalars());
        } else {
            this.inputValueSerializer = new InputValueSerializer(
                    options != null ? options.getScalars() : Collections.emptyMap(),
                    options != null ? options.getGraphQLContext() : GraphQLContext.getDefault()
            );
        }
        this.projectionSerializer = new ProjectionSerializer(inputValueSerializer, query);
    }

    // -------------------------------------------------------------------------
    // Public API
    // -------------------------------------------------------------------------

    public GraphQLQuery getQuery() {
        return query;
    }

    public BaseProjectionNode getProjection() {
        return projection;
    }

    public List<GraphQLDirective> getDirectives() {
        return Collections.unmodifiableList(directives);
    }

    public String serialize() {
        return serialize(false);
    }

    public String serializeCompact() {
        return serialize(true);
    }

    // -------------------------------------------------------------------------
    // Internal serialization
    // -------------------------------------------------------------------------

    @SuppressWarnings("unchecked")
    private String serialize(boolean compact) {
        OperationDefinition.Builder operationDef = OperationDefinition.newOperationDefinition();

        if (query.getName() != null) {
            operationDef.name(query.getName());
        }
        if (query.getOperationType() != null) {
            operationDef.operation(
                    OperationDefinition.Operation.valueOf(query.getOperationType().toUpperCase()));
        }

        Field.Builder selection = Field.newField(query.getOperationName());

        // Arguments
        if (!query.getInput().isEmpty()) {
            List<Argument> args = new ArrayList<>();
            for (Map.Entry<String, Object> entry : query.getInput().entrySet()) {
                String name = entry.getKey();
                Object value = entry.getValue();
                if (query.getVariableReferences().containsKey(name)) {
                    args.add(new Argument(name,
                            VariableReference.of(query.getVariableReferences().get(name))));
                } else {
                    args.add(new Argument(name, inputValueSerializer.toValue(value)));
                }
            }
            selection.arguments(args);
        }

        // Directives
        if (!directives.isEmpty()) {
            List<Directive> builtDirectives = new ArrayList<>();
            for (GraphQLDirective graphQLDirective : directives) {
                List<Argument> directiveArgs = new ArrayList<>();
                for (Map.Entry<String, Object> argEntry : graphQLDirective.getArguments().entrySet()) {
                    Value<?> langValue;
                    if (argEntry.getValue() instanceof Value) {
                        // Caller supplied a pre-built AST value — use it directly
                        langValue = (Value<?>) argEntry.getValue();
                    } else {
                        // Default: treat as a GraphQL String scalar
                        langValue = StringValue.of(argEntry.getValue().toString());
                    }
                    directiveArgs.add(new Argument(argEntry.getKey(), langValue));
                }
                builtDirectives.add(
                        Directive.newDirective()
                                .name(graphQLDirective.getName())
                                .arguments(directiveArgs)
                                .build()
                );
            }
            selection.directives(builtDirectives);
        }

        // Projection
        if (projection != null) {
            SelectionSet selectionSetFromProjection;
            if (projection instanceof BaseSubProjectionNode<?, ?>
                    && ((BaseSubProjectionNode<?, ?>) projection).root() != null) {
                selectionSetFromProjection = projectionSerializer.toSelectionSet(
                        (BaseProjectionNode) ((BaseSubProjectionNode<?, ?>) projection).root());
            } else {
                selectionSetFromProjection = projectionSerializer.toSelectionSet(projection);
            }
            if (!selectionSetFromProjection.getSelections().isEmpty()) {
                selection.selectionSet(selectionSetFromProjection);
            }
        }

        // Variable definitions
        if (!query.getVariableDefinitions().isEmpty()) {
            operationDef.variableDefinitions(query.getVariableDefinitions());
        }

        // Raw SelectionSet (set via the SelectionSet constructor)
        if (selectionSet != null) {
            selection.selectionSet(selectionSet);
        }

        operationDef.selectionSet(
                SelectionSet.newSelectionSet().selection(selection.build()).build());

        return compact
                ? AstPrinter.printAstCompact(operationDef.build())
                : AstPrinter.printAst(operationDef.build());
    }

    // -------------------------------------------------------------------------
    // Options inner class
    // -------------------------------------------------------------------------

    public static class GraphQLQueryRequestOptions {

        private final Map<Class<?>, Coercing<?, ?>> scalars;
        private final GraphQLContext graphQLContext;
        private boolean allowNullablePropertyInputValues = false;

        public GraphQLQueryRequestOptions() {
            this(Collections.emptyMap(), GraphQLContext.getDefault());
        }

        public GraphQLQueryRequestOptions(Map<Class<?>, Coercing<?, ?>> scalars) {
            this(scalars, GraphQLContext.getDefault());
        }

        public GraphQLQueryRequestOptions(Map<Class<?>, Coercing<?, ?>> scalars,
                                          GraphQLContext graphQLContext) {
            this.scalars = scalars != null ? scalars : Collections.emptyMap();
            this.graphQLContext = graphQLContext != null ? graphQLContext : GraphQLContext.getDefault();
        }

        public Map<Class<?>, Coercing<?, ?>> getScalars() {
            return scalars;
        }

        public GraphQLContext getGraphQLContext() {
            return graphQLContext;
        }

        public boolean isAllowNullablePropertyInputValues() {
            return allowNullablePropertyInputValues;
        }

        public void setAllowNullablePropertyInputValues(boolean allowNullablePropertyInputValues) {
            this.allowNullablePropertyInputValues = allowNullablePropertyInputValues;
        }
    }
}
