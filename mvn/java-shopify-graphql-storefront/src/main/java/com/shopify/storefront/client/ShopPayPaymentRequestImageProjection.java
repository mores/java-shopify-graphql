package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestImageProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestImageProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayPaymentRequestImage"));
  }

  public ShopPayPaymentRequestImageProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayPaymentRequestImageProjection<PARENT, ROOT> alt() {
    getFields().put("alt", null);
    return this;
  }

  public ShopPayPaymentRequestImageProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
