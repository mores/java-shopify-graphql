package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestReceiptEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestReceiptEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayPaymentRequestReceiptEdge"));
  }

  public ShopPayPaymentRequestReceiptEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayPaymentRequestReceiptProjection<ShopPayPaymentRequestReceiptEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ShopPayPaymentRequestReceiptProjection<ShopPayPaymentRequestReceiptEdgeProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestReceiptProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ShopPayPaymentRequestReceiptEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
