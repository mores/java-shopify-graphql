package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RolloutChangeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RolloutChangeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RolloutChangeEdge"));
  }

  public RolloutChangeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RolloutChangeProjection<RolloutChangeEdgeProjection<PARENT, ROOT>, ROOT> node() {
     RolloutChangeProjection<RolloutChangeEdgeProjection<PARENT, ROOT>, ROOT> projection = new RolloutChangeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public RolloutChangeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
