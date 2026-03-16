package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.CustomerAccessTokenCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * For legacy customer accounts only.
 *   
 * Creates a [`CustomerAccessToken`](https://shopify.dev/docs/api/storefront/current/objects/CustomerAccessToken) using the customer's email and password. The access token is required to read or modify the
 * [`Customer`](https://shopify.dev/docs/api/storefront/current/objects/Customer)
 * object, such as updating account information or managing addresses.
 *   
 * The token has an expiration time. Use [`customerAccessTokenRenew`](https://shopify.dev/docs/api/storefront/current/mutations/customerAccessTokenRenew)
 * to extend the token before it expires, or create a new token if it's already expired.
 *   
 * > Caution:
 * > This mutation handles customer credentials. Always transmit requests over HTTPS and never log or expose the password.
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
