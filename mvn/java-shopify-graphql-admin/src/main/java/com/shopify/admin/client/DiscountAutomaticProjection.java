package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountAutomaticProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountAutomaticProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountAutomatic"));
  }

  public DiscountAutomaticProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<DiscountAutomaticProjection<PARENT, ROOT>, ROOT> onDiscountAutomaticApp(
      ) {
    DiscountAutomaticAppFragmentProjection<DiscountAutomaticProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAutomaticAppFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticBasicFragmentProjection<DiscountAutomaticProjection<PARENT, ROOT>, ROOT> onDiscountAutomaticBasic(
      ) {
    DiscountAutomaticBasicFragmentProjection<DiscountAutomaticProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAutomaticBasicFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticBxgyFragmentProjection<DiscountAutomaticProjection<PARENT, ROOT>, ROOT> onDiscountAutomaticBxgy(
      ) {
    DiscountAutomaticBxgyFragmentProjection<DiscountAutomaticProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAutomaticBxgyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<DiscountAutomaticProjection<PARENT, ROOT>, ROOT> onDiscountAutomaticFreeShipping(
      ) {
    DiscountAutomaticFreeShippingFragmentProjection<DiscountAutomaticProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAutomaticFreeShippingFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
