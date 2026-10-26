package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionActor;
import com.shopify.admin.types.SubscriptionContractCalculationContractUpdateInput;
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
 * Starts an asynchronous calculation for changes to an existing subscription
 * contract. The changes aren't applied to the contract until you commit the
 * calculation, and fields omitted from the input remain unchanged.
 *   
 * Poll the [`subscriptionContractCalculation`](https://shopify.dev/docs/api/admin-graphql/latest/queries/subscriptionContractCalculation) query to review the calculated contract, its projected order totals, and any
 * warnings, then commit it with the [`subscriptionContractCalculationCommit`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionContractCalculationCommit) mutation.
 *   
 * Calls are rate limited per app and store. If you exceed the limit, then the
 * mutation returns a top-level `THROTTLED` error and doesn't start a
 * calculation. Wait a moment, then retry.
 *   
 * Learn how to [update a subscription contract](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/contracts/update-a-subscription-contract).
 */
public class SubscriptionContractUpdateCalculateGraphQLQuery extends GraphQLQuery {
  public SubscriptionContractUpdateCalculateGraphQLQuery(SubscriptionActor actor, String contractId,
      SubscriptionContractCalculationContractUpdateInput contractUpdateInput, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (actor != null || fieldsSet.contains("actor")) {
        getInput().put("actor", actor);
    }if (contractId != null || fieldsSet.contains("contractId")) {
        getInput().put("contractId", contractId);
    }if (contractUpdateInput != null || fieldsSet.contains("contractUpdateInput")) {
        getInput().put("contractUpdateInput", contractUpdateInput);
    }
  }

  public SubscriptionContractUpdateCalculateGraphQLQuery(SubscriptionActor actor, String contractId,
      SubscriptionContractCalculationContractUpdateInput contractUpdateInput, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (actor != null || fieldsSet.contains("actor")) {
        getInput().put("actor", actor);
    }if (contractId != null || fieldsSet.contains("contractId")) {
        getInput().put("contractId", contractId);
    }if (contractUpdateInput != null || fieldsSet.contains("contractUpdateInput")) {
        getInput().put("contractUpdateInput", contractUpdateInput);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionContractUpdateCalculateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionContractUpdateCalculate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private SubscriptionActor actor;

    private String contractId;

    private SubscriptionContractCalculationContractUpdateInput contractUpdateInput;

    private String queryName;

    public SubscriptionContractUpdateCalculateGraphQLQuery build() {
      return new SubscriptionContractUpdateCalculateGraphQLQuery(actor, contractId, contractUpdateInput, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The actor who initiated a subscription action.
     */
    public Builder actor(SubscriptionActor actor) {
      this.actor = actor;
      this.fieldsSet.add("actor");
      return this;
    }

    /**
     * The actor who initiated a subscription action.
     */
    public Builder actorReference(String variableRef) {
      this.variableReferences.put("actor", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("SubscriptionActor")).build());
      this.fieldsSet.add("actor");
      return this;
    }

    /**
     * The ID of the subscription contract to update.
     */
    public Builder contractId(String contractId) {
      this.contractId = contractId;
      this.fieldsSet.add("contractId");
      return this;
    }

    /**
     * The ID of the subscription contract to update.
     */
    public Builder contractIdReference(String variableRef) {
      this.variableReferences.put("contractId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("contractId");
      return this;
    }

    /**
     * The input for the subscription contract update calculation.
     */
    public Builder contractUpdateInput(
        SubscriptionContractCalculationContractUpdateInput contractUpdateInput) {
      this.contractUpdateInput = contractUpdateInput;
      this.fieldsSet.add("contractUpdateInput");
      return this;
    }

    /**
     * The input for the subscription contract update calculation.
     */
    public Builder contractUpdateInputReference(String variableRef) {
      this.variableReferences.put("contractUpdateInput", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SubscriptionContractCalculationContractUpdateInput"))).build());
      this.fieldsSet.add("contractUpdateInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
