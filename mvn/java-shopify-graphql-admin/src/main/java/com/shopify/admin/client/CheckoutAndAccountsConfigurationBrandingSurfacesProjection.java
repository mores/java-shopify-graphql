package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingSurfacesProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingSurfacesProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingSurfaces"));
  }

  public CheckoutAndAccountsConfigurationBrandingSurfacesProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceProjection<CheckoutAndAccountsConfigurationBrandingSurfacesProjection<PARENT, ROOT>, ROOT> checkout(
      ) {
     CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceProjection<CheckoutAndAccountsConfigurationBrandingSurfacesProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCheckoutSurfaceProjection<>(this, getRoot());
     getFields().put("checkout", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceProjection<CheckoutAndAccountsConfigurationBrandingSurfacesProjection<PARENT, ROOT>, ROOT> customerAccounts(
      ) {
     CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceProjection<CheckoutAndAccountsConfigurationBrandingSurfacesProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsSurfaceProjection<>(this, getRoot());
     getFields().put("customerAccounts", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSignInSurfaceProjection<CheckoutAndAccountsConfigurationBrandingSurfacesProjection<PARENT, ROOT>, ROOT> signIn(
      ) {
     CheckoutAndAccountsConfigurationBrandingSignInSurfaceProjection<CheckoutAndAccountsConfigurationBrandingSurfacesProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSignInSurfaceProjection<>(this, getRoot());
     getFields().put("signIn", projection);
     return projection;
  }
}
