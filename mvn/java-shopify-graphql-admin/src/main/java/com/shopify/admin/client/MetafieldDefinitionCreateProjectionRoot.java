package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldDefinitionCreatePayload"));
  }

  public MetafieldDefinitionCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionProjection<MetafieldDefinitionCreateProjectionRoot<PARENT, ROOT>, MetafieldDefinitionCreateProjectionRoot<PARENT, ROOT>> createdDefinition(
      ) {
    MetafieldDefinitionProjection<MetafieldDefinitionCreateProjectionRoot<PARENT, ROOT>, MetafieldDefinitionCreateProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionProjection<>(this, this);    
    getFields().put("createdDefinition", projection);
    return projection;
  }

  public MetafieldDefinitionCreateUserErrorProjection<MetafieldDefinitionCreateProjectionRoot<PARENT, ROOT>, MetafieldDefinitionCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetafieldDefinitionCreateUserErrorProjection<MetafieldDefinitionCreateProjectionRoot<PARENT, ROOT>, MetafieldDefinitionCreateProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
