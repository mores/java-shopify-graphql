package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingTypographyKerningProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingTypographyKerningProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingTypographyKerning"));
  }

  public CheckoutBrandingTypographyKerningProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
