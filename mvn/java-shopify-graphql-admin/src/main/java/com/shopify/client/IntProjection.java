package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class IntProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public IntProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Int"));
  }

  public IntProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
