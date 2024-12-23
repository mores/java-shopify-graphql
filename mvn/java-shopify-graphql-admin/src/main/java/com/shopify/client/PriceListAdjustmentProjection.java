package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListAdjustmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListAdjustmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceListAdjustment"));
  }

  public PriceListAdjustmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListAdjustmentTypeProjection<PriceListAdjustmentProjection<PARENT, ROOT>, ROOT> type(
      ) {
     PriceListAdjustmentTypeProjection<PriceListAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new PriceListAdjustmentTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public PriceListAdjustmentProjection<PARENT, ROOT> value() {
    getFields().put("value", null);
    return this;
  }
}
