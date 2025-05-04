package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionDeletePayload"));
  }

  public CollectionDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopProjection<CollectionDeleteProjectionRoot<PARENT, ROOT>, CollectionDeleteProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<CollectionDeleteProjectionRoot<PARENT, ROOT>, CollectionDeleteProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<CollectionDeleteProjectionRoot<PARENT, ROOT>, CollectionDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CollectionDeleteProjectionRoot<PARENT, ROOT>, CollectionDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CollectionDeleteProjectionRoot<PARENT, ROOT> deletedCollectionId() {
    getFields().put("deletedCollectionId", null);
    return this;
  }
}
