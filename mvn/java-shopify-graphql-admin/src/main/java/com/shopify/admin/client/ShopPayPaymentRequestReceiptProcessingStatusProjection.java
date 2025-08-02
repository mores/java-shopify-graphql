package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestReceiptProcessingStatusProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestReceiptProcessingStatusProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayPaymentRequestReceiptProcessingStatus"));
  }

  public ShopPayPaymentRequestReceiptProcessingStatusProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayPaymentRequestReceiptProcessingStatusErrorCodeProjection<ShopPayPaymentRequestReceiptProcessingStatusProjection<PARENT, ROOT>, ROOT> errorCode(
      ) {
     ShopPayPaymentRequestReceiptProcessingStatusErrorCodeProjection<ShopPayPaymentRequestReceiptProcessingStatusProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestReceiptProcessingStatusErrorCodeProjection<>(this, getRoot());
     getFields().put("errorCode", projection);
     return projection;
  }

  public ShopPayPaymentRequestReceiptProcessingStatusStateProjection<ShopPayPaymentRequestReceiptProcessingStatusProjection<PARENT, ROOT>, ROOT> state(
      ) {
     ShopPayPaymentRequestReceiptProcessingStatusStateProjection<ShopPayPaymentRequestReceiptProcessingStatusProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestReceiptProcessingStatusStateProjection<>(this, getRoot());
     getFields().put("state", projection);
     return projection;
  }

  public ShopPayPaymentRequestReceiptProcessingStatusProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
