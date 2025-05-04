package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationEditUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationEditUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocationEditUserError"));
  }

  public LocationEditUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationEditUserErrorCodeProjection<LocationEditUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     LocationEditUserErrorCodeProjection<LocationEditUserErrorProjection<PARENT, ROOT>, ROOT> projection = new LocationEditUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public LocationEditUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public LocationEditUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
