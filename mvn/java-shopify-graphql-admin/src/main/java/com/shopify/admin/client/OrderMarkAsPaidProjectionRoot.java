package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderMarkAsPaidProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderMarkAsPaidProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderMarkAsPaidPayload"));
  }

  public OrderMarkAsPaidProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderProjection<OrderMarkAsPaidProjectionRoot<PARENT, ROOT>, OrderMarkAsPaidProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<OrderMarkAsPaidProjectionRoot<PARENT, ROOT>, OrderMarkAsPaidProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public UserErrorProjection<OrderMarkAsPaidProjectionRoot<PARENT, ROOT>, OrderMarkAsPaidProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<OrderMarkAsPaidProjectionRoot<PARENT, ROOT>, OrderMarkAsPaidProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
