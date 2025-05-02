package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartMetafieldsSetProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartMetafieldsSetProjectionRoot() {
    super(null, null, java.util.Optional.of("CartMetafieldsSetPayload"));
  }

  public CartMetafieldsSetProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldProjection<CartMetafieldsSetProjectionRoot<PARENT, ROOT>, CartMetafieldsSetProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldProjection<CartMetafieldsSetProjectionRoot<PARENT, ROOT>, CartMetafieldsSetProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldsSetUserErrorProjection<CartMetafieldsSetProjectionRoot<PARENT, ROOT>, CartMetafieldsSetProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetafieldsSetUserErrorProjection<CartMetafieldsSetProjectionRoot<PARENT, ROOT>, CartMetafieldsSetProjectionRoot<PARENT, ROOT>> projection = new MetafieldsSetUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
