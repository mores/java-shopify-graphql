package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.AnalyticsAnnotationUpdateInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Updates an existing [analytics annotation](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsAnnotation).
 * Only the fields provided in the `input` argument are modified; omitted fields remain unchanged.
 * Setting `endedAt` to `null` makes the annotation open-ended.
 *   
 * An app can update only annotations that it created. If an app attempts to update an annotation that it
 * didn't create, then the mutation returns a `NOT_FOUND` error.
 *   
 * Use [`analyticsAnnotationCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsAnnotationCreate)
 * to create a new annotation, or
 * [`analyticsAnnotationDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsAnnotationDelete)
 * to remove it.
 *   
 * If provided, the `type` field must specify a supported type for app-created annotations. Refer to the list of
 * [supported types](https://shopify.dev/docs/api/shopifyql/latest/syntax/annotate#annotation-categories-and-types).
 */
public class AnalyticsAnnotationUpdateGraphQLQuery extends GraphQLQuery {
  public AnalyticsAnnotationUpdateGraphQLQuery(String id, AnalyticsAnnotationUpdateInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public AnalyticsAnnotationUpdateGraphQLQuery(String id, AnalyticsAnnotationUpdateInput input,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public AnalyticsAnnotationUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "analyticsAnnotationUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private AnalyticsAnnotationUpdateInput input;

    private String queryName;

    public AnalyticsAnnotationUpdateGraphQLQuery build() {
      return new AnalyticsAnnotationUpdateGraphQLQuery(id, input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the analytics annotation to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the analytics annotation to update.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields for updating the analytics annotation.
     */
    public Builder input(AnalyticsAnnotationUpdateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields for updating the analytics annotation.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("AnalyticsAnnotationUpdateInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
