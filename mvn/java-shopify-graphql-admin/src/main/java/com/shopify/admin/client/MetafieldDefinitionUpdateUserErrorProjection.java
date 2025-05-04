package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDefinitionUpdateUserError"));
  }

  public MetafieldDefinitionUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionUpdateUserErrorCodeProjection<MetafieldDefinitionUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     MetafieldDefinitionUpdateUserErrorCodeProjection<MetafieldDefinitionUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionUpdateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MetafieldDefinitionUpdateUserErrorProjection<PARENT, ROOT> elementIndex() {
    getFields().put("elementIndex", null);
    return this;
  }

  public MetafieldDefinitionUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public MetafieldDefinitionUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
