package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CarrierServiceCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CarrierServiceCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CarrierServiceCreateUserError"));
  }

  public CarrierServiceCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CarrierServiceCreateUserErrorCodeProjection<CarrierServiceCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CarrierServiceCreateUserErrorCodeProjection<CarrierServiceCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CarrierServiceCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CarrierServiceCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CarrierServiceCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
