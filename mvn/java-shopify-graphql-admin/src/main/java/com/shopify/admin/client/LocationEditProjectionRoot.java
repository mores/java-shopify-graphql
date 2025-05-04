package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationEditProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationEditProjectionRoot() {
    super(null, null, java.util.Optional.of("LocationEditPayload"));
  }

  public LocationEditProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<LocationEditProjectionRoot<PARENT, ROOT>, LocationEditProjectionRoot<PARENT, ROOT>> location(
      ) {
    LocationProjection<LocationEditProjectionRoot<PARENT, ROOT>, LocationEditProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("location", projection);
    return projection;
  }

  public LocationEditUserErrorProjection<LocationEditProjectionRoot<PARENT, ROOT>, LocationEditProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    LocationEditUserErrorProjection<LocationEditProjectionRoot<PARENT, ROOT>, LocationEditProjectionRoot<PARENT, ROOT>> projection = new LocationEditUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
