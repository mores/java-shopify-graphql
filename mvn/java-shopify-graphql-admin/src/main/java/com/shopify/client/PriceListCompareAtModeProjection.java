package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListCompareAtModeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListCompareAtModeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceListCompareAtMode"));
  }

  public PriceListCompareAtModeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
