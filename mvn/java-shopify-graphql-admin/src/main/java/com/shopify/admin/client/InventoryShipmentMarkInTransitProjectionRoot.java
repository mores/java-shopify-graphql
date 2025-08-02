package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentMarkInTransitProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentMarkInTransitProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryShipmentMarkInTransitPayload"));
  }

  public InventoryShipmentMarkInTransitProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentProjection<InventoryShipmentMarkInTransitProjectionRoot<PARENT, ROOT>, InventoryShipmentMarkInTransitProjectionRoot<PARENT, ROOT>> inventoryShipment(
      ) {
    InventoryShipmentProjection<InventoryShipmentMarkInTransitProjectionRoot<PARENT, ROOT>, InventoryShipmentMarkInTransitProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentProjection<>(this, this);    
    getFields().put("inventoryShipment", projection);
    return projection;
  }

  public InventoryShipmentMarkInTransitUserErrorProjection<InventoryShipmentMarkInTransitProjectionRoot<PARENT, ROOT>, InventoryShipmentMarkInTransitProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryShipmentMarkInTransitUserErrorProjection<InventoryShipmentMarkInTransitProjectionRoot<PARENT, ROOT>, InventoryShipmentMarkInTransitProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentMarkInTransitUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
