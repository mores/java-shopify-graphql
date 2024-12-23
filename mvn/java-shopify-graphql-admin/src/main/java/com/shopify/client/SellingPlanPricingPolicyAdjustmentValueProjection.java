package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanPricingPolicyAdjustmentValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanPricingPolicyAdjustmentValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanPricingPolicyAdjustmentValue"));
  }

  public SellingPlanPricingPolicyAdjustmentValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2FragmentProjection<SellingPlanPricingPolicyAdjustmentValueProjection<PARENT, ROOT>, ROOT> onMoneyV2(
      ) {
    MoneyV2FragmentProjection<SellingPlanPricingPolicyAdjustmentValueProjection<PARENT, ROOT>, ROOT> fragment = new MoneyV2FragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SellingPlanPricingPolicyPercentageValueFragmentProjection<SellingPlanPricingPolicyAdjustmentValueProjection<PARENT, ROOT>, ROOT> onSellingPlanPricingPolicyPercentageValue(
      ) {
    SellingPlanPricingPolicyPercentageValueFragmentProjection<SellingPlanPricingPolicyAdjustmentValueProjection<PARENT, ROOT>, ROOT> fragment = new SellingPlanPricingPolicyPercentageValueFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
