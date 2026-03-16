package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferRemoveItemsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferRemoveItemsProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryTransferRemoveItemsPayload"));
  }

  public InventoryTransferRemoveItemsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferProjection<InventoryTransferRemoveItemsProjectionRoot<PARENT, ROOT>, InventoryTransferRemoveItemsProjectionRoot<PARENT, ROOT>> inventoryTransfer(
      ) {
    InventoryTransferProjection<InventoryTransferRemoveItemsProjectionRoot<PARENT, ROOT>, InventoryTransferRemoveItemsProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferProjection<>(this, this);    
    getFields().put("inventoryTransfer", projection);
    return projection;
  }

  public InventoryTransferLineItemUpdateProjection<InventoryTransferRemoveItemsProjectionRoot<PARENT, ROOT>, InventoryTransferRemoveItemsProjectionRoot<PARENT, ROOT>> removedQuantities(
      ) {
    InventoryTransferLineItemUpdateProjection<InventoryTransferRemoveItemsProjectionRoot<PARENT, ROOT>, InventoryTransferRemoveItemsProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferLineItemUpdateProjection<>(this, this);    
    getFields().put("removedQuantities", projection);
    return projection;
  }

  public InventoryTransferRemoveItemsUserErrorProjection<InventoryTransferRemoveItemsProjectionRoot<PARENT, ROOT>, InventoryTransferRemoveItemsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryTransferRemoveItemsUserErrorProjection<InventoryTransferRemoveItemsProjectionRoot<PARENT, ROOT>, InventoryTransferRemoveItemsProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferRemoveItemsUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
