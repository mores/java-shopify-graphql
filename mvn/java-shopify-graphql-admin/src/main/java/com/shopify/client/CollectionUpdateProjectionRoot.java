package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionUpdatePayload"));
  }

  public CollectionUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionProjection<CollectionUpdateProjectionRoot<PARENT, ROOT>, CollectionUpdateProjectionRoot<PARENT, ROOT>> collection(
      ) {
    CollectionProjection<CollectionUpdateProjectionRoot<PARENT, ROOT>, CollectionUpdateProjectionRoot<PARENT, ROOT>> projection = new CollectionProjection<>(this, this);    
    getFields().put("collection", projection);
    return projection;
  }

  public JobProjection<CollectionUpdateProjectionRoot<PARENT, ROOT>, CollectionUpdateProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<CollectionUpdateProjectionRoot<PARENT, ROOT>, CollectionUpdateProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public UserErrorProjection<CollectionUpdateProjectionRoot<PARENT, ROOT>, CollectionUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CollectionUpdateProjectionRoot<PARENT, ROOT>, CollectionUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
