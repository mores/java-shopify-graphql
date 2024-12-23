package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.SubscriptionBillingCycleInput;
import com.shopify.types.SubscriptionBillingCycleScheduleEditInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Modify the schedule of a specific billing cycle.
 */
public class SubscriptionBillingCycleScheduleEditGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleScheduleEditGraphQLQuery(
      SubscriptionBillingCycleInput billingCycleInput,
      SubscriptionBillingCycleScheduleEditInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (billingCycleInput != null || fieldsSet.contains("billingCycleInput")) {
        getInput().put("billingCycleInput", billingCycleInput);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SubscriptionBillingCycleScheduleEditGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleScheduleEdit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SubscriptionBillingCycleInput billingCycleInput;

    private SubscriptionBillingCycleScheduleEditInput input;

    private String queryName;

    public SubscriptionBillingCycleScheduleEditGraphQLQuery build() {
      return new SubscriptionBillingCycleScheduleEditGraphQLQuery(billingCycleInput, input, queryName, fieldsSet);
               
    }

    /**
     * Input object for selecting and using billing cycles.
     */
    public Builder billingCycleInput(SubscriptionBillingCycleInput billingCycleInput) {
      this.billingCycleInput = billingCycleInput;
      this.fieldsSet.add("billingCycleInput");
      return this;
    }

    /**
     * Data used to create or modify billing cycle schedule edit.
     */
    public Builder input(SubscriptionBillingCycleScheduleEditInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
