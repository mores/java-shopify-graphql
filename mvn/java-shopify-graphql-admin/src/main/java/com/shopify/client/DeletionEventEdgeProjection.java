package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeletionEventEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeletionEventEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeletionEventEdge"));
  }

  public DeletionEventEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeletionEventProjection<DeletionEventEdgeProjection<PARENT, ROOT>, ROOT> node() {
     DeletionEventProjection<DeletionEventEdgeProjection<PARENT, ROOT>, ROOT> projection = new DeletionEventProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DeletionEventEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
