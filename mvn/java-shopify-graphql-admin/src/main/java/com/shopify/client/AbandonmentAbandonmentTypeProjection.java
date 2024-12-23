package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonmentAbandonmentTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonmentAbandonmentTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonmentAbandonmentType"));
  }

  public AbandonmentAbandonmentTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
