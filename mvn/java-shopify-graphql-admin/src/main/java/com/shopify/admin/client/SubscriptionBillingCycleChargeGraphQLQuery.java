package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionActor;
import com.shopify.admin.types.SubscriptionBillingAttemptInventoryPolicy;
import com.shopify.admin.types.SubscriptionBillingAttemptPaymentProcessingPolicy;
import com.shopify.admin.types.SubscriptionBillingCycleSelector;
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
 * Creates a new subscription billing attempt for a specified billing cycle. This
 * is the alternative mutation for [subscriptionBillingAttemptCreate](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionBillingAttemptCreate).
 * For more information, refer to [Create a subscription contract](https://shopify.dev/docs/apps/selling-strategies/subscriptions/contracts/create#step-4-create-a-billing-attempt).
 */
public class SubscriptionBillingCycleChargeGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleChargeGraphQLQuery(SubscriptionActor actor,
      String subscriptionContractId, SubscriptionBillingCycleSelector billingCycleSelector,
      SubscriptionBillingAttemptInventoryPolicy inventoryPolicy,
      SubscriptionBillingAttemptPaymentProcessingPolicy paymentProcessingPolicy, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (actor != null || fieldsSet.contains("actor")) {
        getInput().put("actor", actor);
    }if (subscriptionContractId != null || fieldsSet.contains("subscriptionContractId")) {
        getInput().put("subscriptionContractId", subscriptionContractId);
    }if (billingCycleSelector != null || fieldsSet.contains("billingCycleSelector")) {
        getInput().put("billingCycleSelector", billingCycleSelector);
    }if (inventoryPolicy != null || fieldsSet.contains("inventoryPolicy")) {
        getInput().put("inventoryPolicy", inventoryPolicy);
    }if (paymentProcessingPolicy != null || fieldsSet.contains("paymentProcessingPolicy")) {
        getInput().put("paymentProcessingPolicy", paymentProcessingPolicy);
    }
  }

  public SubscriptionBillingCycleChargeGraphQLQuery(SubscriptionActor actor,
      String subscriptionContractId, SubscriptionBillingCycleSelector billingCycleSelector,
      SubscriptionBillingAttemptInventoryPolicy inventoryPolicy,
      SubscriptionBillingAttemptPaymentProcessingPolicy paymentProcessingPolicy, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (actor != null || fieldsSet.contains("actor")) {
        getInput().put("actor", actor);
    }if (subscriptionContractId != null || fieldsSet.contains("subscriptionContractId")) {
        getInput().put("subscriptionContractId", subscriptionContractId);
    }if (billingCycleSelector != null || fieldsSet.contains("billingCycleSelector")) {
        getInput().put("billingCycleSelector", billingCycleSelector);
    }if (inventoryPolicy != null || fieldsSet.contains("inventoryPolicy")) {
        getInput().put("inventoryPolicy", inventoryPolicy);
    }if (paymentProcessingPolicy != null || fieldsSet.contains("paymentProcessingPolicy")) {
        getInput().put("paymentProcessingPolicy", paymentProcessingPolicy);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public SubscriptionBillingCycleChargeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleCharge";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private SubscriptionActor actor;

    private String subscriptionContractId;

    private SubscriptionBillingCycleSelector billingCycleSelector;

    private SubscriptionBillingAttemptInventoryPolicy inventoryPolicy;

    private SubscriptionBillingAttemptPaymentProcessingPolicy paymentProcessingPolicy;

    private String queryName;

    public SubscriptionBillingCycleChargeGraphQLQuery build() {
      return new SubscriptionBillingCycleChargeGraphQLQuery(actor, subscriptionContractId, billingCycleSelector, inventoryPolicy, paymentProcessingPolicy, queryName, fieldsSet, variableReferences, variableDefinitions);
               
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
     * Select the specific billing cycle to be billed.
     * If the selected billing cycle's [billingAttemptExpectedDate](https://shopify.dev/docs/api/admin-graphql/latest/objects/SubscriptionBillingCycle#field-subscriptionbillingcycle-billingattemptexpecteddate)
     * is in the past, the [originTime](https://shopify.dev/docs/api/admin-graphql/latest/objects/SubscriptionBillingAttempt#field-subscriptionbillingattempt-origintime)
     * of the billing attempt will be set to this date. However, if the [billingAttemptExpectedDate](https://shopify.dev/docs/api/admin-graphql/latest/objects/SubscriptionBillingCycle#field-subscriptionbillingcycle-billingattemptexpecteddate)
     * is in the future, the originTime will be the current time.
     */
    public Builder billingCycleSelector(SubscriptionBillingCycleSelector billingCycleSelector) {
      this.billingCycleSelector = billingCycleSelector;
      this.fieldsSet.add("billingCycleSelector");
      return this;
    }

    /**
     * Select the specific billing cycle to be billed.
     * If the selected billing cycle's [billingAttemptExpectedDate](https://shopify.dev/docs/api/admin-graphql/latest/objects/SubscriptionBillingCycle#field-subscriptionbillingcycle-billingattemptexpecteddate)
     * is in the past, the [originTime](https://shopify.dev/docs/api/admin-graphql/latest/objects/SubscriptionBillingAttempt#field-subscriptionbillingattempt-origintime)
     * of the billing attempt will be set to this date. However, if the [billingAttemptExpectedDate](https://shopify.dev/docs/api/admin-graphql/latest/objects/SubscriptionBillingCycle#field-subscriptionbillingcycle-billingattemptexpecteddate)
     * is in the future, the originTime will be the current time.
     */
    public Builder billingCycleSelectorReference(String variableRef) {
      this.variableReferences.put("billingCycleSelector", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("SubscriptionBillingCycleSelector"))).build());
      this.fieldsSet.add("billingCycleSelector");
      return this;
    }

    /**
     * The behaviour to use when updating inventory.
     */
    public Builder inventoryPolicy(SubscriptionBillingAttemptInventoryPolicy inventoryPolicy) {
      this.inventoryPolicy = inventoryPolicy;
      this.fieldsSet.add("inventoryPolicy");
      return this;
    }

    /**
     * The behaviour to use when updating inventory.
     */
    public Builder inventoryPolicyReference(String variableRef) {
      this.variableReferences.put("inventoryPolicy", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("SubscriptionBillingAttemptInventoryPolicy")).build());
      this.fieldsSet.add("inventoryPolicy");
      return this;
    }

    /**
     * Select payment processing policy for the billing attempt. Defaults to FAIL_UNLESS_VALID_PAYMENT_METHOD.
     */
    public Builder paymentProcessingPolicy(
        SubscriptionBillingAttemptPaymentProcessingPolicy paymentProcessingPolicy) {
      this.paymentProcessingPolicy = paymentProcessingPolicy;
      this.fieldsSet.add("paymentProcessingPolicy");
      return this;
    }

    /**
     * Select payment processing policy for the billing attempt. Defaults to FAIL_UNLESS_VALID_PAYMENT_METHOD.
     */
    public Builder paymentProcessingPolicyReference(String variableRef) {
      this.variableReferences.put("paymentProcessingPolicy", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("SubscriptionBillingAttemptPaymentProcessingPolicy")).build());
      this.fieldsSet.add("paymentProcessingPolicy");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
