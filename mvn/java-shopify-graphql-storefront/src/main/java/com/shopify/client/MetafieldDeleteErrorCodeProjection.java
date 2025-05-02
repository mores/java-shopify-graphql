package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDeleteErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDeleteErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDeleteErrorCode"));
  }

  public MetafieldDeleteErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
