package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingDividerStyleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingDividerStyleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingDividerStyle"));
  }

  public CheckoutAndAccountsConfigurationBrandingDividerStyleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<CheckoutAndAccountsConfigurationBrandingDividerStyleProjection<PARENT, ROOT>, ROOT> borderStyle(
      ) {
     CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<CheckoutAndAccountsConfigurationBrandingDividerStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<>(this, getRoot());
     getFields().put("borderStyle", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<CheckoutAndAccountsConfigurationBrandingDividerStyleProjection<PARENT, ROOT>, ROOT> borderWidth(
      ) {
     CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<CheckoutAndAccountsConfigurationBrandingDividerStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<>(this, getRoot());
     getFields().put("borderWidth", projection);
     return projection;
  }
}
