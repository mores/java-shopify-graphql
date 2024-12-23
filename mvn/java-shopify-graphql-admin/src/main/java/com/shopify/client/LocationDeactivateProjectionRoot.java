package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationDeactivateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationDeactivateProjectionRoot() {
    super(null, null, java.util.Optional.of("LocationDeactivatePayload"));
  }

  public LocationDeactivateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<LocationDeactivateProjectionRoot<PARENT, ROOT>, LocationDeactivateProjectionRoot<PARENT, ROOT>> location(
      ) {
    LocationProjection<LocationDeactivateProjectionRoot<PARENT, ROOT>, LocationDeactivateProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("location", projection);
    return projection;
  }

  public LocationDeactivateUserErrorProjection<LocationDeactivateProjectionRoot<PARENT, ROOT>, LocationDeactivateProjectionRoot<PARENT, ROOT>> locationDeactivateUserErrors(
      ) {
    LocationDeactivateUserErrorProjection<LocationDeactivateProjectionRoot<PARENT, ROOT>, LocationDeactivateProjectionRoot<PARENT, ROOT>> projection = new LocationDeactivateUserErrorProjection<>(this, this);    
    getFields().put("locationDeactivateUserErrors", projection);
    return projection;
  }
}
