package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.AnalyticsTargetCreateInput;
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
 * Creates an [analytics target](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsTarget) that
 * defines a merchant's goal for a specific metric over a date range. For example, a merchant
 * can set a target of $50,000 in total sales for a quarter, or 1,000 orders in a month.
 *   
 * Provide the target attributes through the `input` argument. The target's currency is set to
 * the shop's currency. A target is uniquely identified by the combination of `metric`, `startDate`,
 * `endDate`, and `filters` — attempting to create a duplicate returns a user error.
 *   
 * Use [`analyticsTargetUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsTargetUpdate)
 * to modify an existing target, or
 * [`analyticsTargetsDelete`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/analyticsTargetsDelete)
 * to remove targets.
 */
public class AnalyticsTargetCreateGraphQLQuery extends GraphQLQuery {
  public AnalyticsTargetCreateGraphQLQuery(AnalyticsTargetCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public AnalyticsTargetCreateGraphQLQuery(AnalyticsTargetCreateInput input, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
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

  public AnalyticsTargetCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "analyticsTargetCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private AnalyticsTargetCreateInput input;

    private String queryName;

    public AnalyticsTargetCreateGraphQLQuery build() {
      return new AnalyticsTargetCreateGraphQLQuery(input, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input fields for creating an [analytics target](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsTarget).
     */
    public Builder input(AnalyticsTargetCreateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    /**
     * The input fields for creating an [analytics target](https://shopify.dev/docs/api/admin-graphql/latest/objects/AnalyticsTarget).
     */
    public Builder inputReference(String variableRef) {
      this.variableReferences.put("input", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("AnalyticsTargetCreateInput"))).build());
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
