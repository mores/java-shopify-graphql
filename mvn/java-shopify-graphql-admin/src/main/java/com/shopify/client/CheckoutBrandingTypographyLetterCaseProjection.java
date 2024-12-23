package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingTypographyLetterCaseProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingTypographyLetterCaseProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingTypographyLetterCase"));
  }

  public CheckoutBrandingTypographyLetterCaseProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
