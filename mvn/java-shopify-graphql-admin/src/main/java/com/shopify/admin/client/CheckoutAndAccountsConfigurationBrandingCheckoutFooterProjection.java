package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingCheckoutFooter"));
  }

  public CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingFooterAlignmentProjection<CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT, ROOT>, ROOT> alignment(
      ) {
     CheckoutAndAccountsConfigurationBrandingFooterAlignmentProjection<CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingFooterAlignmentProjection<>(this, getRoot());
     getFields().put("alignment", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingBackgroundProjection<CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT, ROOT>, ROOT> background(
      ) {
     CheckoutAndAccountsConfigurationBrandingBackgroundProjection<CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBackgroundProjection<>(this, getRoot());
     getFields().put("background", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT, ROOT>, ROOT> colors(
      ) {
     CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingColorsProjection<>(this, getRoot());
     getFields().put("colors", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingFooterContentProjection<CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT, ROOT>, ROOT> content(
      ) {
     CheckoutAndAccountsConfigurationBrandingFooterContentProjection<CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingFooterContentProjection<>(this, getRoot());
     getFields().put("content", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT, ROOT>, ROOT> padding(
      ) {
     CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<>(this, getRoot());
     getFields().put("padding", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingFooterPositionProjection<CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT, ROOT>, ROOT> position(
      ) {
     CheckoutAndAccountsConfigurationBrandingFooterPositionProjection<CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingFooterPositionProjection<>(this, getRoot());
     getFields().put("position", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCheckoutFooterProjection<PARENT, ROOT> divided() {
    getFields().put("divided", null);
    return this;
  }
}
