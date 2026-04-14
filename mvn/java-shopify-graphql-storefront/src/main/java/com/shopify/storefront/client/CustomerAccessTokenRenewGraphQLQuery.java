package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Extends the validity of a [`CustomerAccessToken`](https://shopify.dev/docs/api/storefront/current/objects/CustomerAccessToken)
 * before it expires. The renewed token maintains authenticated access to
 * customer operations.
 *   
 * Renewal must happen before the token's [`expiresAt`](https://shopify.dev/docs/api/storefront/current/objects/CustomerAccessToken#field-CustomerAccessToken.fields.expiresAt)
 * time. If a token has already expired, then use [`customerAccessTokenCreate`](https://shopify.dev/docs/api/storefront/current/mutations/customerAccessTokenCreate)
 * to generate a new token with the customer's credentials.
 *   
 * > Caution:
 * > Store access tokens securely. Never store tokens in plain text or insecure
 * locations, and avoid exposing them in URLs or logs.
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
