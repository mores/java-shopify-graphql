package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountApplicationLevelProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountApplicationLevelProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountApplicationLevel"));
  }

  public DiscountApplicationLevelProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
