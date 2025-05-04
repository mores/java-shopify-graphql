package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionUnpinUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionUnpinUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDefinitionUnpinUserError"));
  }

  public MetafieldDefinitionUnpinUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionUnpinUserErrorCodeProjection<MetafieldDefinitionUnpinUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     MetafieldDefinitionUnpinUserErrorCodeProjection<MetafieldDefinitionUnpinUserErrorProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionUnpinUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MetafieldDefinitionUnpinUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public MetafieldDefinitionUnpinUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
