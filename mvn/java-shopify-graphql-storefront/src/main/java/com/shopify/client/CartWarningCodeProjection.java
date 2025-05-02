package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartWarningCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartWarningCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartWarningCode"));
  }

  public CartWarningCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
