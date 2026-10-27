package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderAttributionDefinitionUpsertUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderAttributionDefinitionUpsertUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderAttributionDefinitionUpsertUserError"));
  }

  public OrderAttributionDefinitionUpsertUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderAttributionDefinitionUpsertUserErrorCodeProjection<OrderAttributionDefinitionUpsertUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OrderAttributionDefinitionUpsertUserErrorCodeProjection<OrderAttributionDefinitionUpsertUserErrorProjection<PARENT, ROOT>, ROOT> projection = new OrderAttributionDefinitionUpsertUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OrderAttributionDefinitionUpsertUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public OrderAttributionDefinitionUpsertUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
