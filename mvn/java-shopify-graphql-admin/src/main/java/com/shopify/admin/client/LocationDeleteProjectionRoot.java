package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("LocationDeletePayload"));
  }

  public LocationDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationDeleteUserErrorProjection<LocationDeleteProjectionRoot<PARENT, ROOT>, LocationDeleteProjectionRoot<PARENT, ROOT>> locationDeleteUserErrors(
      ) {
    LocationDeleteUserErrorProjection<LocationDeleteProjectionRoot<PARENT, ROOT>, LocationDeleteProjectionRoot<PARENT, ROOT>> projection = new LocationDeleteUserErrorProjection<>(this, this);    
    getFields().put("locationDeleteUserErrors", projection);
    return projection;
  }

  public LocationDeleteProjectionRoot<PARENT, ROOT> deletedLocationId() {
    getFields().put("deletedLocationId", null);
    return this;
  }
}
