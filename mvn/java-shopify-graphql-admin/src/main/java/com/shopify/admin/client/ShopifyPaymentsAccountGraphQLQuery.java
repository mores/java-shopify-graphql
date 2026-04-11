package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the Shopify Payments account information for the shop. Includes
 * current balances across all currencies, payout schedules, and bank account
 * configurations.
 *   
 * The account includes [`ShopifyPaymentsBalanceTransaction`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ShopifyPaymentsBalanceTransaction)
 * records showing charges, refunds, and adjustments that affect your balance. Also includes [`ShopifyPaymentsDispute`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ShopifyPaymentsDispute) records and [`ShopifyPaymentsPayout`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ShopifyPaymentsPayout)
 * history between the account and connected [`ShopifyPaymentsBankAccount`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ShopifyPaymentsBankAccount)
 * configurations.
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
