package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingSignInLogoProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingSignInLogoProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingSignInLogo"));
  }

  public CheckoutAndAccountsConfigurationBrandingSignInLogoProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingImageValueProjection<CheckoutAndAccountsConfigurationBrandingSignInLogoProjection<PARENT, ROOT>, ROOT> image(
      ) {
     CheckoutAndAccountsConfigurationBrandingImageValueProjection<CheckoutAndAccountsConfigurationBrandingSignInLogoProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingImageValueProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSignInLogoProjection<PARENT, ROOT> maxWidth() {
    getFields().put("maxWidth", null);
    return this;
  }
}
