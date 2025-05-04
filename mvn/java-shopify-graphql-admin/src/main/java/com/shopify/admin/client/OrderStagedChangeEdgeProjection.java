package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderStagedChangeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderStagedChangeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderStagedChangeEdge"));
  }

  public OrderStagedChangeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderStagedChangeProjection<OrderStagedChangeEdgeProjection<PARENT, ROOT>, ROOT> node() {
     OrderStagedChangeProjection<OrderStagedChangeEdgeProjection<PARENT, ROOT>, ROOT> projection = new OrderStagedChangeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public OrderStagedChangeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
