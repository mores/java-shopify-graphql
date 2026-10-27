package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderAttributionDefinitionDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderAttributionDefinitionDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderAttributionDefinitionDeletePayload"));
  }

  public OrderAttributionDefinitionDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderAttributionDefinitionDeleteUserErrorProjection<OrderAttributionDefinitionDeleteProjectionRoot<PARENT, ROOT>, OrderAttributionDefinitionDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderAttributionDefinitionDeleteUserErrorProjection<OrderAttributionDefinitionDeleteProjectionRoot<PARENT, ROOT>, OrderAttributionDefinitionDeleteProjectionRoot<PARENT, ROOT>> projection = new OrderAttributionDefinitionDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public OrderAttributionDefinitionDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
