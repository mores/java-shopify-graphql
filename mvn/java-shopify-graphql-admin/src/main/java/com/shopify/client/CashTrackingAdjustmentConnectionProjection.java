package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashTrackingAdjustmentConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashTrackingAdjustmentConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashTrackingAdjustmentConnection"));
  }

  public CashTrackingAdjustmentConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashTrackingAdjustmentEdgeProjection<CashTrackingAdjustmentConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CashTrackingAdjustmentEdgeProjection<CashTrackingAdjustmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new CashTrackingAdjustmentEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CashTrackingAdjustmentProjection<CashTrackingAdjustmentConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CashTrackingAdjustmentProjection<CashTrackingAdjustmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new CashTrackingAdjustmentProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CashTrackingAdjustmentConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CashTrackingAdjustmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
