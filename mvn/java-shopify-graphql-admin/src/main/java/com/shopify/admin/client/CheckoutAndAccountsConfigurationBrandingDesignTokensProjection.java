package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingDesignTokensProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingDesignTokensProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingDesignTokens"));
  }

  public CheckoutAndAccountsConfigurationBrandingDesignTokensProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingDesignTokenColorsProjection<CheckoutAndAccountsConfigurationBrandingDesignTokensProjection<PARENT, ROOT>, ROOT> colors(
      ) {
     CheckoutAndAccountsConfigurationBrandingDesignTokenColorsProjection<CheckoutAndAccountsConfigurationBrandingDesignTokensProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingDesignTokenColorsProjection<>(this, getRoot());
     getFields().put("colors", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCornerRadiusVariablesProjection<CheckoutAndAccountsConfigurationBrandingDesignTokensProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutAndAccountsConfigurationBrandingCornerRadiusVariablesProjection<CheckoutAndAccountsConfigurationBrandingDesignTokensProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCornerRadiusVariablesProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingTypographyProjection<CheckoutAndAccountsConfigurationBrandingDesignTokensProjection<PARENT, ROOT>, ROOT> typography(
      ) {
     CheckoutAndAccountsConfigurationBrandingTypographyProjection<CheckoutAndAccountsConfigurationBrandingDesignTokensProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingTypographyProjection<>(this, getRoot());
     getFields().put("typography", projection);
     return projection;
  }
}
