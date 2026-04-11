package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurface"));
  }

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceProjection<PARENT, ROOT>, ROOT> components(
      ) {
     CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsProjection<>(this, getRoot());
     getFields().put("components", projection);
     return projection;
  }
}
