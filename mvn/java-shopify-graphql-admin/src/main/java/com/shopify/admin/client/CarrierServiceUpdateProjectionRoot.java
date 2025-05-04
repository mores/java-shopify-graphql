package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CarrierServiceUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CarrierServiceUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CarrierServiceUpdatePayload"));
  }

  public CarrierServiceUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCarrierServiceProjection<CarrierServiceUpdateProjectionRoot<PARENT, ROOT>, CarrierServiceUpdateProjectionRoot<PARENT, ROOT>> carrierService(
      ) {
    DeliveryCarrierServiceProjection<CarrierServiceUpdateProjectionRoot<PARENT, ROOT>, CarrierServiceUpdateProjectionRoot<PARENT, ROOT>> projection = new DeliveryCarrierServiceProjection<>(this, this);    
    getFields().put("carrierService", projection);
    return projection;
  }

  public CarrierServiceUpdateUserErrorProjection<CarrierServiceUpdateProjectionRoot<PARENT, ROOT>, CarrierServiceUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CarrierServiceUpdateUserErrorProjection<CarrierServiceUpdateProjectionRoot<PARENT, ROOT>, CarrierServiceUpdateProjectionRoot<PARENT, ROOT>> projection = new CarrierServiceUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
