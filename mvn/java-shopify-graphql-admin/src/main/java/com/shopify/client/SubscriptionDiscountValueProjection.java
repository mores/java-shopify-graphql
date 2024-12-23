package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDiscountValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDiscountValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDiscountValue"));
  }

  public SubscriptionDiscountValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDiscountFixedAmountValueFragmentProjection<SubscriptionDiscountValueProjection<PARENT, ROOT>, ROOT> onSubscriptionDiscountFixedAmountValue(
      ) {
    SubscriptionDiscountFixedAmountValueFragmentProjection<SubscriptionDiscountValueProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionDiscountFixedAmountValueFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionDiscountPercentageValueFragmentProjection<SubscriptionDiscountValueProjection<PARENT, ROOT>, ROOT> onSubscriptionDiscountPercentageValue(
      ) {
    SubscriptionDiscountPercentageValueFragmentProjection<SubscriptionDiscountValueProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionDiscountPercentageValueFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
