package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a customer's address.
 */
public class CustomerAddressDeleteGraphQLQuery extends GraphQLQuery {
  public CustomerAddressDeleteGraphQLQuery(String customerId, String addressId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerId != null || fieldsSet.contains("customerId")) {
        getInput().put("customerId", customerId);
    }if (addressId != null || fieldsSet.contains("addressId")) {
        getInput().put("addressId", addressId);
    }
  }

  public CustomerAddressDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerAddressDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerId;

    private String addressId;

    private String queryName;

    public CustomerAddressDeleteGraphQLQuery build() {
      return new CustomerAddressDeleteGraphQLQuery(customerId, addressId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the customer whose address is being deleted.
     */
    public Builder customerId(String customerId) {
      this.customerId = customerId;
      this.fieldsSet.add("customerId");
      return this;
    }

    /**
     * The ID of the address to be deleted from the customer.
     */
    public Builder addressId(String addressId) {
      this.addressId = addressId;
      this.fieldsSet.add("addressId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
