package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderConnection"));
  }

  public OrderConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderEdgeProjection<OrderConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     OrderEdgeProjection<OrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new OrderEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public OrderProjection<OrderConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     OrderProjection<OrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<OrderConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<OrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
