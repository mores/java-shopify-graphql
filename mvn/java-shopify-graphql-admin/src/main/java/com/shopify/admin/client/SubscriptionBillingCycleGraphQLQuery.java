package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionBillingCycleInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a subscription billing cycle found either by cycle index or date.
 */
public class SubscriptionBillingCycleGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleGraphQLQuery(SubscriptionBillingCycleInput billingCycleInput,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (billingCycleInput != null || fieldsSet.contains("billingCycleInput")) {
        getInput().put("billingCycleInput", billingCycleInput);
    }
  }

  public SubscriptionBillingCycleGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycle";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SubscriptionBillingCycleInput billingCycleInput;

    private String queryName;

    public SubscriptionBillingCycleGraphQLQuery build() {
      return new SubscriptionBillingCycleGraphQLQuery(billingCycleInput, queryName, fieldsSet);
               
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
