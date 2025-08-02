package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestReceiptProcessingStatusErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestReceiptProcessingStatusErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayPaymentRequestReceiptProcessingStatusErrorCode"));
  }

  public ShopPayPaymentRequestReceiptProcessingStatusErrorCodeProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }
}
