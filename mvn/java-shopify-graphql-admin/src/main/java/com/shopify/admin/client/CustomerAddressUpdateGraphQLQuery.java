package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MailingAddressInput;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Update a customer's address information.
 */
public class CustomerAddressUpdateGraphQLQuery extends GraphQLQuery {
  public CustomerAddressUpdateGraphQLQuery(String customerId, String addressId,
      MailingAddressInput address, Boolean setAsDefault, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (addressId != null || fieldsSet.contains("addressId")) {
        getInput().put("addressId", addressId);
    }if (address != null || fieldsSet.contains("address")) {
        getInput().put("address", address);
    }if (setAsDefault != null || fieldsSet.contains("setAsDefault")) {
        getInput().put("setAsDefault", setAsDefault);
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

    private String customerId;

    private String addressId;

    private MailingAddressInput address;

    private Boolean setAsDefault;

    private String queryName;

    public CustomerAddressUpdateGraphQLQuery build() {
      return new CustomerAddressUpdateGraphQLQuery(customerId, addressId, address, setAsDefault, queryName, fieldsSet);
               
    }

    /**
     * The ID of the customer whose address is being updated.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    /**
     * The ID of the address to update.
     */
    public Builder addressId(String addressId) {
      this.addressId = addressId;
      this.fieldsSet.add("addressId");
      return this;
    }

    /**
     * Specifies the fields to use when updating the address.
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
