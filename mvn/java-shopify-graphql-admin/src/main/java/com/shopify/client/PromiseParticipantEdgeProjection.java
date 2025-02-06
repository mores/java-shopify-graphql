package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PromiseParticipantEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PromiseParticipantEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PromiseParticipantEdge"));
  }

  public PromiseParticipantEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PromiseParticipantProjection<PromiseParticipantEdgeProjection<PARENT, ROOT>, ROOT> node() {
     PromiseParticipantProjection<PromiseParticipantEdgeProjection<PARENT, ROOT>, ROOT> projection = new PromiseParticipantProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public PromiseParticipantEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
