package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Shopify Payments account information, including balances and payouts.
 */
public class ShopifyPaymentsAccountGraphQLQuery extends GraphQLQuery {
  public ShopifyPaymentsAccountGraphQLQuery(String queryName) {
    super("query", queryName);
  }

  public ShopifyPaymentsAccountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "shopifyPaymentsAccount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String queryName;

    public ShopifyPaymentsAccountGraphQLQuery build() {
      return new ShopifyPaymentsAccountGraphQLQuery(queryName);                                     
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
