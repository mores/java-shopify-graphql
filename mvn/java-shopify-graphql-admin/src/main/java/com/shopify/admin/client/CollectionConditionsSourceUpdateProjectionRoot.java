package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionConditionsSourceUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionConditionsSourceUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionConditionsSourceUpdatePayload"));
  }

  public CollectionConditionsSourceUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionConditionsSourceProjection<CollectionConditionsSourceUpdateProjectionRoot<PARENT, ROOT>, CollectionConditionsSourceUpdateProjectionRoot<PARENT, ROOT>> source(
      ) {
    CollectionConditionsSourceProjection<CollectionConditionsSourceUpdateProjectionRoot<PARENT, ROOT>, CollectionConditionsSourceUpdateProjectionRoot<PARENT, ROOT>> projection = new CollectionConditionsSourceProjection<>(this, this);    
    getFields().put("source", projection);
    return projection;
  }

  public UserErrorProjection<CollectionConditionsSourceUpdateProjectionRoot<PARENT, ROOT>, CollectionConditionsSourceUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CollectionConditionsSourceUpdateProjectionRoot<PARENT, ROOT>, CollectionConditionsSourceUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
