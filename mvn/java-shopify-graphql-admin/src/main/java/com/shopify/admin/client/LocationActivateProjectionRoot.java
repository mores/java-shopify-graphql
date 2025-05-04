package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationActivateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationActivateProjectionRoot() {
    super(null, null, java.util.Optional.of("LocationActivatePayload"));
  }

  public LocationActivateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<LocationActivateProjectionRoot<PARENT, ROOT>, LocationActivateProjectionRoot<PARENT, ROOT>> location(
      ) {
    LocationProjection<LocationActivateProjectionRoot<PARENT, ROOT>, LocationActivateProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("location", projection);
    return projection;
  }

  public LocationActivateUserErrorProjection<LocationActivateProjectionRoot<PARENT, ROOT>, LocationActivateProjectionRoot<PARENT, ROOT>> locationActivateUserErrors(
      ) {
    LocationActivateUserErrorProjection<LocationActivateProjectionRoot<PARENT, ROOT>, LocationActivateProjectionRoot<PARENT, ROOT>> projection = new LocationActivateUserErrorProjection<>(this, this);    
    getFields().put("locationActivateUserErrors", projection);
    return projection;
  }
}
