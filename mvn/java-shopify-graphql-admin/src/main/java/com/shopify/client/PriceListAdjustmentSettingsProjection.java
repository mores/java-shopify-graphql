package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListAdjustmentSettingsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListAdjustmentSettingsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceListAdjustmentSettings"));
  }

  public PriceListAdjustmentSettingsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListCompareAtModeProjection<PriceListAdjustmentSettingsProjection<PARENT, ROOT>, ROOT> compareAtMode(
      ) {
     PriceListCompareAtModeProjection<PriceListAdjustmentSettingsProjection<PARENT, ROOT>, ROOT> projection = new PriceListCompareAtModeProjection<>(this, getRoot());
     getFields().put("compareAtMode", projection);
     return projection;
  }
}
