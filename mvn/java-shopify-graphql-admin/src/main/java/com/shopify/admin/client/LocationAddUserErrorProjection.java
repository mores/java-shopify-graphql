package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationAddUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationAddUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocationAddUserError"));
  }

  public LocationAddUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationAddUserErrorCodeProjection<LocationAddUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     LocationAddUserErrorCodeProjection<LocationAddUserErrorProjection<PARENT, ROOT>, ROOT> projection = new LocationAddUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public LocationAddUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public LocationAddUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
