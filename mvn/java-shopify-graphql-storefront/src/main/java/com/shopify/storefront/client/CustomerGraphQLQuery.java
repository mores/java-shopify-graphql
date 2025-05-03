package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The customer associated with the given access token. Tokens are obtained by using the
 * [`customerAccessTokenCreate` mutation](https://shopify.dev/docs/api/storefront/latest/mutations/customerAccessTokenCreate).
 */
public class CustomerGraphQLQuery extends GraphQLQuery {
  public CustomerGraphQLQuery(String customerAccessToken, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }
  }

  public CustomerGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "customer";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerAccessToken;

    private String queryName;

    public CustomerGraphQLQuery build() {
      return new CustomerGraphQLQuery(customerAccessToken, queryName, fieldsSet);
               
    }

    /**
     * The customer access token.
     */
    public Builder customerAccessToken(String customerAccessToken) {
      this.customerAccessToken = customerAccessToken;
      this.fieldsSet.add("customerAccessToken");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
