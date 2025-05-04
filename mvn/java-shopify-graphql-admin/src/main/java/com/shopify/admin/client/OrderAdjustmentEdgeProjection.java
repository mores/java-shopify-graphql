package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderAdjustmentEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderAdjustmentEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderAdjustmentEdge"));
  }

  public OrderAdjustmentEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderAdjustmentProjection<OrderAdjustmentEdgeProjection<PARENT, ROOT>, ROOT> node() {
     OrderAdjustmentProjection<OrderAdjustmentEdgeProjection<PARENT, ROOT>, ROOT> projection = new OrderAdjustmentProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public OrderAdjustmentEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
