package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsBalanceTransaction"));
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsAdjustmentOrderProjection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> adjustmentsOrders(
      ) {
     ShopifyPaymentsAdjustmentOrderProjection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsAdjustmentOrderProjection<>(this, getRoot());
     getFields().put("adjustmentsOrders", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> amount(
      ) {
     MoneyV2Projection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public ShopifyPaymentsAssociatedOrderProjection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> associatedOrder(
      ) {
     ShopifyPaymentsAssociatedOrderProjection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsAssociatedOrderProjection<>(this, getRoot());
     getFields().put("associatedOrder", projection);
     return projection;
  }

  public ShopifyPaymentsBalanceTransactionAssociatedPayoutProjection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> associatedPayout(
      ) {
     ShopifyPaymentsBalanceTransactionAssociatedPayoutProjection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBalanceTransactionAssociatedPayoutProjection<>(this, getRoot());
     getFields().put("associatedPayout", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> fee(
      ) {
     MoneyV2Projection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("fee", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> net(
      ) {
     MoneyV2Projection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("net", projection);
     return projection;
  }

  public ShopifyPaymentsSourceTypeProjection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> sourceType(
      ) {
     ShopifyPaymentsSourceTypeProjection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsSourceTypeProjection<>(this, getRoot());
     getFields().put("sourceType", projection);
     return projection;
  }

  public ShopifyPaymentsTransactionTypeProjection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     ShopifyPaymentsTransactionTypeProjection<ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsTransactionTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT> adjustmentReason() {
    getFields().put("adjustmentReason", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT> sourceId() {
    getFields().put("sourceId", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT> sourceOrderTransactionId(
      ) {
    getFields().put("sourceOrderTransactionId", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionFragmentProjection<PARENT, ROOT> transactionDate() {
    getFields().put("transactionDate", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopifyPaymentsBalanceTransaction {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
