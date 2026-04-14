package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingTypographyStyle"));
  }

  public CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingTypographyFontProjection<CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> font(
      ) {
     CheckoutAndAccountsConfigurationBrandingTypographyFontProjection<CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingTypographyFontProjection<>(this, getRoot());
     getFields().put("font", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingTypographyKerningProjection<CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> kerning(
      ) {
     CheckoutAndAccountsConfigurationBrandingTypographyKerningProjection<CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingTypographyKerningProjection<>(this, getRoot());
     getFields().put("kerning", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingTypographyLetterCaseProjection<CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> letterCase(
      ) {
     CheckoutAndAccountsConfigurationBrandingTypographyLetterCaseProjection<CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingTypographyLetterCaseProjection<>(this, getRoot());
     getFields().put("letterCase", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingTypographySizeProjection<CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> size(
      ) {
     CheckoutAndAccountsConfigurationBrandingTypographySizeProjection<CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingTypographySizeProjection<>(this, getRoot());
     getFields().put("size", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingTypographyWeightProjection<CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> weight(
      ) {
     CheckoutAndAccountsConfigurationBrandingTypographyWeightProjection<CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingTypographyWeightProjection<>(this, getRoot());
     getFields().put("weight", projection);
     return projection;
  }
}
