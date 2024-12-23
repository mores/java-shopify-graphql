package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionPinUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionPinUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDefinitionPinUserError"));
  }

  public MetafieldDefinitionPinUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionPinUserErrorCodeProjection<MetafieldDefinitionPinUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     MetafieldDefinitionPinUserErrorCodeProjection<MetafieldDefinitionPinUserErrorProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionPinUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MetafieldDefinitionPinUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public MetafieldDefinitionPinUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
