package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PricingValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PricingValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PricingValue"));
  }

  public PricingValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2FragmentProjection<PricingValueProjection<PARENT, ROOT>, ROOT> onMoneyV2() {
    MoneyV2FragmentProjection<PricingValueProjection<PARENT, ROOT>, ROOT> fragment = new MoneyV2FragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PricingPercentageValueFragmentProjection<PricingValueProjection<PARENT, ROOT>, ROOT> onPricingPercentageValue(
      ) {
    PricingPercentageValueFragmentProjection<PricingValueProjection<PARENT, ROOT>, ROOT> fragment = new PricingPercentageValueFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
