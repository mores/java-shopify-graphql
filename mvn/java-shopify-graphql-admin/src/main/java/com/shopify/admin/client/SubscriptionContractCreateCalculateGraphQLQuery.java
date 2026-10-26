package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionContractCalculationContractCreateInput;
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
 * Starts an asynchronous calculation for a new subscription contract. The
 * contract isn't created until you commit the calculation.
 *   
 * Poll the [`subscriptionContractCalculation`](https://shopify.dev/docs/api/admin-graphql/latest/queries/subscriptionContractCalculation) query to review the calculated contract, its projected order totals, and any
 * warnings, then commit it with the [`subscriptionContractCalculationCommit`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionContractCalculationCommit) mutation.
 *   
 * Calls are rate limited per app and store. If you exceed the limit, then the
 * mutation returns a top-level `THROTTLED` error and doesn't start a
 * calculation. Wait a moment, then retry.
 *   
 * Learn how to [build a subscription contract](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/contracts/build-a-subscription-contract).
 */
public class SubscriptionContractCreateCalculateGraphQLQuery extends GraphQLQuery {
  public SubscriptionContractCreateCalculateGraphQLQuery(
      SubscriptionContractCalculationContractCreateInput contractCreateInput, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (contractCreateInput != null || fieldsSet.contains("contractCreateInput")) {
        getInput().put("contractCreateInput", contractCreateInput);
    }
  }

  public SubscriptionContractCreateCalculateGraphQLQuery(
      SubscriptionContractCalculationContractCreateInput contractCreateInput, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (contractCreateInput != null || fieldsSet.contains("contractCreateInput")) {
        getInput().put("contractCreateInput", contractCreateInput);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionContractCreateCalculateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionContractCreateCalculate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private SubscriptionContractCalculationContractCreateInput contractCreateInput;

    private String queryName;

    public SubscriptionContractCreateCalculateGraphQLQuery build() {
      return new SubscriptionContractCreateCalculateGraphQLQuery(contractCreateInput, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input for the new subscription contract calculation.
     */
    public Builder contractCreateInput(
        SubscriptionContractCalculationContractCreateInput contractCreateInput) {
      this.contractCreateInput = contractCreateInput;
      this.fieldsSet.add("contractCreateInput");
      return this;
    }

    /**
     * The input for the new subscription contract calculation.
     */
    public Builder contractCreateInputReference(String variableRef) {
      this.variableReferences.put("contractCreateInput", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SubscriptionContractCalculationContractCreateInput"))).build());
      this.fieldsSet.add("contractCreateInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
