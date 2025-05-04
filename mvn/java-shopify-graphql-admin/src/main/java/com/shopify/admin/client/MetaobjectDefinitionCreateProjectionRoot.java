package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectDefinitionCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectDefinitionCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("MetaobjectDefinitionCreatePayload"));
  }

  public MetaobjectDefinitionCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectDefinitionProjection<MetaobjectDefinitionCreateProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionCreateProjectionRoot<PARENT, ROOT>> metaobjectDefinition(
      ) {
    MetaobjectDefinitionProjection<MetaobjectDefinitionCreateProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionCreateProjectionRoot<PARENT, ROOT>> projection = new MetaobjectDefinitionProjection<>(this, this);    
    getFields().put("metaobjectDefinition", projection);
    return projection;
  }

  public MetaobjectUserErrorProjection<MetaobjectDefinitionCreateProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetaobjectUserErrorProjection<MetaobjectDefinitionCreateProjectionRoot<PARENT, ROOT>, MetaobjectDefinitionCreateProjectionRoot<PARENT, ROOT>> projection = new MetaobjectUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
