package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingDesignTokenColorsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingDesignTokenColorsProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingDesignTokenColors"));
  }

  public CheckoutAndAccountsConfigurationBrandingDesignTokenColorsProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingPaletteProjection<CheckoutAndAccountsConfigurationBrandingDesignTokenColorsProjection<PARENT, ROOT>, ROOT> palette(
      ) {
     CheckoutAndAccountsConfigurationBrandingPaletteProjection<CheckoutAndAccountsConfigurationBrandingDesignTokenColorsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingPaletteProjection<>(this, getRoot());
     getFields().put("palette", projection);
     return projection;
  }
}
