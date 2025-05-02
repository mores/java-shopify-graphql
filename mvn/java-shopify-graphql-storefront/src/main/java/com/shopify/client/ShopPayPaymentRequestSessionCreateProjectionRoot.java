package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestSessionCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestSessionCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopPayPaymentRequestSessionCreatePayload"));
  }

  public ShopPayPaymentRequestSessionCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayPaymentRequestSessionProjection<ShopPayPaymentRequestSessionCreateProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestSessionCreateProjectionRoot<PARENT, ROOT>> shopPayPaymentRequestSession(
      ) {
    ShopPayPaymentRequestSessionProjection<ShopPayPaymentRequestSessionCreateProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestSessionCreateProjectionRoot<PARENT, ROOT>> projection = new ShopPayPaymentRequestSessionProjection<>(this, this);    
    getFields().put("shopPayPaymentRequestSession", projection);
    return projection;
  }

  public UserErrorsShopPayPaymentRequestSessionUserErrorsProjection<ShopPayPaymentRequestSessionCreateProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestSessionCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorsShopPayPaymentRequestSessionUserErrorsProjection<ShopPayPaymentRequestSessionCreateProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestSessionCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorsShopPayPaymentRequestSessionUserErrorsProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
