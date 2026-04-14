package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingTypographyFontProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingTypographyFontProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingTypographyFont"));
  }

  public CheckoutAndAccountsConfigurationBrandingTypographyFontProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }
}
