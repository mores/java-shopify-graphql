package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingButtonProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingButtonProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingButton"));
  }

  public CheckoutBrandingButtonProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingBackgroundStyleProjection<CheckoutBrandingButtonProjection<PARENT, ROOT>, ROOT> background(
      ) {
     CheckoutBrandingBackgroundStyleProjection<CheckoutBrandingButtonProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingBackgroundStyleProjection<>(this, getRoot());
     getFields().put("background", projection);
     return projection;
  }

  public CheckoutBrandingSpacingProjection<CheckoutBrandingButtonProjection<PARENT, ROOT>, ROOT> blockPadding(
      ) {
     CheckoutBrandingSpacingProjection<CheckoutBrandingButtonProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingSpacingProjection<>(this, getRoot());
     getFields().put("blockPadding", projection);
     return projection;
  }

  public CheckoutBrandingSimpleBorderProjection<CheckoutBrandingButtonProjection<PARENT, ROOT>, ROOT> border(
      ) {
     CheckoutBrandingSimpleBorderProjection<CheckoutBrandingButtonProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingSimpleBorderProjection<>(this, getRoot());
     getFields().put("border", projection);
     return projection;
  }

  public CheckoutBrandingCornerRadiusProjection<CheckoutBrandingButtonProjection<PARENT, ROOT>, ROOT> cornerRadius(
      ) {
     CheckoutBrandingCornerRadiusProjection<CheckoutBrandingButtonProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingCornerRadiusProjection<>(this, getRoot());
     getFields().put("cornerRadius", projection);
     return projection;
  }

  public CheckoutBrandingSpacingProjection<CheckoutBrandingButtonProjection<PARENT, ROOT>, ROOT> inlinePadding(
      ) {
     CheckoutBrandingSpacingProjection<CheckoutBrandingButtonProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingSpacingProjection<>(this, getRoot());
     getFields().put("inlinePadding", projection);
     return projection;
  }

  public CheckoutBrandingTypographyStyleProjection<CheckoutBrandingButtonProjection<PARENT, ROOT>, ROOT> typography(
      ) {
     CheckoutBrandingTypographyStyleProjection<CheckoutBrandingButtonProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingTypographyStyleProjection<>(this, getRoot());
     getFields().put("typography", projection);
     return projection;
  }
}
