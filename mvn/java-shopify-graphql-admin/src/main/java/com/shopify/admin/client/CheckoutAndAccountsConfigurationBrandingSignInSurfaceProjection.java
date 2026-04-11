package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingSignInSurfaceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingSignInSurfaceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingSignInSurface"));
  }

  public CheckoutAndAccountsConfigurationBrandingSignInSurfaceProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingSignInComponentsProjection<CheckoutAndAccountsConfigurationBrandingSignInSurfaceProjection<PARENT, ROOT>, ROOT> components(
      ) {
     CheckoutAndAccountsConfigurationBrandingSignInComponentsProjection<CheckoutAndAccountsConfigurationBrandingSignInSurfaceProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSignInComponentsProjection<>(this, getRoot());
     getFields().put("components", projection);
     return projection;
  }
}
