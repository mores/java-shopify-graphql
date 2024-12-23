package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("MetaobjectCreatePayload"));
  }

  public MetaobjectCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectProjection<MetaobjectCreateProjectionRoot<PARENT, ROOT>, MetaobjectCreateProjectionRoot<PARENT, ROOT>> metaobject(
      ) {
    MetaobjectProjection<MetaobjectCreateProjectionRoot<PARENT, ROOT>, MetaobjectCreateProjectionRoot<PARENT, ROOT>> projection = new MetaobjectProjection<>(this, this);    
    getFields().put("metaobject", projection);
    return projection;
  }

  public MetaobjectUserErrorProjection<MetaobjectCreateProjectionRoot<PARENT, ROOT>, MetaobjectCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetaobjectUserErrorProjection<MetaobjectCreateProjectionRoot<PARENT, ROOT>, MetaobjectCreateProjectionRoot<PARENT, ROOT>> projection = new MetaobjectUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
