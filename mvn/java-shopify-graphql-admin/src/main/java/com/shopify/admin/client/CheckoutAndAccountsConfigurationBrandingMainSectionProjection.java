package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingMainSectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingMainSection"));
  }

  public CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingBackgroundProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> background(
      ) {
     CheckoutAndAccountsConfigurationBrandingBackgroundProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBackgroundProjection<>(this, getRoot());
     getFields().put("background", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> border(
      ) {
     CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<>(this, getRoot());
     getFields().put("border", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> borderStyle(
      ) {
     CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<>(this, getRoot());
     getFields().put("borderStyle", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> borderWidth(
      ) {
     CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<>(this, getRoot());
     getFields().put("borderWidth", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> colors(
      ) {
     CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingColorsProjection<>(this, getRoot());
     getFields().put("colors", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> padding(
      ) {
     CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<>(this, getRoot());
     getFields().put("padding", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingShadowProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> shadow(
      ) {
     CheckoutAndAccountsConfigurationBrandingShadowProjection<CheckoutAndAccountsConfigurationBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingShadowProjection<>(this, getRoot());
     getFields().put("shadow", projection);
     return projection;
  }
}
