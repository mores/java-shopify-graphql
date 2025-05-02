package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.MailingAddressInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates the address of an existing customer.
 */
public class CustomerAddressUpdateGraphQLQuery extends GraphQLQuery {
  public CustomerAddressUpdateGraphQLQuery(MailingAddressInput address, String customerAccessToken,
      String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (address != null || fieldsSet.contains("address")) {
        getInput().put("address", address);
    }if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public CustomerAddressUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerAddressUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MailingAddressInput address;

    private String customerAccessToken;

    private String id;

    private String queryName;

    public CustomerAddressUpdateGraphQLQuery build() {
      return new CustomerAddressUpdateGraphQLQuery(address, customerAccessToken, id, queryName, fieldsSet);
               
    }

    /**
     * The customer’s mailing address.
     */
    public Builder address(MailingAddressInput address) {
      this.address = address;
      this.fieldsSet.add("address");
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

    /**
     * Specifies the customer address to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
