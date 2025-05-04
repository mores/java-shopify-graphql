package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsBalanceTransactionAssociatedPayoutProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsBalanceTransactionAssociatedPayoutProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsBalanceTransactionAssociatedPayout"));
  }

  public ShopifyPaymentsBalanceTransactionAssociatedPayoutProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsBalanceTransactionPayoutStatusProjection<ShopifyPaymentsBalanceTransactionAssociatedPayoutProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ShopifyPaymentsBalanceTransactionPayoutStatusProjection<ShopifyPaymentsBalanceTransactionAssociatedPayoutProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBalanceTransactionPayoutStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ShopifyPaymentsBalanceTransactionAssociatedPayoutProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
