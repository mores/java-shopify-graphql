package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.SubscriptionBillingCycleSelector;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


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

    
    public Builder subscriptionContractId(String subscriptionContractId) {
      this.subscriptionContractId = subscriptionContractId;
      this.fieldsSet.add("subscriptionContractId");
      return this;
    }

    
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
