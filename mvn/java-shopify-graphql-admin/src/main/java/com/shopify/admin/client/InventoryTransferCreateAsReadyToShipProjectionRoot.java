package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferCreateAsReadyToShipProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferCreateAsReadyToShipProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryTransferCreateAsReadyToShipPayload"));
  }

  public InventoryTransferCreateAsReadyToShipProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferProjection<InventoryTransferCreateAsReadyToShipProjectionRoot<PARENT, ROOT>, InventoryTransferCreateAsReadyToShipProjectionRoot<PARENT, ROOT>> inventoryTransfer(
      ) {
    InventoryTransferProjection<InventoryTransferCreateAsReadyToShipProjectionRoot<PARENT, ROOT>, InventoryTransferCreateAsReadyToShipProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferProjection<>(this, this);    
    getFields().put("inventoryTransfer", projection);
    return projection;
  }

  public InventoryTransferCreateAsReadyToShipUserErrorProjection<InventoryTransferCreateAsReadyToShipProjectionRoot<PARENT, ROOT>, InventoryTransferCreateAsReadyToShipProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryTransferCreateAsReadyToShipUserErrorProjection<InventoryTransferCreateAsReadyToShipProjectionRoot<PARENT, ROOT>, InventoryTransferCreateAsReadyToShipProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferCreateAsReadyToShipUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
