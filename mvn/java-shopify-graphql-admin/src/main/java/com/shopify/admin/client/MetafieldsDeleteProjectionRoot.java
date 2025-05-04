package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldsDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldsDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldsDeletePayload"));
  }

  public MetafieldsDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldIdentifierProjection<MetafieldsDeleteProjectionRoot<PARENT, ROOT>, MetafieldsDeleteProjectionRoot<PARENT, ROOT>> deletedMetafields(
      ) {
    MetafieldIdentifierProjection<MetafieldsDeleteProjectionRoot<PARENT, ROOT>, MetafieldsDeleteProjectionRoot<PARENT, ROOT>> projection = new MetafieldIdentifierProjection<>(this, this);    
    getFields().put("deletedMetafields", projection);
    return projection;
  }

  public UserErrorProjection<MetafieldsDeleteProjectionRoot<PARENT, ROOT>, MetafieldsDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<MetafieldsDeleteProjectionRoot<PARENT, ROOT>, MetafieldsDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
