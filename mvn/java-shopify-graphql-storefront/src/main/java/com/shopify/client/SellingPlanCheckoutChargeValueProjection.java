package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanCheckoutChargeValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanCheckoutChargeValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanCheckoutChargeValue"));
  }

  public SellingPlanCheckoutChargeValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2FragmentProjection<SellingPlanCheckoutChargeValueProjection<PARENT, ROOT>, ROOT> onMoneyV2(
      ) {
    MoneyV2FragmentProjection<SellingPlanCheckoutChargeValueProjection<PARENT, ROOT>, ROOT> fragment = new MoneyV2FragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SellingPlanCheckoutChargePercentageValueFragmentProjection<SellingPlanCheckoutChargeValueProjection<PARENT, ROOT>, ROOT> onSellingPlanCheckoutChargePercentageValue(
      ) {
    SellingPlanCheckoutChargePercentageValueFragmentProjection<SellingPlanCheckoutChargeValueProjection<PARENT, ROOT>, ROOT> fragment = new SellingPlanCheckoutChargePercentageValueFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
