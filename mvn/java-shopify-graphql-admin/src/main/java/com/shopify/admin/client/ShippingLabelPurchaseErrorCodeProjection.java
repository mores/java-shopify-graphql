package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingLabelPurchaseErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingLabelPurchaseErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingLabelPurchaseErrorCode"));
  }

  public ShippingLabelPurchaseErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
