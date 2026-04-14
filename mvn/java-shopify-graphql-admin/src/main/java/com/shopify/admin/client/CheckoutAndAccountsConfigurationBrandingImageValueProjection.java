package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingImageValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingImageValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingImageValue"));
  }

  public CheckoutAndAccountsConfigurationBrandingImageValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingImageFragmentProjection<CheckoutAndAccountsConfigurationBrandingImageValueProjection<PARENT, ROOT>, ROOT> onCheckoutAndAccountsConfigurationBrandingImage(
      ) {
    CheckoutAndAccountsConfigurationBrandingImageFragmentProjection<CheckoutAndAccountsConfigurationBrandingImageValueProjection<PARENT, ROOT>, ROOT> fragment = new CheckoutAndAccountsConfigurationBrandingImageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
