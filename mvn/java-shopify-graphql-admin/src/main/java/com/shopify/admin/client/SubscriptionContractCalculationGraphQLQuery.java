package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Returns a subscription contract calculation by ID. Use this query to poll a
 * calculation started by [`subscriptionContractCreateCalculate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionContractCreateCalculate), [`subscriptionContractUpdateCalculate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionContractUpdateCalculate), or [`subscriptionBillingCycleContractEditCalculate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionBillingCycleContractEditCalculate)
 * until it succeeds or fails.
 *   
 * The result resolves to a pending, succeeded, or failure type. Commit a
 * succeeded calculation with the [`subscriptionContractCalculationCommit`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionContractCalculationCommit) mutation.
 *   
 * Learn how to [build a subscription contract](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/contracts/build-a-subscription-contract).
 */
public class SubscriptionContractCalculationGraphQLQuery extends GraphQLQuery {
  public SubscriptionContractCalculationGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public SubscriptionContractCalculationGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionContractCalculationGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "subscriptionContractCalculation";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private String queryName;

    public SubscriptionContractCalculationGraphQLQuery build() {
      return new SubscriptionContractCalculationGraphQLQuery(id, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the Subscription Contract Calculation to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the Subscription Contract Calculation to return.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
