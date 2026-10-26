package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionBillingAttemptInput;
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
 * Creates a billing attempt to charge for a [`SubscriptionContract`](https://shopify.dev/docs/api/admin-graphql/latest/objects/SubscriptionContract).
 * The mutation processes either the payment for the current billing cycle or for
 * a specific cycle, if selected.
 *   
 * The mutation creates an
 * [`Order`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order)
 * when successful. Failed billing attempts include a [`processingError`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionBillingAttemptCreate#returns-subscriptionBillingAttempt.fields.processingError)
 * field with error details.
 *   
 * > Tip:
 * > Use the [`idempotencyKey`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionBillingAttemptCreate#arguments-subscriptionBillingAttemptInput.fields.idempotencyKey) to ensure the billing attempt executes only once, preventing duplicate charges
 * if the request is retried.
 *   
 * You can target a specific billing cycle using the [`billingCycleSelector`](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/SubscriptionBillingCycleSelector)
 * to bill past or future cycles. The [`originTime`](https://shopify.dev/docs/api/admin-graphql/latest/objects/SubscriptionBillingAttempt#field-SubscriptionBillingAttempt.fields.originTime)
 * parameter adjusts fulfillment scheduling for attempts completed after the
 * expected billing date.
 *   
 * Learn more about [creating billing attempts](https://shopify.dev/docs/apps/build/purchase-options/subscriptions/contracts/build-a-subscription-contract#step-4-create-a-billing-attempt).
 */
public class SubscriptionBillingAttemptCreateGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingAttemptCreateGraphQLQuery(String subscriptionContractId,
      SubscriptionBillingAttemptInput subscriptionBillingAttemptInput, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (subscriptionContractId != null || fieldsSet.contains("subscriptionContractId")) {
        getInput().put("subscriptionContractId", subscriptionContractId);
    }if (subscriptionBillingAttemptInput != null || fieldsSet.contains("subscriptionBillingAttemptInput")) {
        getInput().put("subscriptionBillingAttemptInput", subscriptionBillingAttemptInput);
    }
  }

  public SubscriptionBillingAttemptCreateGraphQLQuery(String subscriptionContractId,
      SubscriptionBillingAttemptInput subscriptionBillingAttemptInput, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (subscriptionContractId != null || fieldsSet.contains("subscriptionContractId")) {
        getInput().put("subscriptionContractId", subscriptionContractId);
    }if (subscriptionBillingAttemptInput != null || fieldsSet.contains("subscriptionBillingAttemptInput")) {
        getInput().put("subscriptionBillingAttemptInput", subscriptionBillingAttemptInput);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionBillingAttemptCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingAttemptCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String subscriptionContractId;

    private SubscriptionBillingAttemptInput subscriptionBillingAttemptInput;

    private String queryName;

    public SubscriptionBillingAttemptCreateGraphQLQuery build() {
      return new SubscriptionBillingAttemptCreateGraphQLQuery(subscriptionContractId, subscriptionBillingAttemptInput, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the subscription contract.
     */
    public Builder subscriptionContractId(String subscriptionContractId) {
      this.subscriptionContractId = subscriptionContractId;
      this.fieldsSet.add("subscriptionContractId");
      return this;
    }

    /**
     * The ID of the subscription contract.
     */
    public Builder subscriptionContractIdReference(String variableRef) {
      this.variableReferences.put("subscriptionContractId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("subscriptionContractId");
      return this;
    }

    /**
     * The information to apply as a billing attempt.
     */
    public Builder subscriptionBillingAttemptInput(
        SubscriptionBillingAttemptInput subscriptionBillingAttemptInput) {
      this.subscriptionBillingAttemptInput = subscriptionBillingAttemptInput;
      this.fieldsSet.add("subscriptionBillingAttemptInput");
      return this;
    }

    /**
     * The information to apply as a billing attempt.
     */
    public Builder subscriptionBillingAttemptInputReference(String variableRef) {
      this.variableReferences.put("subscriptionBillingAttemptInput", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SubscriptionBillingAttemptInput"))).build());
      this.fieldsSet.add("subscriptionBillingAttemptInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
