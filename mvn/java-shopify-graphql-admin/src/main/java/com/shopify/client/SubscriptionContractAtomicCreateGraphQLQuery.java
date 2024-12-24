package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.SubscriptionContractAtomicCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class SubscriptionContractAtomicCreateGraphQLQuery extends GraphQLQuery {
  public SubscriptionContractAtomicCreateGraphQLQuery(SubscriptionContractAtomicCreateInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SubscriptionContractAtomicCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionContractAtomicCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SubscriptionContractAtomicCreateInput input;

    private String queryName;

    public SubscriptionContractAtomicCreateGraphQLQuery build() {
      return new SubscriptionContractAtomicCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    
    public Builder input(SubscriptionContractAtomicCreateInput input) {
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
