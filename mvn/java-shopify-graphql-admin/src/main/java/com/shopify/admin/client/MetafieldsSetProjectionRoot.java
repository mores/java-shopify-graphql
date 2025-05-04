package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldsSetProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldsSetProjectionRoot() {
    super(null, null, java.util.Optional.of("MetafieldsSetPayload"));
  }

  public MetafieldsSetProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldProjection<MetafieldsSetProjectionRoot<PARENT, ROOT>, MetafieldsSetProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldProjection<MetafieldsSetProjectionRoot<PARENT, ROOT>, MetafieldsSetProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldsSetUserErrorProjection<MetafieldsSetProjectionRoot<PARENT, ROOT>, MetafieldsSetProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetafieldsSetUserErrorProjection<MetafieldsSetProjectionRoot<PARENT, ROOT>, MetafieldsSetProjectionRoot<PARENT, ROOT>> projection = new MetafieldsSetUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
