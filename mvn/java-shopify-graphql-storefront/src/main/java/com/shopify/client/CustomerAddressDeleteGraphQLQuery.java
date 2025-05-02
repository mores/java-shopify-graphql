package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Permanently deletes the address of an existing customer.
 */
public class CustomerAddressDeleteGraphQLQuery extends GraphQLQuery {
  public CustomerAddressDeleteGraphQLQuery(String customerAccessToken, String id, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
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

    private String customerAccessToken;

    private String id;

    private String queryName;

    public CustomerAddressDeleteGraphQLQuery build() {
      return new CustomerAddressDeleteGraphQLQuery(customerAccessToken, id, queryName, fieldsSet);
               
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
     * Specifies the address to delete.
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
