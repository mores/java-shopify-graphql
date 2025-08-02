package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferMarkAsReadyToShipProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferMarkAsReadyToShipProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryTransferMarkAsReadyToShipPayload"));
  }

  public InventoryTransferMarkAsReadyToShipProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferProjection<InventoryTransferMarkAsReadyToShipProjectionRoot<PARENT, ROOT>, InventoryTransferMarkAsReadyToShipProjectionRoot<PARENT, ROOT>> inventoryTransfer(
      ) {
    InventoryTransferProjection<InventoryTransferMarkAsReadyToShipProjectionRoot<PARENT, ROOT>, InventoryTransferMarkAsReadyToShipProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferProjection<>(this, this);    
    getFields().put("inventoryTransfer", projection);
    return projection;
  }

  public InventoryTransferMarkAsReadyToShipUserErrorProjection<InventoryTransferMarkAsReadyToShipProjectionRoot<PARENT, ROOT>, InventoryTransferMarkAsReadyToShipProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryTransferMarkAsReadyToShipUserErrorProjection<InventoryTransferMarkAsReadyToShipProjectionRoot<PARENT, ROOT>, InventoryTransferMarkAsReadyToShipProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferMarkAsReadyToShipUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
