package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashTrackingSessionEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashTrackingSessionEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashTrackingSessionEdge"));
  }

  public CashTrackingSessionEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashTrackingSessionProjection<CashTrackingSessionEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CashTrackingSessionProjection<CashTrackingSessionEdgeProjection<PARENT, ROOT>, ROOT> projection = new CashTrackingSessionProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CashTrackingSessionEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
