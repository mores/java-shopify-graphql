package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StandardMetafieldDefinitionEnableProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StandardMetafieldDefinitionEnableProjectionRoot() {
    super(null, null, java.util.Optional.of("StandardMetafieldDefinitionEnablePayload"));
  }

  public StandardMetafieldDefinitionEnableProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionProjection<StandardMetafieldDefinitionEnableProjectionRoot<PARENT, ROOT>, StandardMetafieldDefinitionEnableProjectionRoot<PARENT, ROOT>> createdDefinition(
      ) {
    MetafieldDefinitionProjection<StandardMetafieldDefinitionEnableProjectionRoot<PARENT, ROOT>, StandardMetafieldDefinitionEnableProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionProjection<>(this, this);    
    getFields().put("createdDefinition", projection);
    return projection;
  }

  public StandardMetafieldDefinitionEnableUserErrorProjection<StandardMetafieldDefinitionEnableProjectionRoot<PARENT, ROOT>, StandardMetafieldDefinitionEnableProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    StandardMetafieldDefinitionEnableUserErrorProjection<StandardMetafieldDefinitionEnableProjectionRoot<PARENT, ROOT>, StandardMetafieldDefinitionEnableProjectionRoot<PARENT, ROOT>> projection = new StandardMetafieldDefinitionEnableUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
