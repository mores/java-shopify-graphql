package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDiscountProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDiscountProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDiscount"));
  }

  public SubscriptionDiscountProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionAppliedCodeDiscountFragmentProjection<SubscriptionDiscountProjection<PARENT, ROOT>, ROOT> onSubscriptionAppliedCodeDiscount(
      ) {
    SubscriptionAppliedCodeDiscountFragmentProjection<SubscriptionDiscountProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionAppliedCodeDiscountFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionManualDiscountFragmentProjection<SubscriptionDiscountProjection<PARENT, ROOT>, ROOT> onSubscriptionManualDiscount(
      ) {
    SubscriptionManualDiscountFragmentProjection<SubscriptionDiscountProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionManualDiscountFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
