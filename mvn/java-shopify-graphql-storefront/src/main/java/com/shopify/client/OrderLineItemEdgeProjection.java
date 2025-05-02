package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderLineItemEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderLineItemEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderLineItemEdge"));
  }

  public OrderLineItemEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderLineItemProjection<OrderLineItemEdgeProjection<PARENT, ROOT>, ROOT> node() {
     OrderLineItemProjection<OrderLineItemEdgeProjection<PARENT, ROOT>, ROOT> projection = new OrderLineItemProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public OrderLineItemEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
