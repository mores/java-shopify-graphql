package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Discount"));
  }

  public DiscountProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> onDiscountAutomaticApp(
      ) {
    DiscountAutomaticAppFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAutomaticAppFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticBasicFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> onDiscountAutomaticBasic(
      ) {
    DiscountAutomaticBasicFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAutomaticBasicFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticBxgyFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> onDiscountAutomaticBxgy(
      ) {
    DiscountAutomaticBxgyFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAutomaticBxgyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> onDiscountAutomaticFreeShipping(
      ) {
    DiscountAutomaticFreeShippingFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAutomaticFreeShippingFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCodeAppFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> onDiscountCodeApp(
      ) {
    DiscountCodeAppFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCodeAppFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCodeBasicFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> onDiscountCodeBasic(
      ) {
    DiscountCodeBasicFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCodeBasicFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCodeBxgyFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> onDiscountCodeBxgy(
      ) {
    DiscountCodeBxgyFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCodeBxgyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCodeFreeShippingFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> onDiscountCodeFreeShipping(
      ) {
    DiscountCodeFreeShippingFragmentProjection<DiscountProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCodeFreeShippingFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
