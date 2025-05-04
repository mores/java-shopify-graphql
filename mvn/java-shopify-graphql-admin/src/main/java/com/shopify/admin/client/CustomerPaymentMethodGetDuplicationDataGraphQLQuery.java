package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns encrypted data that can be used to duplicate the payment method in another shop within the same organization.
 *   
 * Currently, this only supports Shop Pay payment methods. This is only available for selected partner apps.
 */
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

    /**
     * The payment method to be duplicated.
     */
    public Builder customerPaymentMethodId(String customerPaymentMethodId) {
      this.customerPaymentMethodId = customerPaymentMethodId;
      this.fieldsSet.add("customerPaymentMethodId");
      return this;
    }

    /**
     * The shop the payment method will be duplicated into.
     */
    public Builder targetShopId(String targetShopId) {
      this.targetShopId = targetShopId;
      this.fieldsSet.add("targetShopId");
      return this;
    }

    /**
     * The customer the payment method will be duplicated into.
     */
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
