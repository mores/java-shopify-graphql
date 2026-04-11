package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingFontGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingFontGroupProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingFontGroup"));
  }

  public CheckoutAndAccountsConfigurationBrandingFontGroupProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomFontGroupFragmentProjection<CheckoutAndAccountsConfigurationBrandingFontGroupProjection<PARENT, ROOT>, ROOT> onCheckoutAndAccountsConfigurationBrandingCustomFontGroup(
      ) {
    CheckoutAndAccountsConfigurationBrandingCustomFontGroupFragmentProjection<CheckoutAndAccountsConfigurationBrandingFontGroupProjection<PARENT, ROOT>, ROOT> fragment = new CheckoutAndAccountsConfigurationBrandingCustomFontGroupFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CheckoutAndAccountsConfigurationBrandingShopifyFontGroupFragmentProjection<CheckoutAndAccountsConfigurationBrandingFontGroupProjection<PARENT, ROOT>, ROOT> onCheckoutAndAccountsConfigurationBrandingShopifyFontGroup(
      ) {
    CheckoutAndAccountsConfigurationBrandingShopifyFontGroupFragmentProjection<CheckoutAndAccountsConfigurationBrandingFontGroupProjection<PARENT, ROOT>, ROOT> fragment = new CheckoutAndAccountsConfigurationBrandingShopifyFontGroupFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
