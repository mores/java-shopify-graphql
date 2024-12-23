package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationDeactivateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationDeactivateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocationDeactivateUserError"));
  }

  public LocationDeactivateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationDeactivateUserErrorCodeProjection<LocationDeactivateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     LocationDeactivateUserErrorCodeProjection<LocationDeactivateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new LocationDeactivateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public LocationDeactivateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public LocationDeactivateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
