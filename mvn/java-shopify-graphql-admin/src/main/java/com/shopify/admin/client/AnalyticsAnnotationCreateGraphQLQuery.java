package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.AnalyticsAnnotationCreateInput;
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
 * Creates an [analytics annotation](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsAnnotation)
 * on the shop. Annotations are notable events that can be overlaid on analytics charts to provide context for
 * changes in metrics. The annotation is attributed to the app that calls the mutation.
 *   
 * Shopify limits how many annotations an app can have for a shop. If the app reaches this limit, then the
 * mutation returns a `LIMIT_REACHED` error. Delete existing annotations or contact Shopify Support to request
 * a higher limit.
 *   
 * Use [`analyticsAnnotationUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsAnnotationUpdate)
 * to modify existing annotations or
 * [`analyticsAnnotationDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsAnnotationDelete)
 * to remove them.
 *   
 * The `type` field must specify a supported type for app-created annotations. Refer to the list of
 * [supported types](https://shopify.dev/docs/api/shopifyql/latest/syntax/annotate#annotation-categories-and-types).
 */
public class AnalyticsAnnotationCreateGraphQLQuery extends GraphQLQuery {
  public AnalyticsAnnotationCreateGraphQLQuery(AnalyticsAnnotationCreateInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public AnalyticsAnnotationCreateGraphQLQuery(AnalyticsAnnotationCreateInput input,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public AnalyticsAnnotationCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "analyticsAnnotationCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private AnalyticsAnnotationCreateInput input;

    private String queryName;

    public AnalyticsAnnotationCreateGraphQLQuery build() {
      return new AnalyticsAnnotationCreateGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields for creating an analytics annotation.
     */
    public Builder input(AnalyticsAnnotationCreateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields for creating an analytics annotation.
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("AnalyticsAnnotationCreateInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
