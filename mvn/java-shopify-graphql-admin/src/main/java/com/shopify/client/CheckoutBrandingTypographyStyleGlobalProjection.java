package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingTypographyStyleGlobalProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingTypographyStyleGlobalProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingTypographyStyleGlobal"));
  }

  public CheckoutBrandingTypographyStyleGlobalProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingTypographyKerningProjection<CheckoutBrandingTypographyStyleGlobalProjection<PARENT, ROOT>, ROOT> kerning(
      ) {
     CheckoutBrandingTypographyKerningProjection<CheckoutBrandingTypographyStyleGlobalProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingTypographyKerningProjection<>(this, getRoot());
     getFields().put("kerning", projection);
     return projection;
  }

  public CheckoutBrandingTypographyLetterCaseProjection<CheckoutBrandingTypographyStyleGlobalProjection<PARENT, ROOT>, ROOT> letterCase(
      ) {
     CheckoutBrandingTypographyLetterCaseProjection<CheckoutBrandingTypographyStyleGlobalProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingTypographyLetterCaseProjection<>(this, getRoot());
     getFields().put("letterCase", projection);
     return projection;
  }
}
