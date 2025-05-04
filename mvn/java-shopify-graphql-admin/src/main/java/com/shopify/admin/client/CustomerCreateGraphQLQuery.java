package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CustomerInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create a new customer. As of API version 2022-10, apps using protected
 * customer data must meet the protected customer data [requirements](https://shopify.dev/apps/store/data-protection/protected-customer-data).
 */
public class CustomerCreateGraphQLQuery extends GraphQLQuery {
  public CustomerCreateGraphQLQuery(CustomerInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CustomerCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CustomerInput input;

    private String queryName;

    public CustomerCreateGraphQLQuery build() {
      return new CustomerCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields to create a customer.
     */
    public Builder input(CustomerInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
