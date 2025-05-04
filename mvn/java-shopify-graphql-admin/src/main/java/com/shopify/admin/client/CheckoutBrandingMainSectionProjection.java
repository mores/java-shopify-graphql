package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingMainSectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingMainSectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingMainSection"));
  }

  public CheckoutBrandingMainSectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingBackgroundProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> background(
      ) {
     CheckoutBrandingBackgroundProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingBackgroundProjection<>(this, getRoot());
     getFields().put("background", projection);
     return projection;
  }

  public CheckoutBrandingSimpleBorderProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> border(
      ) {
     CheckoutBrandingSimpleBorderProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingSimpleBorderProjection<>(this, getRoot());
     getFields().put("border", projection);
     return projection;
  }

  public CheckoutBrandingBorderStyleProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> borderStyle(
      ) {
     CheckoutBrandingBorderStyleProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingBorderStyleProjection<>(this, getRoot());
     getFields().put("borderStyle", projection);
     return projection;
  }

  public CheckoutBrandingBorderWidthProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> borderWidth(
      ) {
     CheckoutBrandingBorderWidthProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingBorderWidthProjection<>(this, getRoot());
     getFields().put("borderWidth", projection);
     return projection;
  }

  public CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> colorScheme(
      ) {
     CheckoutBrandingColorSchemeSelectionProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingColorSchemeSelectionProjection<>(this, getRoot());
     getFields().put("colorScheme", projection);
     return projection;
  }

  public CheckoutBrandingCornerRadiusProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutBrandingCornerRadiusProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingCornerRadiusProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutBrandingSpacingKeywordProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> padding(
      ) {
     CheckoutBrandingSpacingKeywordProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingSpacingKeywordProjection<>(this, getRoot());
     getFields().put("padding", projection);
     return projection;
  }

  public CheckoutBrandingShadowProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> shadow(
      ) {
     CheckoutBrandingShadowProjection<CheckoutBrandingMainSectionProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingShadowProjection<>(this, getRoot());
     getFields().put("shadow", projection);
     return projection;
  }
}
