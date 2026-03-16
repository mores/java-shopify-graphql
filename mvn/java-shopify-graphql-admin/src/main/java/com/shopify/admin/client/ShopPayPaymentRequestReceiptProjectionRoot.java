package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestReceiptProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestReceiptProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopPayPaymentRequestReceipt"));
  }

  public ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderProjection<ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public ShopPayPaymentRequestProjection<ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT>> paymentRequest(
      ) {
    ShopPayPaymentRequestProjection<ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT>> projection = new ShopPayPaymentRequestProjection<>(this, this);    
    getFields().put("paymentRequest", projection);
    return projection;
  }

  public ShopPayPaymentRequestReceiptProcessingStatusProjection<ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT>> processingStatus(
      ) {
    ShopPayPaymentRequestReceiptProcessingStatusProjection<ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT>> projection = new ShopPayPaymentRequestReceiptProcessingStatusProjection<>(this, this);    
    getFields().put("processingStatus", projection);
    return projection;
  }

  public ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT> sourceIdentifier() {
    getFields().put("sourceIdentifier", null);
    return this;
  }

  public ShopPayPaymentRequestReceiptProjectionRoot<PARENT, ROOT> token() {
    getFields().put("token", null);
    return this;
  }
}
