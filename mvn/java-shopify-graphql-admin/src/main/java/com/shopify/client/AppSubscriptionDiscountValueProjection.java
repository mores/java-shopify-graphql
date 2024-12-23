package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppSubscriptionDiscountValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppSubscriptionDiscountValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppSubscriptionDiscountValue"));
  }

  public AppSubscriptionDiscountValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppSubscriptionDiscountAmountFragmentProjection<AppSubscriptionDiscountValueProjection<PARENT, ROOT>, ROOT> onAppSubscriptionDiscountAmount(
      ) {
    AppSubscriptionDiscountAmountFragmentProjection<AppSubscriptionDiscountValueProjection<PARENT, ROOT>, ROOT> fragment = new AppSubscriptionDiscountAmountFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public AppSubscriptionDiscountPercentageFragmentProjection<AppSubscriptionDiscountValueProjection<PARENT, ROOT>, ROOT> onAppSubscriptionDiscountPercentage(
      ) {
    AppSubscriptionDiscountPercentageFragmentProjection<AppSubscriptionDiscountValueProjection<PARENT, ROOT>, ROOT> fragment = new AppSubscriptionDiscountPercentageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
