package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StandardMetafieldDefinitionEnableUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StandardMetafieldDefinitionEnableUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StandardMetafieldDefinitionEnableUserError"));
  }

  public StandardMetafieldDefinitionEnableUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StandardMetafieldDefinitionEnableUserErrorCodeProjection<StandardMetafieldDefinitionEnableUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     StandardMetafieldDefinitionEnableUserErrorCodeProjection<StandardMetafieldDefinitionEnableUserErrorProjection<PARENT, ROOT>, ROOT> projection = new StandardMetafieldDefinitionEnableUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public StandardMetafieldDefinitionEnableUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public StandardMetafieldDefinitionEnableUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
