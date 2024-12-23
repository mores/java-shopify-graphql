package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingSpacingKeywordProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingSpacingKeywordProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingSpacingKeyword"));
  }

  public CheckoutBrandingSpacingKeywordProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
