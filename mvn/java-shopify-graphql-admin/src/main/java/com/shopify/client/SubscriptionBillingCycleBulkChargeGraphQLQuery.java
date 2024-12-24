package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.SubscriptionBillingCycleBulkFilters;
import com.shopify.types.SubscriptionBillingCyclesDateRangeSelector;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class SubscriptionBillingCycleBulkChargeGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleBulkChargeGraphQLQuery(
      SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange,
      SubscriptionBillingCycleBulkFilters filters, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (billingAttemptExpectedDateRange != null || fieldsSet.contains("billingAttemptExpectedDateRange")) {
        getInput().put("billingAttemptExpectedDateRange", billingAttemptExpectedDateRange);
    }if (filters != null || fieldsSet.contains("filters")) {
        getInput().put("filters", filters);
    }
  }

  public SubscriptionBillingCycleBulkChargeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleBulkCharge";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange;

    private SubscriptionBillingCycleBulkFilters filters;

    private String queryName;

    public SubscriptionBillingCycleBulkChargeGraphQLQuery build() {
      return new SubscriptionBillingCycleBulkChargeGraphQLQuery(billingAttemptExpectedDateRange, filters, queryName, fieldsSet);
               
    }

    
    public Builder billingAttemptExpectedDateRange(
        SubscriptionBillingCyclesDateRangeSelector billingAttemptExpectedDateRange) {
      this.billingAttemptExpectedDateRange = billingAttemptExpectedDateRange;
      this.fieldsSet.add("billingAttemptExpectedDateRange");
      return this;
    }

    
    public Builder filters(SubscriptionBillingCycleBulkFilters filters) {
      this.filters = filters;
      this.fieldsSet.add("filters");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
