package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListParentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListParentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceListParent"));
  }

  public PriceListParentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListAdjustmentProjection<PriceListParentProjection<PARENT, ROOT>, ROOT> adjustment() {
     PriceListAdjustmentProjection<PriceListParentProjection<PARENT, ROOT>, ROOT> projection = new PriceListAdjustmentProjection<>(this, getRoot());
     getFields().put("adjustment", projection);
     return projection;
  }

  public PriceListAdjustmentSettingsProjection<PriceListParentProjection<PARENT, ROOT>, ROOT> settings(
      ) {
     PriceListAdjustmentSettingsProjection<PriceListParentProjection<PARENT, ROOT>, ROOT> projection = new PriceListAdjustmentSettingsProjection<>(this, getRoot());
     getFields().put("settings", projection);
     return projection;
  }
}
