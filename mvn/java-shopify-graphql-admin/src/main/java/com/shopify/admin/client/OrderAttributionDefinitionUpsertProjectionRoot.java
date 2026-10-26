package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderAttributionDefinitionUpsertProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderAttributionDefinitionUpsertProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderAttributionDefinitionUpsertPayload"));
  }

  public OrderAttributionDefinitionUpsertProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderAttributionDefinitionProjection<OrderAttributionDefinitionUpsertProjectionRoot<PARENT, ROOT>, OrderAttributionDefinitionUpsertProjectionRoot<PARENT, ROOT>> orderAttributionDefinition(
      ) {
    OrderAttributionDefinitionProjection<OrderAttributionDefinitionUpsertProjectionRoot<PARENT, ROOT>, OrderAttributionDefinitionUpsertProjectionRoot<PARENT, ROOT>> projection = new OrderAttributionDefinitionProjection<>(this, this);    
    getFields().put("orderAttributionDefinition", projection);
    return projection;
  }

  public OrderAttributionDefinitionUpsertUserErrorProjection<OrderAttributionDefinitionUpsertProjectionRoot<PARENT, ROOT>, OrderAttributionDefinitionUpsertProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderAttributionDefinitionUpsertUserErrorProjection<OrderAttributionDefinitionUpsertProjectionRoot<PARENT, ROOT>, OrderAttributionDefinitionUpsertProjectionRoot<PARENT, ROOT>> projection = new OrderAttributionDefinitionUpsertUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
