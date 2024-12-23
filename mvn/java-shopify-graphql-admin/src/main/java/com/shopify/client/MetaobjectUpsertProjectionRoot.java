package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectUpsertProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectUpsertProjectionRoot() {
    super(null, null, java.util.Optional.of("MetaobjectUpsertPayload"));
  }

  public MetaobjectUpsertProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectProjection<MetaobjectUpsertProjectionRoot<PARENT, ROOT>, MetaobjectUpsertProjectionRoot<PARENT, ROOT>> metaobject(
      ) {
    MetaobjectProjection<MetaobjectUpsertProjectionRoot<PARENT, ROOT>, MetaobjectUpsertProjectionRoot<PARENT, ROOT>> projection = new MetaobjectProjection<>(this, this);    
    getFields().put("metaobject", projection);
    return projection;
  }

  public MetaobjectUserErrorProjection<MetaobjectUpsertProjectionRoot<PARENT, ROOT>, MetaobjectUpsertProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetaobjectUserErrorProjection<MetaobjectUpsertProjectionRoot<PARENT, ROOT>, MetaobjectUpsertProjectionRoot<PARENT, ROOT>> projection = new MetaobjectUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
