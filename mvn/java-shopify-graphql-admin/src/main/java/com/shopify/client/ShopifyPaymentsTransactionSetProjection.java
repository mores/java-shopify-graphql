package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopifyPaymentsTransactionSetProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopifyPaymentsTransactionSetProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsTransactionSet"));
  }

  public ShopifyPaymentsTransactionSetProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsExtendedAuthorizationProjection<ShopifyPaymentsTransactionSetProjection<PARENT, ROOT>, ROOT> extendedAuthorizationSet(
      ) {
     ShopifyPaymentsExtendedAuthorizationProjection<ShopifyPaymentsTransactionSetProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsExtendedAuthorizationProjection<>(this, getRoot());
     getFields().put("extendedAuthorizationSet", projection);
     return projection;
  }

  public ShopifyPaymentsRefundSetProjection<ShopifyPaymentsTransactionSetProjection<PARENT, ROOT>, ROOT> refundSet(
      ) {
     ShopifyPaymentsRefundSetProjection<ShopifyPaymentsTransactionSetProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsRefundSetProjection<>(this, getRoot());
     getFields().put("refundSet", projection);
     return projection;
  }
}
