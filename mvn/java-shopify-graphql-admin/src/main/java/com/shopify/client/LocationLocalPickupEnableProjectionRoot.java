package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class LocationLocalPickupEnableProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationLocalPickupEnableProjectionRoot() {
    super(null, null, java.util.Optional.of("LocationLocalPickupEnablePayload"));
  }

  public LocationLocalPickupEnableProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryLocalPickupSettingsProjection<LocationLocalPickupEnableProjectionRoot<PARENT, ROOT>, LocationLocalPickupEnableProjectionRoot<PARENT, ROOT>> localPickupSettings(
      ) {
    DeliveryLocalPickupSettingsProjection<LocationLocalPickupEnableProjectionRoot<PARENT, ROOT>, LocationLocalPickupEnableProjectionRoot<PARENT, ROOT>> projection = new DeliveryLocalPickupSettingsProjection<>(this, this);    
    getFields().put("localPickupSettings", projection);
    return projection;
  }

  public DeliveryLocationLocalPickupSettingsErrorProjection<LocationLocalPickupEnableProjectionRoot<PARENT, ROOT>, LocationLocalPickupEnableProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    DeliveryLocationLocalPickupSettingsErrorProjection<LocationLocalPickupEnableProjectionRoot<PARENT, ROOT>, LocationLocalPickupEnableProjectionRoot<PARENT, ROOT>> projection = new DeliveryLocationLocalPickupSettingsErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
