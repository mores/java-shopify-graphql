package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CarrierServiceUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CarrierServiceUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CarrierServiceUpdateUserError"));
  }

  public CarrierServiceUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CarrierServiceUpdateUserErrorCodeProjection<CarrierServiceUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CarrierServiceUpdateUserErrorCodeProjection<CarrierServiceUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CarrierServiceUpdateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CarrierServiceUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CarrierServiceUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
