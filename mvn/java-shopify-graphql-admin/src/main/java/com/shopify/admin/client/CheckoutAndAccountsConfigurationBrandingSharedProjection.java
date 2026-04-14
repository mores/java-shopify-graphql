package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingSharedProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingSharedProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingShared"));
  }

  public CheckoutAndAccountsConfigurationBrandingSharedProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingSharedColorsProjection<CheckoutAndAccountsConfigurationBrandingSharedProjection<PARENT, ROOT>, ROOT> colors(
      ) {
     CheckoutAndAccountsConfigurationBrandingSharedColorsProjection<CheckoutAndAccountsConfigurationBrandingSharedProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSharedColorsProjection<>(this, getRoot());
     getFields().put("colors", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSharedCornerRadiusProjection<CheckoutAndAccountsConfigurationBrandingSharedProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutAndAccountsConfigurationBrandingSharedCornerRadiusProjection<CheckoutAndAccountsConfigurationBrandingSharedProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSharedCornerRadiusProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleProjection<CheckoutAndAccountsConfigurationBrandingSharedProjection<PARENT, ROOT>, ROOT> typography(
      ) {
     CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleProjection<CheckoutAndAccountsConfigurationBrandingSharedProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSharedTypographyStyleProjection<>(this, getRoot());
     getFields().put("typography", projection);
     return projection;
  }
}
