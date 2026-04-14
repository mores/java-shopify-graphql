package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeader"));
  }

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingHeaderAlignmentProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderProjection<PARENT, ROOT>, ROOT> alignment(
      ) {
     CheckoutAndAccountsConfigurationBrandingHeaderAlignmentProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingHeaderAlignmentProjection<>(this, getRoot());
     getFields().put("alignment", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderProjection<PARENT, ROOT>, ROOT> colors(
      ) {
     CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingColorsProjection<>(this, getRoot());
     getFields().put("colors", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderProjection<PARENT, ROOT>, ROOT> logo(
      ) {
     CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCustomerAccountsLogoProjection<>(this, getRoot());
     getFields().put("logo", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderProjection<PARENT, ROOT>, ROOT> padding(
      ) {
     CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<>(this, getRoot());
     getFields().put("padding", projection);
     return projection;
  }
}
