package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.SubscriptionBillingCycleInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Delete the schedule and contract edits of the selected subscription billing cycle.
 */
public class SubscriptionBillingCycleEditDeleteGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleEditDeleteGraphQLQuery(
      SubscriptionBillingCycleInput billingCycleInput, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (billingCycleInput != null || fieldsSet.contains("billingCycleInput")) {
        getInput().put("billingCycleInput", billingCycleInput);
    }
  }

  public SubscriptionBillingCycleEditDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleEditDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SubscriptionBillingCycleInput billingCycleInput;

    private String queryName;

    public SubscriptionBillingCycleEditDeleteGraphQLQuery build() {
      return new SubscriptionBillingCycleEditDeleteGraphQLQuery(billingCycleInput, queryName, fieldsSet);
               
    }

    /**
     * Input object used to select and use billing cycles.
     */
    public Builder billingCycleInput(SubscriptionBillingCycleInput billingCycleInput) {
      this.billingCycleInput = billingCycleInput;
      this.fieldsSet.add("billingCycleInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
