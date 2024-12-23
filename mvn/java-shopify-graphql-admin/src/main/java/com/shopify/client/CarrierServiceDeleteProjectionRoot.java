package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CarrierServiceDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CarrierServiceDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CarrierServiceDeletePayload"));
  }

  public CarrierServiceDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CarrierServiceDeleteUserErrorProjection<CarrierServiceDeleteProjectionRoot<PARENT, ROOT>, CarrierServiceDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CarrierServiceDeleteUserErrorProjection<CarrierServiceDeleteProjectionRoot<PARENT, ROOT>, CarrierServiceDeleteProjectionRoot<PARENT, ROOT>> projection = new CarrierServiceDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CarrierServiceDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
