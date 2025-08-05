package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a Shop Pay payment request receipt.
 */
public class ShopPayPaymentRequestReceiptGraphQLQuery extends GraphQLQuery {
  public ShopPayPaymentRequestReceiptGraphQLQuery(String token, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (token != null || fieldsSet.contains("token")) {
        getInput().put("token", token);
    }
  }

  public ShopPayPaymentRequestReceiptGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "shopPayPaymentRequestReceipt";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String token;

    private String queryName;

    public ShopPayPaymentRequestReceiptGraphQLQuery build() {
      return new ShopPayPaymentRequestReceiptGraphQLQuery(token, queryName, fieldsSet);
               
    }

    /**
     * Unique identifier of the payment request receipt.
     */
    public Builder token(String token) {
      this.token = token;
      this.fieldsSet.add("token");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
