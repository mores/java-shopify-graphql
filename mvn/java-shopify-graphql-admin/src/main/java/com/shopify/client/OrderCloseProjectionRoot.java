package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCloseProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCloseProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderClosePayload"));
  }

  public OrderCloseProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderProjection<OrderCloseProjectionRoot<PARENT, ROOT>, OrderCloseProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<OrderCloseProjectionRoot<PARENT, ROOT>, OrderCloseProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public UserErrorProjection<OrderCloseProjectionRoot<PARENT, ROOT>, OrderCloseProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<OrderCloseProjectionRoot<PARENT, ROOT>, OrderCloseProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
