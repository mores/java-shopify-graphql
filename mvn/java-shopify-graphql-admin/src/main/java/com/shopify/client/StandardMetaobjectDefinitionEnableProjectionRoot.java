package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class StandardMetaobjectDefinitionEnableProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StandardMetaobjectDefinitionEnableProjectionRoot() {
    super(null, null, java.util.Optional.of("StandardMetaobjectDefinitionEnablePayload"));
  }

  public StandardMetaobjectDefinitionEnableProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectDefinitionProjection<StandardMetaobjectDefinitionEnableProjectionRoot<PARENT, ROOT>, StandardMetaobjectDefinitionEnableProjectionRoot<PARENT, ROOT>> metaobjectDefinition(
      ) {
    MetaobjectDefinitionProjection<StandardMetaobjectDefinitionEnableProjectionRoot<PARENT, ROOT>, StandardMetaobjectDefinitionEnableProjectionRoot<PARENT, ROOT>> projection = new MetaobjectDefinitionProjection<>(this, this);    
    getFields().put("metaobjectDefinition", projection);
    return projection;
  }

  public MetaobjectUserErrorProjection<StandardMetaobjectDefinitionEnableProjectionRoot<PARENT, ROOT>, StandardMetaobjectDefinitionEnableProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetaobjectUserErrorProjection<StandardMetaobjectDefinitionEnableProjectionRoot<PARENT, ROOT>, StandardMetaobjectDefinitionEnableProjectionRoot<PARENT, ROOT>> projection = new MetaobjectUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
