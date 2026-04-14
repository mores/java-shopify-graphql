package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection(
      PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSection"));
  }

  public CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingBackgroundProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> background(
      ) {
     CheckoutAndAccountsConfigurationBrandingBackgroundProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBackgroundProjection<>(this, getRoot());
     getFields().put("background", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> border(
      ) {
     CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<>(this, getRoot());
     getFields().put("border", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> borderStyle(
      ) {
     CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<>(this, getRoot());
     getFields().put("borderStyle", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> borderWidth(
      ) {
     CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<>(this, getRoot());
     getFields().put("borderWidth", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> colors(
      ) {
     CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingColorsProjection<>(this, getRoot());
     getFields().put("colors", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> padding(
      ) {
     CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<>(this, getRoot());
     getFields().put("padding", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingShadowProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> shadow(
      ) {
     CheckoutAndAccountsConfigurationBrandingShadowProjection<CheckoutAndAccountsConfigurationBrandingCustomerAccountsMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingShadowProjection<>(this, getRoot());
     getFields().put("shadow", projection);
     return projection;
  }
}
