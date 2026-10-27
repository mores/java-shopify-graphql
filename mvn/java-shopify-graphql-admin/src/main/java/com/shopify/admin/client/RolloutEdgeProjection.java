package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RolloutEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RolloutEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RolloutEdge"));
  }

  public RolloutEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RolloutProjection<RolloutEdgeProjection<PARENT, ROOT>, ROOT> node() {
     RolloutProjection<RolloutEdgeProjection<PARENT, ROOT>, ROOT> projection = new RolloutProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public RolloutEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
