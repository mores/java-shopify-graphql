package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentReceiveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentReceiveProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryShipmentReceivePayload"));
  }

  public InventoryShipmentReceiveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentProjection<InventoryShipmentReceiveProjectionRoot<PARENT, ROOT>, InventoryShipmentReceiveProjectionRoot<PARENT, ROOT>> inventoryShipment(
      ) {
    InventoryShipmentProjection<InventoryShipmentReceiveProjectionRoot<PARENT, ROOT>, InventoryShipmentReceiveProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentProjection<>(this, this);    
    getFields().put("inventoryShipment", projection);
    return projection;
  }

  public InventoryShipmentReceiveUserErrorProjection<InventoryShipmentReceiveProjectionRoot<PARENT, ROOT>, InventoryShipmentReceiveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryShipmentReceiveUserErrorProjection<InventoryShipmentReceiveProjectionRoot<PARENT, ROOT>, InventoryShipmentReceiveProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentReceiveUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
