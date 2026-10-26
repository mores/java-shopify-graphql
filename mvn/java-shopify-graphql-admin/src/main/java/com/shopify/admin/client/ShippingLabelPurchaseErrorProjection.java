package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingLabelPurchaseErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingLabelPurchaseErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingLabelPurchaseError"));
  }

  public ShippingLabelPurchaseErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShippingLabelPurchaseErrorCodeProjection<ShippingLabelPurchaseErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     ShippingLabelPurchaseErrorCodeProjection<ShippingLabelPurchaseErrorProjection<PARENT, ROOT>, ROOT> projection = new ShippingLabelPurchaseErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public ShippingLabelPurchaseErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public ShippingLabelPurchaseErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
