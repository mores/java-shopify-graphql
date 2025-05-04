package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionPublishProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionPublishProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionPublishPayload"));
  }

  public CollectionPublishProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionProjection<CollectionPublishProjectionRoot<PARENT, ROOT>, CollectionPublishProjectionRoot<PARENT, ROOT>> collection(
      ) {
    CollectionProjection<CollectionPublishProjectionRoot<PARENT, ROOT>, CollectionPublishProjectionRoot<PARENT, ROOT>> projection = new CollectionProjection<>(this, this);    
    getFields().put("collection", projection);
    return projection;
  }

  public CollectionPublicationProjection<CollectionPublishProjectionRoot<PARENT, ROOT>, CollectionPublishProjectionRoot<PARENT, ROOT>> collectionPublications(
      ) {
    CollectionPublicationProjection<CollectionPublishProjectionRoot<PARENT, ROOT>, CollectionPublishProjectionRoot<PARENT, ROOT>> projection = new CollectionPublicationProjection<>(this, this);    
    getFields().put("collectionPublications", projection);
    return projection;
  }

  public ShopProjection<CollectionPublishProjectionRoot<PARENT, ROOT>, CollectionPublishProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<CollectionPublishProjectionRoot<PARENT, ROOT>, CollectionPublishProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<CollectionPublishProjectionRoot<PARENT, ROOT>, CollectionPublishProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CollectionPublishProjectionRoot<PARENT, ROOT>, CollectionPublishProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
