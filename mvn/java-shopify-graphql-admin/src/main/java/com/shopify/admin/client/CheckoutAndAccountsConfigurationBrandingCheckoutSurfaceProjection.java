package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingCheckoutSurface"));
  }

  public CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceProjection<PARENT, ROOT>, ROOT> components(
      ) {
     CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCheckoutComponentsProjection<>(this, getRoot());
     getFields().put("components", projection);
     return projection;
  }
}
