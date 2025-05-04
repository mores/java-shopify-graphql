package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MailingAddressInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create a new customer address.
 */
public class CustomerAddressCreateGraphQLQuery extends GraphQLQuery {
  public CustomerAddressCreateGraphQLQuery(String customerId, MailingAddressInput address,
      Boolean setAsDefault, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (address != null || fieldsSet.contains("address")) {
        getInput().put("address", address);
    }if (setAsDefault != null || fieldsSet.contains("setAsDefault")) {
        getInput().put("setAsDefault", setAsDefault);
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

    private String customerId;

    private MailingAddressInput address;

    private Boolean setAsDefault;

    private String queryName;

    public CustomerAddressCreateGraphQLQuery build() {
      return new CustomerAddressCreateGraphQLQuery(customerId, address, setAsDefault, queryName, fieldsSet);
               
    }

    /**
     * The ID of the customer.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    /**
     * Specifies the fields to use when creating the address.
     */
    public Builder address(MailingAddressInput address) {
      this.address = address;
      this.fieldsSet.add("address");
      return this;
    }

    /**
     * Whether to set the address as the customer's default address.
     */
    public Builder setAsDefault(Boolean setAsDefault) {
      this.setAsDefault = setAsDefault;
      this.fieldsSet.add("setAsDefault");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
