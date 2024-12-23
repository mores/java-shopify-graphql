package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionCreatePayload"));
  }

  public CollectionCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionProjection<CollectionCreateProjectionRoot<PARENT, ROOT>, CollectionCreateProjectionRoot<PARENT, ROOT>> collection(
      ) {
    CollectionProjection<CollectionCreateProjectionRoot<PARENT, ROOT>, CollectionCreateProjectionRoot<PARENT, ROOT>> projection = new CollectionProjection<>(this, this);    
    getFields().put("collection", projection);
    return projection;
  }

  public UserErrorProjection<CollectionCreateProjectionRoot<PARENT, ROOT>, CollectionCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CollectionCreateProjectionRoot<PARENT, ROOT>, CollectionCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
