package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingHeaderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingHeaderProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingHeader"));
  }

  public CheckoutAndAccountsConfigurationBrandingHeaderProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingHeaderAlignmentProjection<CheckoutAndAccountsConfigurationBrandingHeaderProjection<PARENT, ROOT>, ROOT> alignment(
      ) {
     CheckoutAndAccountsConfigurationBrandingHeaderAlignmentProjection<CheckoutAndAccountsConfigurationBrandingHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingHeaderAlignmentProjection<>(this, getRoot());
     getFields().put("alignment", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingBackgroundProjection<CheckoutAndAccountsConfigurationBrandingHeaderProjection<PARENT, ROOT>, ROOT> background(
      ) {
     CheckoutAndAccountsConfigurationBrandingBackgroundProjection<CheckoutAndAccountsConfigurationBrandingHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBackgroundProjection<>(this, getRoot());
     getFields().put("background", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingHeaderProjection<PARENT, ROOT>, ROOT> colors(
      ) {
     CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingColorsProjection<>(this, getRoot());
     getFields().put("colors", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingLogoProjection<CheckoutAndAccountsConfigurationBrandingHeaderProjection<PARENT, ROOT>, ROOT> logo(
      ) {
     CheckoutAndAccountsConfigurationBrandingLogoProjection<CheckoutAndAccountsConfigurationBrandingHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingLogoProjection<>(this, getRoot());
     getFields().put("logo", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingHeaderProjection<PARENT, ROOT>, ROOT> padding(
      ) {
     CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<>(this, getRoot());
     getFields().put("padding", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingHeaderProjection<PARENT, ROOT> divided() {
    getFields().put("divided", null);
    return this;
  }
}
