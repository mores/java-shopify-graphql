package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashTrackingSessionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashTrackingSessionsProjectionRoot() {
    super(null, null, java.util.Optional.of("CashTrackingSessionConnection"));
  }

  public CashTrackingSessionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashTrackingSessionEdgeProjection<CashTrackingSessionsProjectionRoot<PARENT, ROOT>, CashTrackingSessionsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    CashTrackingSessionEdgeProjection<CashTrackingSessionsProjectionRoot<PARENT, ROOT>, CashTrackingSessionsProjectionRoot<PARENT, ROOT>> projection = new CashTrackingSessionEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public CashTrackingSessionProjection<CashTrackingSessionsProjectionRoot<PARENT, ROOT>, CashTrackingSessionsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    CashTrackingSessionProjection<CashTrackingSessionsProjectionRoot<PARENT, ROOT>, CashTrackingSessionsProjectionRoot<PARENT, ROOT>> projection = new CashTrackingSessionProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<CashTrackingSessionsProjectionRoot<PARENT, ROOT>, CashTrackingSessionsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<CashTrackingSessionsProjectionRoot<PARENT, ROOT>, CashTrackingSessionsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
