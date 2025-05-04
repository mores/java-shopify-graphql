package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrdersProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrdersProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderConnection"));
  }

  public OrdersProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderEdgeProjection<OrdersProjectionRoot<PARENT, ROOT>, OrdersProjectionRoot<PARENT, ROOT>> edges(
      ) {
    OrderEdgeProjection<OrdersProjectionRoot<PARENT, ROOT>, OrdersProjectionRoot<PARENT, ROOT>> projection = new OrderEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public OrderProjection<OrdersProjectionRoot<PARENT, ROOT>, OrdersProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    OrderProjection<OrdersProjectionRoot<PARENT, ROOT>, OrdersProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<OrdersProjectionRoot<PARENT, ROOT>, OrdersProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<OrdersProjectionRoot<PARENT, ROOT>, OrdersProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
