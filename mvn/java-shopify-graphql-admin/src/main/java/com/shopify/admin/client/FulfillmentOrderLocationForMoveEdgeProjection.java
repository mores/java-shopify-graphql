package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderLocationForMoveEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderLocationForMoveEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderLocationForMoveEdge"));
  }

  public FulfillmentOrderLocationForMoveEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderLocationForMoveProjection<FulfillmentOrderLocationForMoveEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     FulfillmentOrderLocationForMoveProjection<FulfillmentOrderLocationForMoveEdgeProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLocationForMoveProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public FulfillmentOrderLocationForMoveEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
