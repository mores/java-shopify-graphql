package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderAttributionDefinitionDeleteUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderAttributionDefinitionDeleteUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderAttributionDefinitionDeleteUserError"));
  }

  public OrderAttributionDefinitionDeleteUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderAttributionDefinitionDeleteUserErrorCodeProjection<OrderAttributionDefinitionDeleteUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OrderAttributionDefinitionDeleteUserErrorCodeProjection<OrderAttributionDefinitionDeleteUserErrorProjection<PARENT, ROOT>, ROOT> projection = new OrderAttributionDefinitionDeleteUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OrderAttributionDefinitionDeleteUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public OrderAttributionDefinitionDeleteUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
