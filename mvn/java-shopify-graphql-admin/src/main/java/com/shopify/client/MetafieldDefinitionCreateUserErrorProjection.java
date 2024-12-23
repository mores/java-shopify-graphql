package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDefinitionCreateUserError"));
  }

  public MetafieldDefinitionCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionCreateUserErrorCodeProjection<MetafieldDefinitionCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     MetafieldDefinitionCreateUserErrorCodeProjection<MetafieldDefinitionCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MetafieldDefinitionCreateUserErrorProjection<PARENT, ROOT> elementIndex() {
    getFields().put("elementIndex", null);
    return this;
  }

  public MetafieldDefinitionCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public MetafieldDefinitionCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
