package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Renews a customer access token.
 *   
 * Access token renewal must happen *before* a token expires.
 * If a token has already expired, a new one should be created instead via `customerAccessTokenCreate`.
 */
public class CustomerAccessTokenRenewGraphQLQuery extends GraphQLQuery {
  public CustomerAccessTokenRenewGraphQLQuery(String customerAccessToken, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (customerAccessToken != null || fieldsSet.contains("customerAccessToken")) {
        getInput().put("customerAccessToken", customerAccessToken);
    }
  }

  public CustomerAccessTokenRenewGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerAccessTokenRenew";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String customerAccessToken;

    private String queryName;

    public CustomerAccessTokenRenewGraphQLQuery build() {
      return new CustomerAccessTokenRenewGraphQLQuery(customerAccessToken, queryName, fieldsSet);
               
    }

    /**
     * The access token used to identify the customer.
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
