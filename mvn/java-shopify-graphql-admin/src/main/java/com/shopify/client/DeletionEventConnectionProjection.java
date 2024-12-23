package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeletionEventConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeletionEventConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeletionEventConnection"));
  }

  public DeletionEventConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeletionEventEdgeProjection<DeletionEventConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeletionEventEdgeProjection<DeletionEventConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeletionEventEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeletionEventProjection<DeletionEventConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     DeletionEventProjection<DeletionEventConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeletionEventProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeletionEventConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<DeletionEventConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
