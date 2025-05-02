package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestShippingLineProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestShippingLineProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayPaymentRequestShippingLine"));
  }

  public ShopPayPaymentRequestShippingLineProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopPayPaymentRequestShippingLineProjection<PARENT, ROOT>, ROOT> amount(
      ) {
     MoneyV2Projection<ShopPayPaymentRequestShippingLineProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public ShopPayPaymentRequestShippingLineProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public ShopPayPaymentRequestShippingLineProjection<PARENT, ROOT> label() {
    getFields().put("label", null);
    return this;
  }
}
