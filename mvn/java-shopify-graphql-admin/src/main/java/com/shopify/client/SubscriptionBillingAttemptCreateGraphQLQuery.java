package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.SubscriptionBillingAttemptInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


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

    private String subscriptionContractId;

    private SubscriptionBillingAttemptInput subscriptionBillingAttemptInput;

    private String queryName;

    public SubscriptionBillingAttemptCreateGraphQLQuery build() {
      return new SubscriptionBillingAttemptCreateGraphQLQuery(subscriptionContractId, subscriptionBillingAttemptInput, queryName, fieldsSet);
               
    }

    
    public Builder subscriptionContractId(String subscriptionContractId) {
      this.subscriptionContractId = subscriptionContractId;
      this.fieldsSet.add("subscriptionContractId");
      return this;
    }

    
    public Builder subscriptionBillingAttemptInput(
        SubscriptionBillingAttemptInput subscriptionBillingAttemptInput) {
      this.subscriptionBillingAttemptInput = subscriptionBillingAttemptInput;
      this.fieldsSet.add("subscriptionBillingAttemptInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
