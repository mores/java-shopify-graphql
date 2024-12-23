package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingBackgroundStyleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingBackgroundStyleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingBackgroundStyle"));
  }

  public CheckoutBrandingBackgroundStyleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
