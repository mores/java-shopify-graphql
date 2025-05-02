package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountApplicationAllocationMethodProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountApplicationAllocationMethodProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountApplicationAllocationMethod"));
  }

  public DiscountApplicationAllocationMethodProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
