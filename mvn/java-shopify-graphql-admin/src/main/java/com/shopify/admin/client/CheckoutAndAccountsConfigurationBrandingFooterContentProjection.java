package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingFooterContentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingFooterContentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingFooterContent"));
  }

  public CheckoutAndAccountsConfigurationBrandingFooterContentProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingVisibilityProjection<CheckoutAndAccountsConfigurationBrandingFooterContentProjection<PARENT, ROOT>, ROOT> visibility(
      ) {
     CheckoutAndAccountsConfigurationBrandingVisibilityProjection<CheckoutAndAccountsConfigurationBrandingFooterContentProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingVisibilityProjection<>(this, getRoot());
     getFields().put("visibility", projection);
     return projection;
  }
}
