package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestDeliveryMethodProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestDeliveryMethodProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayPaymentRequestDeliveryMethod"));
  }

  public ShopPayPaymentRequestDeliveryMethodProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopPayPaymentRequestDeliveryMethodProjection<PARENT, ROOT>, ROOT> amount(
      ) {
     MoneyV2Projection<ShopPayPaymentRequestDeliveryMethodProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public ShopPayPaymentRequestDeliveryMethodProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public ShopPayPaymentRequestDeliveryMethodProjection<PARENT, ROOT> deliveryExpectationLabel() {
    getFields().put("deliveryExpectationLabel", null);
    return this;
  }

  public ShopPayPaymentRequestDeliveryMethodProjection<PARENT, ROOT> detail() {
    getFields().put("detail", null);
    return this;
  }

  public ShopPayPaymentRequestDeliveryMethodProjection<PARENT, ROOT> label() {
    getFields().put("label", null);
    return this;
  }

  public ShopPayPaymentRequestDeliveryMethodProjection<PARENT, ROOT> maxDeliveryDate() {
    getFields().put("maxDeliveryDate", null);
    return this;
  }

  public ShopPayPaymentRequestDeliveryMethodProjection<PARENT, ROOT> minDeliveryDate() {
    getFields().put("minDeliveryDate", null);
    return this;
  }
}
