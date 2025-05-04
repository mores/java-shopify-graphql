package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingSimpleBorderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingSimpleBorderProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingSimpleBorder"));
  }

  public CheckoutBrandingSimpleBorderProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
