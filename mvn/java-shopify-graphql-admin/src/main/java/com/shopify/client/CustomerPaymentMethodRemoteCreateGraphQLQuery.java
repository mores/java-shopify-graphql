package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.CustomerPaymentMethodRemoteInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CustomerPaymentMethodRemoteCreateGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodRemoteCreateGraphQLQuery(String customerId,
      CustomerPaymentMethodRemoteInput remoteReference, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (remoteReference != null || fieldsSet.contains("remoteReference")) {
        getInput().put("remoteReference", remoteReference);
    }
  }

  public CustomerPaymentMethodRemoteCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodRemoteCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerId;

    private CustomerPaymentMethodRemoteInput remoteReference;

    private String queryName;

    public CustomerPaymentMethodRemoteCreateGraphQLQuery build() {
      return new CustomerPaymentMethodRemoteCreateGraphQLQuery(customerId, remoteReference, queryName, fieldsSet);
               
    }

    
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    
    public Builder remoteReference(CustomerPaymentMethodRemoteInput remoteReference) {
      this.remoteReference = remoteReference;
      this.fieldsSet.add("remoteReference");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
