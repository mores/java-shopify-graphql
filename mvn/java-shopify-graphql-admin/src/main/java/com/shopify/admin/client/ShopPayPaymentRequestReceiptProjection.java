package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestReceiptProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestReceiptProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayPaymentRequestReceipt"));
  }

  public ShopPayPaymentRequestReceiptProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderProjection<ShopPayPaymentRequestReceiptProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<ShopPayPaymentRequestReceiptProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public ShopPayPaymentRequestProjection<ShopPayPaymentRequestReceiptProjection<PARENT, ROOT>, ROOT> paymentRequest(
      ) {
     ShopPayPaymentRequestProjection<ShopPayPaymentRequestReceiptProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestProjection<>(this, getRoot());
     getFields().put("paymentRequest", projection);
     return projection;
  }

  public ShopPayPaymentRequestReceiptProcessingStatusProjection<ShopPayPaymentRequestReceiptProjection<PARENT, ROOT>, ROOT> processingStatus(
      ) {
     ShopPayPaymentRequestReceiptProcessingStatusProjection<ShopPayPaymentRequestReceiptProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestReceiptProcessingStatusProjection<>(this, getRoot());
     getFields().put("processingStatus", projection);
     return projection;
  }

  public ShopPayPaymentRequestReceiptProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ShopPayPaymentRequestReceiptProjection<PARENT, ROOT> sourceIdentifier() {
    getFields().put("sourceIdentifier", null);
    return this;
  }

  public ShopPayPaymentRequestReceiptProjection<PARENT, ROOT> token() {
    getFields().put("token", null);
    return this;
  }
}
