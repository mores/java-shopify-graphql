package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingSignInComponentsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingSignInComponentsProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingSignInComponents"));
  }

  public CheckoutAndAccountsConfigurationBrandingSignInComponentsProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingSignInHeaderProjection<CheckoutAndAccountsConfigurationBrandingSignInComponentsProjection<PARENT, ROOT>, ROOT> header(
      ) {
     CheckoutAndAccountsConfigurationBrandingSignInHeaderProjection<CheckoutAndAccountsConfigurationBrandingSignInComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSignInHeaderProjection<>(this, getRoot());
     getFields().put("header", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSignInMainProjection<CheckoutAndAccountsConfigurationBrandingSignInComponentsProjection<PARENT, ROOT>, ROOT> main(
      ) {
     CheckoutAndAccountsConfigurationBrandingSignInMainProjection<CheckoutAndAccountsConfigurationBrandingSignInComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSignInMainProjection<>(this, getRoot());
     getFields().put("main", projection);
     return projection;
  }
}
