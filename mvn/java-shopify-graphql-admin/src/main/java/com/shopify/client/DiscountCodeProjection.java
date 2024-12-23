package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountCode"));
  }

  public DiscountCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCodeAppFragmentProjection<DiscountCodeProjection<PARENT, ROOT>, ROOT> onDiscountCodeApp(
      ) {
    DiscountCodeAppFragmentProjection<DiscountCodeProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCodeAppFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCodeBasicFragmentProjection<DiscountCodeProjection<PARENT, ROOT>, ROOT> onDiscountCodeBasic(
      ) {
    DiscountCodeBasicFragmentProjection<DiscountCodeProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCodeBasicFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCodeBxgyFragmentProjection<DiscountCodeProjection<PARENT, ROOT>, ROOT> onDiscountCodeBxgy(
      ) {
    DiscountCodeBxgyFragmentProjection<DiscountCodeProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCodeBxgyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCodeFreeShippingFragmentProjection<DiscountCodeProjection<PARENT, ROOT>, ROOT> onDiscountCodeFreeShipping(
      ) {
    DiscountCodeFreeShippingFragmentProjection<DiscountCodeProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCodeFreeShippingFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
