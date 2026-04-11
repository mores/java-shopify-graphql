package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a [`CustomerAccessToken`](https://shopify.dev/docs/api/storefront/current/objects/CustomerAccessToken) using a [multipass token](https://shopify.dev/docs/api/multipass) instead of
 * email and password. This enables single sign-on for customers who authenticate
 * through an external system.
 *   
 * If the customer doesn't exist in Shopify, then a new customer record is
 * created automatically. If the customer exists but the record is disabled, then
 * the customer record is re-enabled.
 *   
 * > Caution:
 * > Multipass tokens are only valid for 15 minutes and can only be used once.
 * Generate tokens on-the-fly when needed rather than in advance.
 */
public class CustomerAccessTokenCreateWithMultipassGraphQLQuery extends GraphQLQuery {
  public CustomerAccessTokenCreateWithMultipassGraphQLQuery(String multipassToken, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (multipassToken != null || fieldsSet.contains("multipassToken")) {
        getInput().put("multipassToken", multipassToken);
    }
  }

  public CustomerAccessTokenCreateWithMultipassGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "customerAccessTokenCreateWithMultipass";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String multipassToken;

    private String queryName;

    public CustomerAccessTokenCreateWithMultipassGraphQLQuery build() {
      return new CustomerAccessTokenCreateWithMultipassGraphQLQuery(multipassToken, queryName, fieldsSet);
               
    }

    /**
     * A valid [multipass token](https://shopify.dev/api/multipass) to be authenticated.
     */
    public Builder multipassToken(String multipassToken) {
      this.multipassToken = multipassToken;
      this.fieldsSet.add("multipassToken");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
