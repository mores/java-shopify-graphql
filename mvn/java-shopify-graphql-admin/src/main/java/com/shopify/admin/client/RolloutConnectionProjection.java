package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RolloutConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RolloutConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RolloutConnection"));
  }

  public RolloutConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RolloutEdgeProjection<RolloutConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     RolloutEdgeProjection<RolloutConnectionProjection<PARENT, ROOT>, ROOT> projection = new RolloutEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public RolloutProjection<RolloutConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     RolloutProjection<RolloutConnectionProjection<PARENT, ROOT>, ROOT> projection = new RolloutProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<RolloutConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<RolloutConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
