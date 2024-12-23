package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.SubscriptionBillingCycleSelector;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a new subscription billing attempt for a specified billing cycle. This
 * is the alternative mutation for [subscriptionBillingAttemptCreate](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionBillingAttemptCreate).
 * For more information, refer to [Create a subscription contract](https://shopify.dev/docs/apps/selling-strategies/subscriptions/contracts/create#step-4-create-a-billing-attempt).
 */
public class SubscriptionBillingCycleChargeGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleChargeGraphQLQuery(String subscriptionContractId,
      SubscriptionBillingCycleSelector billingCycleSelector, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (subscriptionContractId != null || fieldsSet.contains("subscriptionContractId")) {
        getInput().put("subscriptionContractId", subscriptionContractId);
    }if (billingCycleSelector != null || fieldsSet.contains("billingCycleSelector")) {
        getInput().put("billingCycleSelector", billingCycleSelector);
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

    private String subscriptionContractId;

    private SubscriptionBillingCycleSelector billingCycleSelector;

    private String queryName;

    public SubscriptionBillingCycleChargeGraphQLQuery build() {
      return new SubscriptionBillingCycleChargeGraphQLQuery(subscriptionContractId, billingCycleSelector, queryName, fieldsSet);
               
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
