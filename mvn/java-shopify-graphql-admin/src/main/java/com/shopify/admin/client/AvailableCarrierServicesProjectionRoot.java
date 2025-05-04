package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AvailableCarrierServicesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AvailableCarrierServicesProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryCarrierServiceAndLocations"));
  }

  public AvailableCarrierServicesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCarrierServiceProjection<AvailableCarrierServicesProjectionRoot<PARENT, ROOT>, AvailableCarrierServicesProjectionRoot<PARENT, ROOT>> carrierService(
      ) {
    DeliveryCarrierServiceProjection<AvailableCarrierServicesProjectionRoot<PARENT, ROOT>, AvailableCarrierServicesProjectionRoot<PARENT, ROOT>> projection = new DeliveryCarrierServiceProjection<>(this, this);    
    getFields().put("carrierService", projection);
    return projection;
  }

  public LocationProjection<AvailableCarrierServicesProjectionRoot<PARENT, ROOT>, AvailableCarrierServicesProjectionRoot<PARENT, ROOT>> locations(
      ) {
    LocationProjection<AvailableCarrierServicesProjectionRoot<PARENT, ROOT>, AvailableCarrierServicesProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("locations", projection);
    return projection;
  }
}
