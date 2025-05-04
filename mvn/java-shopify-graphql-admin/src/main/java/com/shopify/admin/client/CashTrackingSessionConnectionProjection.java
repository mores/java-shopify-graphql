package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashTrackingSessionConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashTrackingSessionConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashTrackingSessionConnection"));
  }

  public CashTrackingSessionConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashTrackingSessionEdgeProjection<CashTrackingSessionConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CashTrackingSessionEdgeProjection<CashTrackingSessionConnectionProjection<PARENT, ROOT>, ROOT> projection = new CashTrackingSessionEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CashTrackingSessionProjection<CashTrackingSessionConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CashTrackingSessionProjection<CashTrackingSessionConnectionProjection<PARENT, ROOT>, ROOT> projection = new CashTrackingSessionProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CashTrackingSessionConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CashTrackingSessionConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
