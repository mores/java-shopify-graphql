package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingSharedTypographyStyle"));
  }

  public CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingTypographyKerningProjection<CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleProjection<PARENT, ROOT>, ROOT> kerning(
      ) {
     CheckoutAndAccountsConfigurationBrandingTypographyKerningProjection<CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingTypographyKerningProjection<>(this, getRoot());
     getFields().put("kerning", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingTypographyLetterCaseProjection<CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleProjection<PARENT, ROOT>, ROOT> letterCase(
      ) {
     CheckoutAndAccountsConfigurationBrandingTypographyLetterCaseProjection<CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingTypographyLetterCaseProjection<>(this, getRoot());
     getFields().put("letterCase", projection);
     return projection;
  }
}
