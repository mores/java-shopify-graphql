package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutAndAccountsConfigurationBrandingOrderSummarySection"));
  }

  public CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutAndAccountsConfigurationBrandingBackgroundProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> background(
      ) {
     CheckoutAndAccountsConfigurationBrandingBackgroundProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBackgroundProjection<>(this, getRoot());
     getFields().put("background", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> border(
      ) {
     CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSimpleBorderProjection<>(this, getRoot());
     getFields().put("border", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> borderStyle(
      ) {
     CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBorderStyleProjection<>(this, getRoot());
     getFields().put("borderStyle", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> borderWidth(
      ) {
     CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingBorderWidthProjection<>(this, getRoot());
     getFields().put("borderWidth", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> colors(
      ) {
     CheckoutAndAccountsConfigurationBrandingColorsProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingColorsProjection<>(this, getRoot());
     getFields().put("colors", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingCornerRadiusProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> padding(
      ) {
     CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingSpacingKeywordProjection<>(this, getRoot());
     getFields().put("padding", projection);
     return projection;
  }

  public CheckoutAndAccountsConfigurationBrandingShadowProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> shadow(
      ) {
     CheckoutAndAccountsConfigurationBrandingShadowProjection<CheckoutAndAccountsConfigurationBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutAndAccountsConfigurationBrandingShadowProjection<>(this, getRoot());
     getFields().put("shadow", projection);
     return projection;
  }
}
