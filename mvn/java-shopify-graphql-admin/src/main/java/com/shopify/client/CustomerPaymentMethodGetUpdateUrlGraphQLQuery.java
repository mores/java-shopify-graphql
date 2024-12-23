package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a URL that allows the customer to update a specific payment method.
 *   
 * Currently, `customerPaymentMethodGetUpdateUrl` only supports Shop Pay.
 */
public class CustomerPaymentMethodGetUpdateUrlGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodGetUpdateUrlGraphQLQuery(String customerPaymentMethodId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerPaymentMethodId != null || fieldsSet.contains("customerPaymentMethodId")) {
        getInput().put("customerPaymentMethodId", customerPaymentMethodId);
    }
  }

  public CustomerPaymentMethodGetUpdateUrlGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethodGetUpdateUrl";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerPaymentMethodId;

    private String queryName;

    public CustomerPaymentMethodGetUpdateUrlGraphQLQuery build() {
      return new CustomerPaymentMethodGetUpdateUrlGraphQLQuery(customerPaymentMethodId, queryName, fieldsSet);
               
    }

    /**
     * The payment method to be updated.
     */
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
