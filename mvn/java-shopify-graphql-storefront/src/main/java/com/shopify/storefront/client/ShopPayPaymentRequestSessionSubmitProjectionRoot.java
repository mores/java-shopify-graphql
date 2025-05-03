package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestSessionSubmitProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestSessionSubmitProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopPayPaymentRequestSessionSubmitPayload"));
  }

  public ShopPayPaymentRequestSessionSubmitProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayPaymentRequestReceiptProjection<ShopPayPaymentRequestSessionSubmitProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestSessionSubmitProjectionRoot<PARENT, ROOT>> paymentRequestReceipt(
      ) {
    ShopPayPaymentRequestReceiptProjection<ShopPayPaymentRequestSessionSubmitProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestSessionSubmitProjectionRoot<PARENT, ROOT>> projection = new ShopPayPaymentRequestReceiptProjection<>(this, this);    
    getFields().put("paymentRequestReceipt", projection);
    return projection;
  }

  public UserErrorsShopPayPaymentRequestSessionUserErrorsProjection<ShopPayPaymentRequestSessionSubmitProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestSessionSubmitProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorsShopPayPaymentRequestSessionUserErrorsProjection<ShopPayPaymentRequestSessionSubmitProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestSessionSubmitProjectionRoot<PARENT, ROOT>> projection = new UserErrorsShopPayPaymentRequestSessionUserErrorsProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
