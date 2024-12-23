package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionUnpublishProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionUnpublishProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionUnpublishPayload"));
  }

  public CollectionUnpublishProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionProjection<CollectionUnpublishProjectionRoot<PARENT, ROOT>, CollectionUnpublishProjectionRoot<PARENT, ROOT>> collection(
      ) {
    CollectionProjection<CollectionUnpublishProjectionRoot<PARENT, ROOT>, CollectionUnpublishProjectionRoot<PARENT, ROOT>> projection = new CollectionProjection<>(this, this);    
    getFields().put("collection", projection);
    return projection;
  }

  public ShopProjection<CollectionUnpublishProjectionRoot<PARENT, ROOT>, CollectionUnpublishProjectionRoot<PARENT, ROOT>> shop(
      ) {
    ShopProjection<CollectionUnpublishProjectionRoot<PARENT, ROOT>, CollectionUnpublishProjectionRoot<PARENT, ROOT>> projection = new ShopProjection<>(this, this);    
    getFields().put("shop", projection);
    return projection;
  }

  public UserErrorProjection<CollectionUnpublishProjectionRoot<PARENT, ROOT>, CollectionUnpublishProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CollectionUnpublishProjectionRoot<PARENT, ROOT>, CollectionUnpublishProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
