package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldDefinitionDeletePayload"));
  }

  public MetafieldDefinitionDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionIdentifierProjection<MetafieldDefinitionDeleteProjectionRoot<PARENT, ROOT>, MetafieldDefinitionDeleteProjectionRoot<PARENT, ROOT>> deletedDefinition(
      ) {
    MetafieldDefinitionIdentifierProjection<MetafieldDefinitionDeleteProjectionRoot<PARENT, ROOT>, MetafieldDefinitionDeleteProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionIdentifierProjection<>(this, this);    
    getFields().put("deletedDefinition", projection);
    return projection;
  }

  public MetafieldDefinitionDeleteUserErrorProjection<MetafieldDefinitionDeleteProjectionRoot<PARENT, ROOT>, MetafieldDefinitionDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetafieldDefinitionDeleteUserErrorProjection<MetafieldDefinitionDeleteProjectionRoot<PARENT, ROOT>, MetafieldDefinitionDeleteProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MetafieldDefinitionDeleteProjectionRoot<PARENT, ROOT> deletedDefinitionId() {
    getFields().put("deletedDefinitionId", null);
    return this;
  }
}
