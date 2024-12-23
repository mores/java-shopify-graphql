package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderUpdatePayload"));
  }

  public OrderUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderProjection<OrderUpdateProjectionRoot<PARENT, ROOT>, OrderUpdateProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<OrderUpdateProjectionRoot<PARENT, ROOT>, OrderUpdateProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public UserErrorProjection<OrderUpdateProjectionRoot<PARENT, ROOT>, OrderUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<OrderUpdateProjectionRoot<PARENT, ROOT>, OrderUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
