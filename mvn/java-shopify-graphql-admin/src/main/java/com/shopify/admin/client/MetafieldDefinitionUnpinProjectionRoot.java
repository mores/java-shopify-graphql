package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDefinitionUnpinProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDefinitionUnpinProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldDefinitionUnpinPayload"));
  }

  public MetafieldDefinitionUnpinProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDefinitionProjection<MetafieldDefinitionUnpinProjectionRoot<PARENT, ROOT>, MetafieldDefinitionUnpinProjectionRoot<PARENT, ROOT>> unpinnedDefinition(
      ) {
    MetafieldDefinitionProjection<MetafieldDefinitionUnpinProjectionRoot<PARENT, ROOT>, MetafieldDefinitionUnpinProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionProjection<>(this, this);    
    getFields().put("unpinnedDefinition", projection);
    return projection;
  }

  public MetafieldDefinitionUnpinUserErrorProjection<MetafieldDefinitionUnpinProjectionRoot<PARENT, ROOT>, MetafieldDefinitionUnpinProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetafieldDefinitionUnpinUserErrorProjection<MetafieldDefinitionUnpinProjectionRoot<PARENT, ROOT>, MetafieldDefinitionUnpinProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionUnpinUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
