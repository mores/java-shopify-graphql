package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountEffectProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountEffectProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountEffect"));
  }

  public DiscountEffectProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAmountFragmentProjection<DiscountEffectProjection<PARENT, ROOT>, ROOT> onDiscountAmount(
      ) {
    DiscountAmountFragmentProjection<DiscountEffectProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAmountFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountPercentageFragmentProjection<DiscountEffectProjection<PARENT, ROOT>, ROOT> onDiscountPercentage(
      ) {
    DiscountPercentageFragmentProjection<DiscountEffectProjection<PARENT, ROOT>, ROOT> fragment = new DiscountPercentageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
