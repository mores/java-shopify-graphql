package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderDeletePayload"));
  }

  public OrderDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderDeleteUserErrorProjection<OrderDeleteProjectionRoot<PARENT, ROOT>, OrderDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderDeleteUserErrorProjection<OrderDeleteProjectionRoot<PARENT, ROOT>, OrderDeleteProjectionRoot<PARENT, ROOT>> projection = new OrderDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public OrderDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
