package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditBeginProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditBeginProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderEditBeginPayload"));
  }

  public OrderEditBeginProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedOrderProjection<OrderEditBeginProjectionRoot<PARENT, ROOT>, OrderEditBeginProjectionRoot<PARENT, ROOT>> calculatedOrder(
      ) {
    CalculatedOrderProjection<OrderEditBeginProjectionRoot<PARENT, ROOT>, OrderEditBeginProjectionRoot<PARENT, ROOT>> projection = new CalculatedOrderProjection<>(this, this);    
    getFields().put("calculatedOrder", projection);
    return projection;
  }

  public UserErrorProjection<OrderEditBeginProjectionRoot<PARENT, ROOT>, OrderEditBeginProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<OrderEditBeginProjectionRoot<PARENT, ROOT>, OrderEditBeginProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
