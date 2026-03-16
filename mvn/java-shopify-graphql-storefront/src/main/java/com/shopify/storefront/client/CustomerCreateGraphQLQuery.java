package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CustomerCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a new [`Customer`](https://shopify.dev/docs/api/storefront/current/objects/Customer)
 * account with the provided contact information and login credentials. The
 * customer can then sign in for things such as accessing their account, viewing
 * order history, and managing saved addresses.
 *   
 * > Caution:
 * > This mutation creates customer credentials. Ensure passwords are collected
 * securely and never logged or exposed in client-side code.
 */
public class CustomerCreateGraphQLQuery extends GraphQLQuery {
  public CustomerCreateGraphQLQuery(CustomerCreateInput input, String queryName,
      Set<String> fieldsSet) {
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

    private CustomerCreateInput input;

    private String queryName;

    public CustomerCreateGraphQLQuery build() {
      return new CustomerCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The fields used to create a new customer.
     */
    public Builder input(CustomerCreateInput input) {
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
