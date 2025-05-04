package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingOrderSummarySectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingOrderSummarySectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingOrderSummarySection"));
  }

  public CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingBackgroundProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> background(
      ) {
     CheckoutBrandingBackgroundProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingBackgroundProjection<>(this, getRoot());
     getFields().put("background", projection);
     return projection;
  }

  public CheckoutBrandingSimpleBorderProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> border(
      ) {
     CheckoutBrandingSimpleBorderProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingSimpleBorderProjection<>(this, getRoot());
     getFields().put("border", projection);
     return projection;
  }

  public CheckoutBrandingBorderStyleProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> borderStyle(
      ) {
     CheckoutBrandingBorderStyleProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingBorderStyleProjection<>(this, getRoot());
     getFields().put("borderStyle", projection);
     return projection;
  }

  public CheckoutBrandingBorderWidthProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> borderWidth(
      ) {
     CheckoutBrandingBorderWidthProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingBorderWidthProjection<>(this, getRoot());
     getFields().put("borderWidth", projection);
     return projection;
  }

  public CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> colorScheme(
      ) {
     CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorSchemeSelectionProjection<>(this, getRoot());
     getFields().put("colorScheme", projection);
     return projection;
  }

  public CheckoutBrandingCornerRadiusProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutBrandingCornerRadiusProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingCornerRadiusProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutBrandingSpacingKeywordProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> padding(
      ) {
     CheckoutBrandingSpacingKeywordProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingSpacingKeywordProjection<>(this, getRoot());
     getFields().put("padding", projection);
     return projection;
  }

  public CheckoutBrandingShadowProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> shadow(
      ) {
     CheckoutBrandingShadowProjection<CheckoutBrandingOrderSummarySectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingShadowProjection<>(this, getRoot());
     getFields().put("shadow", projection);
     return projection;
  }
}
