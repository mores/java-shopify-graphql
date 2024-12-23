package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingBorderStyleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingBorderStyleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingBorderStyle"));
  }

  public CheckoutBrandingBorderStyleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
