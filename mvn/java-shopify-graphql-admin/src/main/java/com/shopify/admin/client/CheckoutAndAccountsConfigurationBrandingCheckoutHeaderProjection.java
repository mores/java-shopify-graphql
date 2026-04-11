package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingCheckoutHeader"));
  }

  public CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingHeaderAlignmentProjection<CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT>, ROOT> alignment(
      ) {
     CheckoutAndAccountsConfigurationBrandingHeaderAlignmentProjection<CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingHeaderAlignmentProjection<>(this, getRoot());
     getFields().put("alignment", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingBackgroundProjection<CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT>, ROOT> background(
      ) {
     CheckoutAndAccountsConfigurationBrandingBackgroundProjection<CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBackgroundProjection<>(this, getRoot());
     getFields().put("background", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingHeaderCartLinkProjection<CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT>, ROOT> cartLink(
      ) {
     CheckoutAndAccountsConfigurationBrandingHeaderCartLinkProjection<CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingHeaderCartLinkProjection<>(this, getRoot());
     getFields().put("cartLink", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT>, ROOT> colors(
      ) {
     CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingColorsProjection<>(this, getRoot());
     getFields().put("colors", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingLogoProjection<CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT>, ROOT> logo(
      ) {
     CheckoutAndAccountsConfigurationBrandingLogoProjection<CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingLogoProjection<>(this, getRoot());
     getFields().put("logo", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT>, ROOT> padding(
      ) {
     CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<>(this, getRoot());
     getFields().put("padding", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingHeaderPositionProjection<CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT>, ROOT> position(
      ) {
     CheckoutAndAccountsConfigurationBrandingHeaderPositionProjection<CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingHeaderPositionProjection<>(this, getRoot());
     getFields().put("position", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCheckoutHeaderProjection<PARENT, ROOT> divided() {
    getFields().put("divided", null);
    return this;
  }
}
