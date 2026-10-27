package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RolloutChangeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RolloutChangeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RolloutChangeConnection"));
  }

  public RolloutChangeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RolloutChangeEdgeProjection<RolloutChangeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     RolloutChangeEdgeProjection<RolloutChangeConnectionProjection<PARENT, ROOT>, ROOT> projection = new RolloutChangeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public RolloutChangeProjection<RolloutChangeConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     RolloutChangeProjection<RolloutChangeConnectionProjection<PARENT, ROOT>, ROOT> projection = new RolloutChangeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<RolloutChangeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<RolloutChangeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
