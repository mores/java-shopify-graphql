package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestReceiptProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestReceiptProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayPaymentRequestReceipt"));
  }

  public ShopPayPaymentRequestReceiptProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayPaymentRequestProjection<ShopPayPaymentRequestReceiptProjection<PARENT, ROOT>, ROOT> paymentRequest(
      ) {
     ShopPayPaymentRequestProjection<ShopPayPaymentRequestReceiptProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestProjection<>(this, getRoot());
     getFields().put("paymentRequest", projection);
     return projection;
  }

  public ShopPayPaymentRequestReceiptProjection<PARENT, ROOT> processingStatusType() {
    getFields().put("processingStatusType", null);
    return this;
  }

  public ShopPayPaymentRequestReceiptProjection<PARENT, ROOT> token() {
    getFields().put("token", null);
    return this;
  }
}
