package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionActor;
import com.shopify.admin.types.SubscriptionBillingCycleSelector;
import com.shopify.admin.types.SubscriptionContractCalculationBillingCycleEditInput;
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
 * Starts an asynchronous calculation for changes to a single billing cycle of an
 * existing subscription contract. Committing the calculation applies the changes
 * only to the selected cycle, leaving the recurring contract unchanged.
 *   
 * Poll the [`subscriptionContractCalculation`](https://shopify.dev/docs/api/admin-graphql/latest/queries/subscriptionContractCalculation) query to review the calculated contract, then commit it with the [`subscriptionContractCalculationCommit`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionContractCalculationCommit) mutation.
 *   
 * Calls are rate limited per app and store. If you exceed the limit, then the
 * mutation returns a top-level `THROTTLED` error and doesn't start a
 * calculation. Wait a moment, then retry.
 *   
 * Learn how to [update a subscription contract](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/contracts/update-a-subscription-contract).
 */
public class SubscriptionBillingCycleContractEditCalculateGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleContractEditCalculateGraphQLQuery(SubscriptionActor actor,
      String contractId, SubscriptionBillingCycleSelector billingCycleSelector,
      SubscriptionContractCalculationBillingCycleEditInput billingCycleEditInput, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (actor != null || fieldsSet.contains("actor")) {
        getInput().put("actor", actor);
    }if (contractId != null || fieldsSet.contains("contractId")) {
        getInput().put("contractId", contractId);
    }if (billingCycleSelector != null || fieldsSet.contains("billingCycleSelector")) {
        getInput().put("billingCycleSelector", billingCycleSelector);
    }if (billingCycleEditInput != null || fieldsSet.contains("billingCycleEditInput")) {
        getInput().put("billingCycleEditInput", billingCycleEditInput);
    }
  }

  public SubscriptionBillingCycleContractEditCalculateGraphQLQuery(SubscriptionActor actor,
      String contractId, SubscriptionBillingCycleSelector billingCycleSelector,
      SubscriptionContractCalculationBillingCycleEditInput billingCycleEditInput, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (actor != null || fieldsSet.contains("actor")) {
        getInput().put("actor", actor);
    }if (contractId != null || fieldsSet.contains("contractId")) {
        getInput().put("contractId", contractId);
    }if (billingCycleSelector != null || fieldsSet.contains("billingCycleSelector")) {
        getInput().put("billingCycleSelector", billingCycleSelector);
    }if (billingCycleEditInput != null || fieldsSet.contains("billingCycleEditInput")) {
        getInput().put("billingCycleEditInput", billingCycleEditInput);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionBillingCycleContractEditCalculateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleContractEditCalculate";
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

    private SubscriptionBillingCycleSelector billingCycleSelector;

    private SubscriptionContractCalculationBillingCycleEditInput billingCycleEditInput;

    private String queryName;

    public SubscriptionBillingCycleContractEditCalculateGraphQLQuery build() {
      return new SubscriptionBillingCycleContractEditCalculateGraphQLQuery(actor, contractId, billingCycleSelector, billingCycleEditInput, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * The ID of the subscription contract to edit.
     */
    public Builder contractId(String contractId) {
      this.contractId = contractId;
      this.fieldsSet.add("contractId");
      return this;
    }

    /**
     * The ID of the subscription contract to edit.
     */
    public Builder contractIdReference(String variableRef) {
      this.variableReferences.put("contractId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("contractId");
      return this;
    }

    /**
     * Selects the billing cycle to edit, by index or date.
     */
    public Builder billingCycleSelector(SubscriptionBillingCycleSelector billingCycleSelector) {
      this.billingCycleSelector = billingCycleSelector;
      this.fieldsSet.add("billingCycleSelector");
      return this;
    }

    /**
     * Selects the billing cycle to edit, by index or date.
     */
    public Builder billingCycleSelectorReference(String variableRef) {
      this.variableReferences.put("billingCycleSelector", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SubscriptionBillingCycleSelector"))).build());
      this.fieldsSet.add("billingCycleSelector");
      return this;
    }

    /**
     * The input for the single billing cycle contract edit calculation.
     */
    public Builder billingCycleEditInput(
        SubscriptionContractCalculationBillingCycleEditInput billingCycleEditInput) {
      this.billingCycleEditInput = billingCycleEditInput;
      this.fieldsSet.add("billingCycleEditInput");
      return this;
    }

    /**
     * The input for the single billing cycle contract edit calculation.
     */
    public Builder billingCycleEditInputReference(String variableRef) {
      this.variableReferences.put("billingCycleEditInput", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SubscriptionContractCalculationBillingCycleEditInput"))).build());
      this.fieldsSet.add("billingCycleEditInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
