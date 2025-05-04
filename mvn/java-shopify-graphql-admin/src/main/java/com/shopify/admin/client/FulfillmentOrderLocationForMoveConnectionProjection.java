package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderLocationForMoveConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderLocationForMoveConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderLocationForMoveConnection"));
  }

  public FulfillmentOrderLocationForMoveConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderLocationForMoveEdgeProjection<FulfillmentOrderLocationForMoveConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     FulfillmentOrderLocationForMoveEdgeProjection<FulfillmentOrderLocationForMoveConnectionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLocationForMoveEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public FulfillmentOrderLocationForMoveProjection<FulfillmentOrderLocationForMoveConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     FulfillmentOrderLocationForMoveProjection<FulfillmentOrderLocationForMoveConnectionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLocationForMoveProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<FulfillmentOrderLocationForMoveConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<FulfillmentOrderLocationForMoveConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
