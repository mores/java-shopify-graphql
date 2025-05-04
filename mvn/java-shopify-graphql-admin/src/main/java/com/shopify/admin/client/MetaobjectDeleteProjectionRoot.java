package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("MetaobjectDeletePayload"));
  }

  public MetaobjectDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectUserErrorProjection<MetaobjectDeleteProjectionRoot<PARENT, ROOT>, MetaobjectDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetaobjectUserErrorProjection<MetaobjectDeleteProjectionRoot<PARENT, ROOT>, MetaobjectDeleteProjectionRoot<PARENT, ROOT>> projection = new MetaobjectUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public MetaobjectDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
