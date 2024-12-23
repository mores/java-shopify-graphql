package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderCreatePayload"));
  }

  public OrderCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderProjection<OrderCreateProjectionRoot<PARENT, ROOT>, OrderCreateProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<OrderCreateProjectionRoot<PARENT, ROOT>, OrderCreateProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public OrderCreateUserErrorProjection<OrderCreateProjectionRoot<PARENT, ROOT>, OrderCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderCreateUserErrorProjection<OrderCreateProjectionRoot<PARENT, ROOT>, OrderCreateProjectionRoot<PARENT, ROOT>> projection = new OrderCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
