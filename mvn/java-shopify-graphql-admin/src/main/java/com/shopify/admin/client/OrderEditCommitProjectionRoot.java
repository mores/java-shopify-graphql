package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditCommitProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditCommitProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderEditCommitPayload"));
  }

  public OrderEditCommitProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderProjection<OrderEditCommitProjectionRoot<PARENT, ROOT>, OrderEditCommitProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<OrderEditCommitProjectionRoot<PARENT, ROOT>, OrderEditCommitProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public UserErrorProjection<OrderEditCommitProjectionRoot<PARENT, ROOT>, OrderEditCommitProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<OrderEditCommitProjectionRoot<PARENT, ROOT>, OrderEditCommitProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
