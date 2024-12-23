package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingHeadingLevelProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingHeadingLevelProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingHeadingLevel"));
  }

  public CheckoutBrandingHeadingLevelProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CheckoutBrandingTypographyStyleProjection<CheckoutBrandingHeadingLevelProjection<PARENT, ROOT>, ROOT> typography(
      ) {
     CheckoutBrandingTypographyStyleProjection<CheckoutBrandingHeadingLevelProjection<PARENT, ROOT>, ROOT> projection = new CheckoutBrandingTypographyStyleProjection<>(this, getRoot());
     getFields().put("typography", projection);
     return projection;
  }
}
