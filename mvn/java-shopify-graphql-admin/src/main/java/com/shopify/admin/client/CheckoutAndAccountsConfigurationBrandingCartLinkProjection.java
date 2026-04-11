package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingCartLinkProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingCartLinkProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingCartLink"));
  }

  public CheckoutAndAccountsConfigurationBrandingCartLinkProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingVisibilityProjection<CheckoutAndAccountsConfigurationBrandingCartLinkProjection<PARENT, ROOT>, ROOT> visibility(
      ) {
     CheckoutAndAccountsConfigurationBrandingVisibilityProjection<CheckoutAndAccountsConfigurationBrandingCartLinkProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingVisibilityProjection<>(this, getRoot());
     getFields().put("visibility", projection);
     return projection;
  }
}
