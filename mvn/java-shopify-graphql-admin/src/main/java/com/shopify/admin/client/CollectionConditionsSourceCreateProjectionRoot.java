package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionConditionsSourceCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionConditionsSourceCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionConditionsSourceCreatePayload"));
  }

  public CollectionConditionsSourceCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionConditionsSourceProjection<CollectionConditionsSourceCreateProjectionRoot<PARENT, ROOT>, CollectionConditionsSourceCreateProjectionRoot<PARENT, ROOT>> source(
      ) {
    CollectionConditionsSourceProjection<CollectionConditionsSourceCreateProjectionRoot<PARENT, ROOT>, CollectionConditionsSourceCreateProjectionRoot<PARENT, ROOT>> projection = new CollectionConditionsSourceProjection<>(this, this);    
    getFields().put("source", projection);
    return projection;
  }

  public UserErrorProjection<CollectionConditionsSourceCreateProjectionRoot<PARENT, ROOT>, CollectionConditionsSourceCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CollectionConditionsSourceCreateProjectionRoot<PARENT, ROOT>, CollectionConditionsSourceCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
