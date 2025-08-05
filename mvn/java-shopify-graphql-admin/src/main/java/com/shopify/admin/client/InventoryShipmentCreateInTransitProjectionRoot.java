package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentCreateInTransitProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentCreateInTransitProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryShipmentCreateInTransitPayload"));
  }

  public InventoryShipmentCreateInTransitProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentProjection<InventoryShipmentCreateInTransitProjectionRoot<PARENT, ROOT>, InventoryShipmentCreateInTransitProjectionRoot<PARENT, ROOT>> inventoryShipment(
      ) {
    InventoryShipmentProjection<InventoryShipmentCreateInTransitProjectionRoot<PARENT, ROOT>, InventoryShipmentCreateInTransitProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentProjection<>(this, this);    
    getFields().put("inventoryShipment", projection);
    return projection;
  }

  public InventoryShipmentCreateInTransitUserErrorProjection<InventoryShipmentCreateInTransitProjectionRoot<PARENT, ROOT>, InventoryShipmentCreateInTransitProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryShipmentCreateInTransitUserErrorProjection<InventoryShipmentCreateInTransitProjectionRoot<PARENT, ROOT>, InventoryShipmentCreateInTransitProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentCreateInTransitUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
