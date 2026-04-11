package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogo"));
  }

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingImageValueProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoProjection<PARENT, ROOT>, ROOT> image(
      ) {
     CheckoutAndAccountsConfigurationBrandingImageValueProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingImageValueProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoProjection<PARENT, ROOT> maxWidth(
      ) {
    getFields().put("maxWidth", null);
    return this;
  }
}
