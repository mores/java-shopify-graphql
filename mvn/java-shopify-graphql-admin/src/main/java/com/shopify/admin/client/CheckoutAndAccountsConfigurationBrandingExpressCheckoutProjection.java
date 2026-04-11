package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingExpressCheckoutProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingExpressCheckoutProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingExpressCheckout"));
  }

  public CheckoutAndAccountsConfigurationBrandingExpressCheckoutProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingExpressCheckoutButtonProjection<CheckoutAndAccountsConfigurationBrandingExpressCheckoutProjection<PARENT, ROOT>, ROOT> button(
      ) {
     CheckoutAndAccountsConfigurationBrandingExpressCheckoutButtonProjection<CheckoutAndAccountsConfigurationBrandingExpressCheckoutProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingExpressCheckoutButtonProjection<>(this, getRoot());
     getFields().put("button", projection);
     return projection;
  }
}
