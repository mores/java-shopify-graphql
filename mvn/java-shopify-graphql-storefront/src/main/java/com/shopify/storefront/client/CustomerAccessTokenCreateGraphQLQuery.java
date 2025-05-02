package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CustomerAccessTokenCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a customer access token.
 * The customer access token is required to modify the customer object in any way.
 */
public class CustomerAccessTokenCreateGraphQLQuery extends GraphQLQuery {
  public CustomerAccessTokenCreateGraphQLQuery(CustomerAccessTokenCreateInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public CustomerAccessTokenCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerAccessTokenCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CustomerAccessTokenCreateInput input;

    private String queryName;

    public CustomerAccessTokenCreateGraphQLQuery build() {
      return new CustomerAccessTokenCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The fields used to create a customer access token.
     */
    public Builder input(CustomerAccessTokenCreateInput input) {
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
