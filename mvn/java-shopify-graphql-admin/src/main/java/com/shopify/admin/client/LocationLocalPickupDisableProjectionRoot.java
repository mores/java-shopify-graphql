package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationLocalPickupDisableProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationLocalPickupDisableProjectionRoot() {
    super(null, null, java.util.Optional.of("LocationLocalPickupDisablePayload"));
  }

  public LocationLocalPickupDisableProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryLocationLocalPickupSettingsErrorProjection<LocationLocalPickupDisableProjectionRoot<PARENT, ROOT>, LocationLocalPickupDisableProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DeliveryLocationLocalPickupSettingsErrorProjection<LocationLocalPickupDisableProjectionRoot<PARENT, ROOT>, LocationLocalPickupDisableProjectionRoot<PARENT, ROOT>> projection = new DeliveryLocationLocalPickupSettingsErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public LocationLocalPickupDisableProjectionRoot<PARENT, ROOT> locationId() {
    getFields().put("locationId", null);
    return this;
  }
}
