package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashTrackingAdjustmentEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashTrackingAdjustmentEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashTrackingAdjustmentEdge"));
  }

  public CashTrackingAdjustmentEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashTrackingAdjustmentProjection<CashTrackingAdjustmentEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CashTrackingAdjustmentProjection<CashTrackingAdjustmentEdgeProjection<PARENT, ROOT>, ROOT> projection = new CashTrackingAdjustmentProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CashTrackingAdjustmentEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
