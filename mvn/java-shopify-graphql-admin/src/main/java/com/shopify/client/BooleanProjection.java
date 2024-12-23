package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class BooleanProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public BooleanProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Boolean"));
  }

  public BooleanProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
