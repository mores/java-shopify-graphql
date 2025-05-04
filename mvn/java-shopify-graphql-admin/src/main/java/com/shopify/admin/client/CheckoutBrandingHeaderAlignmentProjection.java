package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CheckoutBrandingHeaderAlignmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CheckoutBrandingHeaderAlignmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CheckoutBrandingHeaderAlignment"));
  }

  public CheckoutBrandingHeaderAlignmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
