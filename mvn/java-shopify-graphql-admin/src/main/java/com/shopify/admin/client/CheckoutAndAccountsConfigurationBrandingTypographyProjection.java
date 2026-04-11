package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingTypographyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingTypographyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingTypography"));
  }

  public CheckoutAndAccountsConfigurationBrandingTypographyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingFontGroupProjection<CheckoutAndAccountsConfigurationBrandingTypographyProjection<PARENT, ROOT>, ROOT> primary(
      ) {
     CheckoutAndAccountsConfigurationBrandingFontGroupProjection<CheckoutAndAccountsConfigurationBrandingTypographyProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingFontGroupProjection<>(this, getRoot());
     getFields().put("primary", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingFontGroupProjection<CheckoutAndAccountsConfigurationBrandingTypographyProjection<PARENT, ROOT>, ROOT> secondary(
      ) {
     CheckoutAndAccountsConfigurationBrandingFontGroupProjection<CheckoutAndAccountsConfigurationBrandingTypographyProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingFontGroupProjection<>(this, getRoot());
     getFields().put("secondary", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingFontSizeProjection<CheckoutAndAccountsConfigurationBrandingTypographyProjection<PARENT, ROOT>, ROOT> size(
      ) {
     CheckoutAndAccountsConfigurationBrandingFontSizeProjection<CheckoutAndAccountsConfigurationBrandingTypographyProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingFontSizeProjection<>(this, getRoot());
     getFields().put("size", projection);
     return projection;
  }
}
