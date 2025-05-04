package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsBalanceTransactionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsBalanceTransactionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsBalanceTransaction"));
  }

  public ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsAdjustmentOrderProjection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> adjustmentsOrders(
      ) {
     ShopifyPaymentsAdjustmentOrderProjection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsAdjustmentOrderProjection<>(this, getRoot());
     getFields().put("adjustmentsOrders", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> amount(
      ) {
     MoneyV2Projection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public ShopifyPaymentsAssociatedOrderProjection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> associatedOrder(
      ) {
     ShopifyPaymentsAssociatedOrderProjection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsAssociatedOrderProjection<>(this, getRoot());
     getFields().put("associatedOrder", projection);
     return projection;
  }

  public ShopifyPaymentsBalanceTransactionAssociatedPayoutProjection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> associatedPayout(
      ) {
     ShopifyPaymentsBalanceTransactionAssociatedPayoutProjection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBalanceTransactionAssociatedPayoutProjection<>(this, getRoot());
     getFields().put("associatedPayout", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> fee() {
     MoneyV2Projection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("fee", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> net() {
     MoneyV2Projection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("net", projection);
     return projection;
  }

  public ShopifyPaymentsSourceTypeProjection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> sourceType(
      ) {
     ShopifyPaymentsSourceTypeProjection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsSourceTypeProjection<>(this, getRoot());
     getFields().put("sourceType", projection);
     return projection;
  }

  public ShopifyPaymentsTransactionTypeProjection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> type(
      ) {
     ShopifyPaymentsTransactionTypeProjection<ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsTransactionTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT> adjustmentReason() {
    getFields().put("adjustmentReason", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT> sourceId() {
    getFields().put("sourceId", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT> sourceOrderTransactionId() {
    getFields().put("sourceOrderTransactionId", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionProjection<PARENT, ROOT> transactionDate() {
    getFields().put("transactionDate", null);
    return this;
  }
}
