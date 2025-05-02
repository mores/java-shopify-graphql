package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestSessionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestSessionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayPaymentRequestSession"));
  }

  public ShopPayPaymentRequestSessionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayPaymentRequestProjection<ShopPayPaymentRequestSessionProjection<PARENT, ROOT>, ROOT> paymentRequest(
      ) {
     ShopPayPaymentRequestProjection<ShopPayPaymentRequestSessionProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestProjection<>(this, getRoot());
     getFields().put("paymentRequest", projection);
     return projection;
  }

  public ShopPayPaymentRequestSessionProjection<PARENT, ROOT> checkoutUrl() {
    getFields().put("checkoutUrl", null);
    return this;
  }

  public ShopPayPaymentRequestSessionProjection<PARENT, ROOT> sourceIdentifier() {
    getFields().put("sourceIdentifier", null);
    return this;
  }

  public ShopPayPaymentRequestSessionProjection<PARENT, ROOT> token() {
    getFields().put("token", null);
    return this;
  }
}
