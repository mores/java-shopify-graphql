package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderOpenProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderOpenProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderOpenPayload"));
  }

  public OrderOpenProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderProjection<OrderOpenProjectionRoot<PARENT, ROOT>, OrderOpenProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<OrderOpenProjectionRoot<PARENT, ROOT>, OrderOpenProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public UserErrorProjection<OrderOpenProjectionRoot<PARENT, ROOT>, OrderOpenProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<OrderOpenProjectionRoot<PARENT, ROOT>, OrderOpenProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
