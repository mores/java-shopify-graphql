package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBranding"));
  }

  public CheckoutAndAccountsConfigurationBrandingProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingComponentsProjection<CheckoutAndAccountsConfigurationBrandingProjection<PARENT, ROOT>, ROOT> components(
      ) {
     CheckoutAndAccountsConfigurationBrandingComponentsProjection<CheckoutAndAccountsConfigurationBrandingProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingComponentsProjection<>(this, getRoot());
     getFields().put("components", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingDesignTokensProjection<CheckoutAndAccountsConfigurationBrandingProjection<PARENT, ROOT>, ROOT> designTokens(
      ) {
     CheckoutAndAccountsConfigurationBrandingDesignTokensProjection<CheckoutAndAccountsConfigurationBrandingProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingDesignTokensProjection<>(this, getRoot());
     getFields().put("designTokens", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSurfacesProjection<CheckoutAndAccountsConfigurationBrandingProjection<PARENT, ROOT>, ROOT> surfaces(
      ) {
     CheckoutAndAccountsConfigurationBrandingSurfacesProjection<CheckoutAndAccountsConfigurationBrandingProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSurfacesProjection<>(this, getRoot());
     getFields().put("surfaces", projection);
     return projection;
  }
}
