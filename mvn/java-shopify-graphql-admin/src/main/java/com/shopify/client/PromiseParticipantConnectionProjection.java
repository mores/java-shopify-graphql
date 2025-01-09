package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PromiseParticipantConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PromiseParticipantConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PromiseParticipantConnection"));
  }

  public PromiseParticipantConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PromiseParticipantEdgeProjection<PromiseParticipantConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     PromiseParticipantEdgeProjection<PromiseParticipantConnectionProjection<PARENT, ROOT>, ROOT> projection = new PromiseParticipantEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PromiseParticipantProjection<PromiseParticipantConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     PromiseParticipantProjection<PromiseParticipantConnectionProjection<PARENT, ROOT>, ROOT> projection = new PromiseParticipantProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<PromiseParticipantConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<PromiseParticipantConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
