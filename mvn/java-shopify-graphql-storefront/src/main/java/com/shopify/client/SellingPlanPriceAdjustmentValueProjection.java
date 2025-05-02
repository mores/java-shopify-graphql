package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanPriceAdjustmentValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanPriceAdjustmentValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanPriceAdjustmentValue"));
  }

  public SellingPlanPriceAdjustmentValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanFixedAmountPriceAdjustmentFragmentProjection<SellingPlanPriceAdjustmentValueProjection<PARENT, ROOT>, ROOT> onSellingPlanFixedAmountPriceAdjustment(
      ) {
    SellingPlanFixedAmountPriceAdjustmentFragmentProjection<SellingPlanPriceAdjustmentValueProjection<PARENT, ROOT>, ROOT> fragment = new SellingPlanFixedAmountPriceAdjustmentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SellingPlanFixedPriceAdjustmentFragmentProjection<SellingPlanPriceAdjustmentValueProjection<PARENT, ROOT>, ROOT> onSellingPlanFixedPriceAdjustment(
      ) {
    SellingPlanFixedPriceAdjustmentFragmentProjection<SellingPlanPriceAdjustmentValueProjection<PARENT, ROOT>, ROOT> fragment = new SellingPlanFixedPriceAdjustmentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SellingPlanPercentagePriceAdjustmentFragmentProjection<SellingPlanPriceAdjustmentValueProjection<PARENT, ROOT>, ROOT> onSellingPlanPercentagePriceAdjustment(
      ) {
    SellingPlanPercentagePriceAdjustmentFragmentProjection<SellingPlanPriceAdjustmentValueProjection<PARENT, ROOT>, ROOT> fragment = new SellingPlanPercentagePriceAdjustmentFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
