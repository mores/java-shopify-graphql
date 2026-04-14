package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponents"));
  }

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsProjection<PARENT, ROOT>, ROOT> footer(
      ) {
     CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsFooterProjection<>(this, getRoot());
     getFields().put("footer", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsProjection<PARENT, ROOT>, ROOT> header(
      ) {
     CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderProjection<>(this, getRoot());
     getFields().put("header", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsProjection<PARENT, ROOT>, ROOT> main(
      ) {
     CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsComponentsProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainProjection<>(this, getRoot());
     getFields().put("main", projection);
     return projection;
  }
}
