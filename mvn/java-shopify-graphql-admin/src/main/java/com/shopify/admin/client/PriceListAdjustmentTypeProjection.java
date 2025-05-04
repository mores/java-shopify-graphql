package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListAdjustmentTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListAdjustmentTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceListAdjustmentType"));
  }

  public PriceListAdjustmentTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
