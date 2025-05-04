package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingTypographyStyleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingTypographyStyleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingTypographyStyle"));
  }

  public CheckoutBrandingTypographyStyleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingTypographyFontProjection<CheckoutBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> font(
      ) {
     CheckoutBrandingTypographyFontProjection<CheckoutBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingTypographyFontProjection<>(this, getRoot());
     getFields().put("font", projection);
     return projection;
  }

  public CheckoutBrandingTypographyKerningProjection<CheckoutBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> kerning(
      ) {
     CheckoutBrandingTypographyKerningProjection<CheckoutBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingTypographyKerningProjection<>(this, getRoot());
     getFields().put("kerning", projection);
     return projection;
  }

  public CheckoutBrandingTypographyLetterCaseProjection<CheckoutBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> letterCase(
      ) {
     CheckoutBrandingTypographyLetterCaseProjection<CheckoutBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingTypographyLetterCaseProjection<>(this, getRoot());
     getFields().put("letterCase", projection);
     return projection;
  }

  public CheckoutBrandingTypographySizeProjection<CheckoutBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> size(
      ) {
     CheckoutBrandingTypographySizeProjection<CheckoutBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingTypographySizeProjection<>(this, getRoot());
     getFields().put("size", projection);
     return projection;
  }

  public CheckoutBrandingTypographyWeightProjection<CheckoutBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> weight(
      ) {
     CheckoutBrandingTypographyWeightProjection<CheckoutBrandingTypographyStyleProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingTypographyWeightProjection<>(this, getRoot());
     getFields().put("weight", projection);
     return projection;
  }
}
