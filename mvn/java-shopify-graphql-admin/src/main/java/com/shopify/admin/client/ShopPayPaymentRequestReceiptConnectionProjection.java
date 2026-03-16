package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestReceiptConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestReceiptConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayPaymentRequestReceiptConnection"));
  }

  public ShopPayPaymentRequestReceiptConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayPaymentRequestReceiptEdgeProjection<ShopPayPaymentRequestReceiptConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ShopPayPaymentRequestReceiptEdgeProjection<ShopPayPaymentRequestReceiptConnectionProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestReceiptEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ShopPayPaymentRequestReceiptProjection<ShopPayPaymentRequestReceiptConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ShopPayPaymentRequestReceiptProjection<ShopPayPaymentRequestReceiptConnectionProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestReceiptProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ShopPayPaymentRequestReceiptConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ShopPayPaymentRequestReceiptConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
