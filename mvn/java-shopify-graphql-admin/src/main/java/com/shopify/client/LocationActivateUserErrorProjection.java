package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationActivateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationActivateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocationActivateUserError"));
  }

  public LocationActivateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationActivateUserErrorCodeProjection<LocationActivateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     LocationActivateUserErrorCodeProjection<LocationActivateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new LocationActivateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public LocationActivateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public LocationActivateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
