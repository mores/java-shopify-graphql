package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanPriceAdjustmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanPriceAdjustmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanPriceAdjustment"));
  }

  public SellingPlanPriceAdjustmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanPriceAdjustmentValueProjection<SellingPlanPriceAdjustmentProjection<PARENT, ROOT>, ROOT> adjustmentValue(
      ) {
     SellingPlanPriceAdjustmentValueProjection<SellingPlanPriceAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanPriceAdjustmentValueProjection<>(this, getRoot());
     getFields().put("adjustmentValue", projection);
     return projection;
  }

  public SellingPlanPriceAdjustmentProjection<PARENT, ROOT> orderCount() {
    getFields().put("orderCount", null);
    return this;
  }
}
