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
 * Commits a succeeded subscription contract calculation. For a create or update
 * calculation, committing makes the calculated contract the contract's new
 * active version used for future billing. For a billing cycle edit, committing
 * applies the calculated contract only to the selected cycle. A calculation that
 * provides `fetchAvailableDeliveryOptions` only discovered delivery options and
 * can't be committed. Create a new calculation with the chosen delivery method,
 * then commit it.
 *   
 * The calculation must be in a succeeded state, which you can confirm with the [`subscriptionContractCalculation`](https://shopify.dev/docs/api/admin-graphql/latest/queries/subscriptionContractCalculation)
 * query. Returns the committed contract as a [`SubscriptionContract`](https://shopify.dev/docs/api/admin-graphql/latest/objects/SubscriptionContract),
 * or a `SubscriptionBillingCycleEditedContract` for a billing cycle edit.
 *   
 * Commits are rate limited per subscription contract across all apps on the
 * store. If you exceed the limit, then the mutation returns a top-level
 * `THROTTLED` error and doesn't commit. Wait before you retry.
 *   
 * Learn how to [build a subscription contract](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/contracts/build-a-subscription-contract).
 */
public class SubscriptionContractCalculationCommitGraphQLQuery extends GraphQLQuery {
  public SubscriptionContractCalculationCommitGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public SubscriptionContractCalculationCommitGraphQLQuery(String id, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
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

  public SubscriptionContractCalculationCommitGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionContractCalculationCommit";
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

    public SubscriptionContractCalculationCommitGraphQLQuery build() {
      return new SubscriptionContractCalculationCommitGraphQLQuery(id, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the Subscription Contract Calculation to commit.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the Subscription Contract Calculation to commit.
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
