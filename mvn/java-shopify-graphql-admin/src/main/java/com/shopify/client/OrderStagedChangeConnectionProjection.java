package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderStagedChangeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderStagedChangeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderStagedChangeConnection"));
  }

  public OrderStagedChangeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderStagedChangeEdgeProjection<OrderStagedChangeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     OrderStagedChangeEdgeProjection<OrderStagedChangeConnectionProjection<PARENT, ROOT>, ROOT> projection = new OrderStagedChangeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public OrderStagedChangeProjection<OrderStagedChangeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     OrderStagedChangeProjection<OrderStagedChangeConnectionProjection<PARENT, ROOT>, ROOT> projection = new OrderStagedChangeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<OrderStagedChangeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<OrderStagedChangeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
