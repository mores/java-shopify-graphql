package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CarrierServiceDeleteUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CarrierServiceDeleteUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CarrierServiceDeleteUserError"));
  }

  public CarrierServiceDeleteUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CarrierServiceDeleteUserErrorCodeProjection<CarrierServiceDeleteUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CarrierServiceDeleteUserErrorCodeProjection<CarrierServiceDeleteUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CarrierServiceDeleteUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CarrierServiceDeleteUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CarrierServiceDeleteUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
