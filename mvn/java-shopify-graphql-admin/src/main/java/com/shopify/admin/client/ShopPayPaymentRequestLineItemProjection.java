package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayPaymentRequestLineItem"));
  }

  public ShopPayPaymentRequestLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<ShopPayPaymentRequestLineItemProjection<PARENT, ROOT>, ROOT> finalItemPrice(
      ) {
     MoneyV2Projection<ShopPayPaymentRequestLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("finalItemPrice", projection);
     return projection;
  }

  public MoneyV2Projection<ShopPayPaymentRequestLineItemProjection<PARENT, ROOT>, ROOT> finalLinePrice(
      ) {
     MoneyV2Projection<ShopPayPaymentRequestLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("finalLinePrice", projection);
     return projection;
  }

  public ShopPayPaymentRequestImageProjection<ShopPayPaymentRequestLineItemProjection<PARENT, ROOT>, ROOT> image(
      ) {
     ShopPayPaymentRequestImageProjection<ShopPayPaymentRequestLineItemProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public ShopPayPaymentRequestDiscountProjection<ShopPayPaymentRequestLineItemProjection<PARENT, ROOT>, ROOT> itemDiscounts(
      ) {
     ShopPayPaymentRequestDiscountProjection<ShopPayPaymentRequestLineItemProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestDiscountProjection<>(this, getRoot());
     getFields().put("itemDiscounts", projection);
     return projection;
  }

  public ShopPayPaymentRequestDiscountProjection<ShopPayPaymentRequestLineItemProjection<PARENT, ROOT>, ROOT> lineDiscounts(
      ) {
     ShopPayPaymentRequestDiscountProjection<ShopPayPaymentRequestLineItemProjection<PARENT, ROOT>, ROOT> projection = new ShopPayPaymentRequestDiscountProjection<>(this, getRoot());
     getFields().put("lineDiscounts", projection);
     return projection;
  }

  public MoneyV2Projection<ShopPayPaymentRequestLineItemProjection<PARENT, ROOT>, ROOT> originalItemPrice(
      ) {
     MoneyV2Projection<ShopPayPaymentRequestLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalItemPrice", projection);
     return projection;
  }

  public MoneyV2Projection<ShopPayPaymentRequestLineItemProjection<PARENT, ROOT>, ROOT> originalLinePrice(
      ) {
     MoneyV2Projection<ShopPayPaymentRequestLineItemProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("originalLinePrice", projection);
     return projection;
  }

  public ShopPayPaymentRequestLineItemProjection<PARENT, ROOT> label() {
    getFields().put("label", null);
    return this;
  }

  public ShopPayPaymentRequestLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public ShopPayPaymentRequestLineItemProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public ShopPayPaymentRequestLineItemProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }
}
