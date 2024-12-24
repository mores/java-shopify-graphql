package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CustomerPaymentMethodGetDuplicationDataGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodGetDuplicationDataGraphQLQuery(String customerPaymentMethodId,
      String targetShopId, String targetCustomerId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerPaymentMethodId != null || fieldsSet.contains("customerPaymentMethodId")) {
        getInput().put("customerPaymentMethodId", customerPaymentMethodId);
    }if (targetShopId != null || fieldsSet.contains("targetShopId")) {
        getInput().put("targetShopId", targetShopId);
    }if (targetCustomerId != null || fieldsSet.contains("targetCustomerId")) {
        getInput().put("targetCustomerId", targetCustomerId);
    }
  }

  public CustomerPaymentMethodGetDuplicationDataGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodGetDuplicationData";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerPaymentMethodId;

    private String targetShopId;

    private String targetCustomerId;

    private String queryName;

    public CustomerPaymentMethodGetDuplicationDataGraphQLQuery build() {
      return new CustomerPaymentMethodGetDuplicationDataGraphQLQuery(customerPaymentMethodId, targetShopId, targetCustomerId, queryName, fieldsSet);
               
    }

    
    public Builder customerPaymentMethodId(String customerPaymentMethodId) {
      this.customerPaymentMethodId = customerPaymentMethodId;
      this.fieldsSet.add("customerPaymentMethodId");
      return this;
    }

    
    public Builder targetShopId(String targetShopId) {
      this.targetShopId = targetShopId;
      this.fieldsSet.add("targetShopId");
      return this;
    }

    
    public Builder targetCustomerId(String targetCustomerId) {
      this.targetCustomerId = targetCustomerId;
      this.fieldsSet.add("targetCustomerId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
