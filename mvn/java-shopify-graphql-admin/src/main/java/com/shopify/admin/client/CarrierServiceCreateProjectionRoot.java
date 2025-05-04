package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CarrierServiceCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CarrierServiceCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CarrierServiceCreatePayload"));
  }

  public CarrierServiceCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCarrierServiceProjection<CarrierServiceCreateProjectionRoot<PARENT, ROOT>, CarrierServiceCreateProjectionRoot<PARENT, ROOT>> carrierService(
      ) {
    DeliveryCarrierServiceProjection<CarrierServiceCreateProjectionRoot<PARENT, ROOT>, CarrierServiceCreateProjectionRoot<PARENT, ROOT>> projection = new DeliveryCarrierServiceProjection<>(this, this);    
    getFields().put("carrierService", projection);
    return projection;
  }

  public CarrierServiceCreateUserErrorProjection<CarrierServiceCreateProjectionRoot<PARENT, ROOT>, CarrierServiceCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CarrierServiceCreateUserErrorProjection<CarrierServiceCreateProjectionRoot<PARENT, ROOT>, CarrierServiceCreateProjectionRoot<PARENT, ROOT>> projection = new CarrierServiceCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
