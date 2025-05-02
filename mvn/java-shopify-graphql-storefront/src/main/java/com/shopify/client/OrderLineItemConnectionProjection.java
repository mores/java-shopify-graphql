package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderLineItemConnection"));
  }

  public OrderLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderLineItemEdgeProjection<OrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     OrderLineItemEdgeProjection<OrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new OrderLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public OrderLineItemProjection<OrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     OrderLineItemProjection<OrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new OrderLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<OrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<OrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
