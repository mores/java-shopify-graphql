package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectDefinitionDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectDefinitionDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("MetaobjectDefinitionDeletePayload"));
  }

  public MetaobjectDefinitionDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectUserErrorProjection<MetaobjectDefinitionDeleteProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetaobjectUserErrorProjection<MetaobjectDefinitionDeleteProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionDeleteProjectionRoot<PARENT, ROOT>> projection = new MetaobjectUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MetaobjectDefinitionDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
