package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.MailingAddressInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a new address for a customer.
 */
public class CustomerAddressCreateGraphQLQuery extends GraphQLQuery {
  public CustomerAddressCreateGraphQLQuery(String customerAccessToken, MailingAddressInput address,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }if (address != null || fieldsSet.contains("address")) {
        getInput().put("address", address);
    }
  }

  public CustomerAddressCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerAddressCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerAccessToken;

    private MailingAddressInput address;

    private String queryName;

    public CustomerAddressCreateGraphQLQuery build() {
      return new CustomerAddressCreateGraphQLQuery(customerAccessToken, address, queryName, fieldsSet);
               
    }

    /**
     * The access token used to identify the customer.
     */
    public Builder customerAccessToken(String customerAccessToken) {
      this.customerAccessToken = customerAccessToken;
      this.fieldsSet.add("customerAccessToken");
      return this;
    }

    /**
     * The customer mailing address to create.
     */
    public Builder address(MailingAddressInput address) {
      this.address = address;
      this.fieldsSet.add("address");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
