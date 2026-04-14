package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingHeadingLevelProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingHeadingLevelProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingHeadingLevel"));
  }

  public CheckoutAndAccountsConfigurationBrandingHeadingLevelProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<CheckoutAndAccountsConfigurationBrandingHeadingLevelProjection<PARENT, ROOT>, ROOT> typography(
      ) {
     CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<CheckoutAndAccountsConfigurationBrandingHeadingLevelProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingTypographyStyleProjection<>(this, getRoot());
     getFields().put("typography", projection);
     return projection;
  }
}
