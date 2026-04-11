package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingLogoProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingLogoProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingLogo"));
  }

  public CheckoutAndAccountsConfigurationBrandingLogoProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingImageValueProjection<CheckoutAndAccountsConfigurationBrandingLogoProjection<PARENT, ROOT>, ROOT> image(
      ) {
     CheckoutAndAccountsConfigurationBrandingImageValueProjection<CheckoutAndAccountsConfigurationBrandingLogoProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingImageValueProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingVisibilityProjection<CheckoutAndAccountsConfigurationBrandingLogoProjection<PARENT, ROOT>, ROOT> visibility(
      ) {
     CheckoutAndAccountsConfigurationBrandingVisibilityProjection<CheckoutAndAccountsConfigurationBrandingLogoProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingVisibilityProjection<>(this, getRoot());
     getFields().put("visibility", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingLogoProjection<PARENT, ROOT> maxWidth() {
    getFields().put("maxWidth", null);
    return this;
  }
}
