package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountApplicationTargetSelectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountApplicationTargetSelectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountApplicationTargetSelection"));
  }

  public DiscountApplicationTargetSelectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
