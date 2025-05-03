package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates the default address of an existing customer.
 */
public class CustomerDefaultAddressUpdateGraphQLQuery extends GraphQLQuery {
  public CustomerDefaultAddressUpdateGraphQLQuery(String addressId, String customerAccessToken,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (addressId != null || fieldsSet.contains("addressId")) {
        getInput().put("addressId", addressId);
    }if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }
  }

  public CustomerDefaultAddressUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerDefaultAddressUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String addressId;

    private String customerAccessToken;

    private String queryName;

    public CustomerDefaultAddressUpdateGraphQLQuery build() {
      return new CustomerDefaultAddressUpdateGraphQLQuery(addressId, customerAccessToken, queryName, fieldsSet);
               
    }

    /**
     * ID of the address to set as the new default for the customer.
     */
    public Builder addressId(String addressId) {
      this.addressId = addressId;
      this.fieldsSet.add("addressId");
      return this;
    }

    /**
     * The access token used to identify the customer.
     */
    public Builder customerAccessToken(String customerAccessToken) {
      this.customerAccessToken = customerAccessToken;
      this.fieldsSet.add("customerAccessToken");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
