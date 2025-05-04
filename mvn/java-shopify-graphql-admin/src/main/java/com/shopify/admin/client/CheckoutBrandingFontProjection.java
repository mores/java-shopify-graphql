package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingFontProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingFontProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingFont"));
  }

  public CheckoutBrandingFontProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingFontProjection<PARENT, ROOT> sources() {
    getFields().put("sources", null);
    return this;
  }

  public CheckoutBrandingFontProjection<PARENT, ROOT> weight() {
    getFields().put("weight", null);
    return this;
  }

  public CheckoutBrandingCustomFontFragmentProjection<CheckoutBrandingFontProjection<PARENT, ROOT>, ROOT> onCheckoutBrandingCustomFont(
      ) {
    CheckoutBrandingCustomFontFragmentProjection<CheckoutBrandingFontProjection<PARENT, ROOT>, ROOT> fragment = new CheckoutBrandingCustomFontFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CheckoutBrandingShopifyFontFragmentProjection<CheckoutBrandingFontProjection<PARENT, ROOT>, ROOT> onCheckoutBrandingShopifyFont(
      ) {
    CheckoutBrandingShopifyFontFragmentProjection<CheckoutBrandingFontProjection<PARENT, ROOT>, ROOT> fragment = new CheckoutBrandingShopifyFontFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
