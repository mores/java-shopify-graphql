package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CurrencyCode;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates an alternate currency payout for a Shopify Payments account.
 */
public class ShopifyPaymentsPayoutAlternateCurrencyCreateGraphQLQuery extends GraphQLQuery {
  public ShopifyPaymentsPayoutAlternateCurrencyCreateGraphQLQuery(String accountId,
      CurrencyCode currency, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (accountId != null || fieldsSet.contains("accountId")) {
        getInput().put("accountId", accountId);
    }if (currency != null || fieldsSet.contains("currency")) {
        getInput().put("currency", currency);
    }
  }

  public ShopifyPaymentsPayoutAlternateCurrencyCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shopifyPaymentsPayoutAlternateCurrencyCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String accountId;

    private CurrencyCode currency;

    private String queryName;

    public ShopifyPaymentsPayoutAlternateCurrencyCreateGraphQLQuery build() {
      return new ShopifyPaymentsPayoutAlternateCurrencyCreateGraphQLQuery(accountId, currency, queryName, fieldsSet);
               
    }

    /**
     * The ID of the Shopify Payments account on which the mutation is being performed.
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      this.fieldsSet.add("accountId");
      return this;
    }

    /**
     * The currency of the balance to payout.
     */
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      this.fieldsSet.add("currency");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
