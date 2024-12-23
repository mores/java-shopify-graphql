package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AutomaticDiscountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AutomaticDiscountProjectionRoot() {
    super(null, null, java.util.Optional.of("DiscountAutomatic"));
  }

  public AutomaticDiscountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAutomaticAppFragmentProjection<AutomaticDiscountProjectionRoot<PARENT, ROOT>, AutomaticDiscountProjectionRoot<PARENT, ROOT>> onDiscountAutomaticApp(
      ) {
    DiscountAutomaticAppFragmentProjection<AutomaticDiscountProjectionRoot<PARENT, ROOT>, AutomaticDiscountProjectionRoot<PARENT, ROOT>> fragment = new DiscountAutomaticAppFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticBasicFragmentProjection<AutomaticDiscountProjectionRoot<PARENT, ROOT>, AutomaticDiscountProjectionRoot<PARENT, ROOT>> onDiscountAutomaticBasic(
      ) {
    DiscountAutomaticBasicFragmentProjection<AutomaticDiscountProjectionRoot<PARENT, ROOT>, AutomaticDiscountProjectionRoot<PARENT, ROOT>> fragment = new DiscountAutomaticBasicFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticBxgyFragmentProjection<AutomaticDiscountProjectionRoot<PARENT, ROOT>, AutomaticDiscountProjectionRoot<PARENT, ROOT>> onDiscountAutomaticBxgy(
      ) {
    DiscountAutomaticBxgyFragmentProjection<AutomaticDiscountProjectionRoot<PARENT, ROOT>, AutomaticDiscountProjectionRoot<PARENT, ROOT>> fragment = new DiscountAutomaticBxgyFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountAutomaticFreeShippingFragmentProjection<AutomaticDiscountProjectionRoot<PARENT, ROOT>, AutomaticDiscountProjectionRoot<PARENT, ROOT>> onDiscountAutomaticFreeShipping(
      ) {
    DiscountAutomaticFreeShippingFragmentProjection<AutomaticDiscountProjectionRoot<PARENT, ROOT>, AutomaticDiscountProjectionRoot<PARENT, ROOT>> fragment = new DiscountAutomaticFreeShippingFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
