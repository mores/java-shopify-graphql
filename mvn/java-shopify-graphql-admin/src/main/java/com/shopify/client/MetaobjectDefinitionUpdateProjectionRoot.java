package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectDefinitionUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectDefinitionUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("MetaobjectDefinitionUpdatePayload"));
  }

  public MetaobjectDefinitionUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectDefinitionProjection<MetaobjectDefinitionUpdateProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionUpdateProjectionRoot<PARENT, ROOT>> metaobjectDefinition(
      ) {
    MetaobjectDefinitionProjection<MetaobjectDefinitionUpdateProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionUpdateProjectionRoot<PARENT, ROOT>> projection = new MetaobjectDefinitionProjection<>(this, this);    
    getFields().put("metaobjectDefinition", projection);
    return projection;
  }

  public MetaobjectUserErrorProjection<MetaobjectDefinitionUpdateProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetaobjectUserErrorProjection<MetaobjectDefinitionUpdateProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionUpdateProjectionRoot<PARENT, ROOT>> projection = new MetaobjectUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
