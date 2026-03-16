package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentSetTrackingProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentSetTrackingProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryShipmentSetTrackingPayload"));
  }

  public InventoryShipmentSetTrackingProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentProjection<InventoryShipmentSetTrackingProjectionRoot<PARENT, ROOT>, InventoryShipmentSetTrackingProjectionRoot<PARENT, ROOT>> inventoryShipment(
      ) {
    InventoryShipmentProjection<InventoryShipmentSetTrackingProjectionRoot<PARENT, ROOT>, InventoryShipmentSetTrackingProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentProjection<>(this, this);    
    getFields().put("inventoryShipment", projection);
    return projection;
  }

  public InventoryShipmentSetTrackingUserErrorProjection<InventoryShipmentSetTrackingProjectionRoot<PARENT, ROOT>, InventoryShipmentSetTrackingProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryShipmentSetTrackingUserErrorProjection<InventoryShipmentSetTrackingProjectionRoot<PARENT, ROOT>, InventoryShipmentSetTrackingProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentSetTrackingUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
