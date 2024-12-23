package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsPayoutProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsPayoutProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsPayout"));
  }

  public ShopifyPaymentsPayoutProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsBankAccountProjection<ShopifyPaymentsPayoutProjection<PARENT, ROOT>, ROOT> bankAccount(
      ) {
     ShopifyPaymentsBankAccountProjection<ShopifyPaymentsPayoutProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBankAccountProjection<>(this, getRoot());
     getFields().put("bankAccount", projection);
     return projection;
  }

  public BusinessEntityProjection<ShopifyPaymentsPayoutProjection<PARENT, ROOT>, ROOT> businessEntity(
      ) {
     BusinessEntityProjection<ShopifyPaymentsPayoutProjection<PARENT, ROOT>, ROOT> projection = new BusinessEntityProjection<>(this, getRoot());
     getFields().put("businessEntity", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutProjection<PARENT, ROOT>, ROOT> gross() {
     MoneyV2Projection<ShopifyPaymentsPayoutProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("gross", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutProjection<PARENT, ROOT>, ROOT> net() {
     MoneyV2Projection<ShopifyPaymentsPayoutProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("net", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutStatusProjection<ShopifyPaymentsPayoutProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ShopifyPaymentsPayoutStatusProjection<ShopifyPaymentsPayoutProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutSummaryProjection<ShopifyPaymentsPayoutProjection<PARENT, ROOT>, ROOT> summary(
      ) {
     ShopifyPaymentsPayoutSummaryProjection<ShopifyPaymentsPayoutProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutSummaryProjection<>(this, getRoot());
     getFields().put("summary", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutTransactionTypeProjection<ShopifyPaymentsPayoutProjection<PARENT, ROOT>, ROOT> transactionType(
      ) {
     ShopifyPaymentsPayoutTransactionTypeProjection<ShopifyPaymentsPayoutProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutTransactionTypeProjection<>(this, getRoot());
     getFields().put("transactionType", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsPayoutProjection<PARENT, ROOT> issuedAt() {
    getFields().put("issuedAt", null);
    return this;
  }

  public ShopifyPaymentsPayoutProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }
}
