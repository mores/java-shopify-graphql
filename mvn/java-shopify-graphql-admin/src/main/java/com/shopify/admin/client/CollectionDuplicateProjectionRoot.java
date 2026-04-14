package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionDuplicateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionDuplicateProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionDuplicatePayload"));
  }

  public CollectionDuplicateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionProjection<CollectionDuplicateProjectionRoot<PARENT, ROOT>, CollectionDuplicateProjectionRoot<PARENT, ROOT>> collection(
      ) {
    CollectionProjection<CollectionDuplicateProjectionRoot<PARENT, ROOT>, CollectionDuplicateProjectionRoot<PARENT, ROOT>> projection = new CollectionProjection<>(this, this);    
    getFields().put("collection", projection);
    return projection;
  }

  public JobProjection<CollectionDuplicateProjectionRoot<PARENT, ROOT>, CollectionDuplicateProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<CollectionDuplicateProjectionRoot<PARENT, ROOT>, CollectionDuplicateProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public CollectionDuplicateUserErrorProjection<CollectionDuplicateProjectionRoot<PARENT, ROOT>, CollectionDuplicateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CollectionDuplicateUserErrorProjection<CollectionDuplicateProjectionRoot<PARENT, ROOT>, CollectionDuplicateProjectionRoot<PARENT, ROOT>> projection = new CollectionDuplicateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
