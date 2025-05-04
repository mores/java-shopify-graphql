package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppPricingDetailsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppPricingDetailsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppPricingDetails"));
  }

  public AppPricingDetailsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppRecurringPricingFragmentProjection<AppPricingDetailsProjection<PARENT, ROOT>, ROOT> onAppRecurringPricing(
      ) {
    AppRecurringPricingFragmentProjection<AppPricingDetailsProjection<PARENT, ROOT>, ROOT> fragment = new AppRecurringPricingFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AppUsagePricingFragmentProjection<AppPricingDetailsProjection<PARENT, ROOT>, ROOT> onAppUsagePricing(
      ) {
    AppUsagePricingFragmentProjection<AppPricingDetailsProjection<PARENT, ROOT>, ROOT> fragment = new AppUsagePricingFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
