package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingLabelPurchaseUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingLabelPurchaseUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingLabelPurchaseUserError"));
  }

  public ShippingLabelPurchaseUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShippingLabelPurchaseUserErrorCodeProjection<ShippingLabelPurchaseUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ShippingLabelPurchaseUserErrorCodeProjection<ShippingLabelPurchaseUserErrorProjection<PARENT, ROOT>, ROOT> projection = new ShippingLabelPurchaseUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ShippingLabelPurchaseUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ShippingLabelPurchaseUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
