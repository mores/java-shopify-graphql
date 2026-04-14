package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingCustomerAccountsMain"));
  }

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainProjection<PARENT, ROOT>, ROOT> colors(
      ) {
     CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingColorsProjection<>(this, getRoot());
     getFields().put("colors", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainProjection<PARENT, ROOT>, ROOT> section(
      ) {
     CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<>(this, getRoot());
     getFields().put("section", projection);
     return projection;
  }
}
