package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionConditionsSourceDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionConditionsSourceDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CollectionConditionsSourceDeletePayload"));
  }

  public CollectionConditionsSourceDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<CollectionConditionsSourceDeleteProjectionRoot<PARENT, ROOT>, CollectionConditionsSourceDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CollectionConditionsSourceDeleteProjectionRoot<PARENT, ROOT>, CollectionConditionsSourceDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CollectionConditionsSourceDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
