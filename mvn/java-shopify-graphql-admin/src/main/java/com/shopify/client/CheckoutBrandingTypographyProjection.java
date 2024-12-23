package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingTypographyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingTypographyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingTypography"));
  }

  public CheckoutBrandingTypographyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingFontGroupProjection<CheckoutBrandingTypographyProjection<PARENT, ROOT>, ROOT> primary(
      ) {
     CheckoutBrandingFontGroupProjection<CheckoutBrandingTypographyProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingFontGroupProjection<>(this, getRoot());
     getFields().put("primary", projection);
     return projection;
  }

  public CheckoutBrandingFontGroupProjection<CheckoutBrandingTypographyProjection<PARENT, ROOT>, ROOT> secondary(
      ) {
     CheckoutBrandingFontGroupProjection<CheckoutBrandingTypographyProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingFontGroupProjection<>(this, getRoot());
     getFields().put("secondary", projection);
     return projection;
  }

  public CheckoutBrandingFontSizeProjection<CheckoutBrandingTypographyProjection<PARENT, ROOT>, ROOT> size(
      ) {
     CheckoutBrandingFontSizeProjection<CheckoutBrandingTypographyProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingFontSizeProjection<>(this, getRoot());
     getFields().put("size", projection);
     return projection;
  }
}
