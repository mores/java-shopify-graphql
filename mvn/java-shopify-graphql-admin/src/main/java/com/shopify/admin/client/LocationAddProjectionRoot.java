package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationAddProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationAddProjectionRoot() {
    super(null, null, java.util.Optional.of("LocationAddPayload"));
  }

  public LocationAddProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<LocationAddProjectionRoot<PARENT, ROOT>, LocationAddProjectionRoot<PARENT, ROOT>> location(
      ) {
    LocationProjection<LocationAddProjectionRoot<PARENT, ROOT>, LocationAddProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("location", projection);
    return projection;
  }

  public LocationAddUserErrorProjection<LocationAddProjectionRoot<PARENT, ROOT>, LocationAddProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    LocationAddUserErrorProjection<LocationAddProjectionRoot<PARENT, ROOT>, LocationAddProjectionRoot<PARENT, ROOT>> projection = new LocationAddUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
