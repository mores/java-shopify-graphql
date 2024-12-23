package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingFooterAlignmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingFooterAlignmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingFooterAlignment"));
  }

  public CheckoutBrandingFooterAlignmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
