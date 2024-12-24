package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CustomerPaymentMethodRevokeGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodRevokeGraphQLQuery(String customerPaymentMethodId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerPaymentMethodId != null || fieldsSet.contains("customerPaymentMethodId")) {
        getInput().put("customerPaymentMethodId", customerPaymentMethodId);
    }
  }

  public CustomerPaymentMethodRevokeGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodRevoke";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerPaymentMethodId;

    private String queryName;

    public CustomerPaymentMethodRevokeGraphQLQuery build() {
      return new CustomerPaymentMethodRevokeGraphQLQuery(customerPaymentMethodId, queryName, fieldsSet);
               
    }

    
    public Builder customerPaymentMethodId(String customerPaymentMethodId) {
      this.customerPaymentMethodId = customerPaymentMethodId;
      this.fieldsSet.add("customerPaymentMethodId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
