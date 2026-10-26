package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingLabelPurchaseProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingLabelPurchaseProjectionRoot() {
    super(null, null, java.util.Optional.of("ShippingLabelPurchasePayload"));
  }

  public ShippingLabelPurchaseProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShippingLabelPurchaseResultProjection<ShippingLabelPurchaseProjectionRoot<PARENT, ROOT>, ShippingLabelPurchaseProjectionRoot<PARENT, ROOT>> shippingLabelPurchaseResult(
      ) {
    ShippingLabelPurchaseResultProjection<ShippingLabelPurchaseProjectionRoot<PARENT, ROOT>, ShippingLabelPurchaseProjectionRoot<PARENT, ROOT>> projection = new ShippingLabelPurchaseResultProjection<>(this, this);    
    getFields().put("shippingLabelPurchaseResult", projection);
    return projection;
  }

  public ShippingLabelPurchaseUserErrorProjection<ShippingLabelPurchaseProjectionRoot<PARENT, ROOT>, ShippingLabelPurchaseProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ShippingLabelPurchaseUserErrorProjection<ShippingLabelPurchaseProjectionRoot<PARENT, ROOT>, ShippingLabelPurchaseProjectionRoot<PARENT, ROOT>> projection = new ShippingLabelPurchaseUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
