package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShippingDiscountClassProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShippingDiscountClassProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShippingDiscountClass"));
  }

  public ShippingDiscountClassProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
