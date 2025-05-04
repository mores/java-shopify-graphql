package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("MetaobjectUpdatePayload"));
  }

  public MetaobjectUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectProjection<MetaobjectUpdateProjectionRoot<PARENT, ROOT>, MetaobjectUpdateProjectionRoot<PARENT, ROOT>> metaobject(
      ) {
    MetaobjectProjection<MetaobjectUpdateProjectionRoot<PARENT, ROOT>, MetaobjectUpdateProjectionRoot<PARENT, ROOT>> projection = new MetaobjectProjection<>(this, this);    
    getFields().put("metaobject", projection);
    return projection;
  }

  public MetaobjectUserErrorProjection<MetaobjectUpdateProjectionRoot<PARENT, ROOT>, MetaobjectUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetaobjectUserErrorProjection<MetaobjectUpdateProjectionRoot<PARENT, ROOT>, MetaobjectUpdateProjectionRoot<PARENT, ROOT>> projection = new MetaobjectUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
