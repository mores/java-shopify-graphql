package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionPinProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionPinProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldDefinitionPinPayload"));
  }

  public MetafieldDefinitionPinProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionProjection<MetafieldDefinitionPinProjectionRoot<PARENT, ROOT>, MetafieldDefinitionPinProjectionRoot<PARENT, ROOT>> pinnedDefinition(
      ) {
    MetafieldDefinitionProjection<MetafieldDefinitionPinProjectionRoot<PARENT, ROOT>, MetafieldDefinitionPinProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionProjection<>(this, this);    
    getFields().put("pinnedDefinition", projection);
    return projection;
  }

  public MetafieldDefinitionPinUserErrorProjection<MetafieldDefinitionPinProjectionRoot<PARENT, ROOT>, MetafieldDefinitionPinProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetafieldDefinitionPinUserErrorProjection<MetafieldDefinitionPinProjectionRoot<PARENT, ROOT>, MetafieldDefinitionPinProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionPinUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
