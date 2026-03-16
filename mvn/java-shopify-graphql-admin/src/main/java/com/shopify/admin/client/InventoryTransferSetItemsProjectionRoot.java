package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferSetItemsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferSetItemsProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryTransferSetItemsPayload"));
  }

  public InventoryTransferSetItemsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferProjection<InventoryTransferSetItemsProjectionRoot<PARENT, ROOT>, InventoryTransferSetItemsProjectionRoot<PARENT, ROOT>> inventoryTransfer(
      ) {
    InventoryTransferProjection<InventoryTransferSetItemsProjectionRoot<PARENT, ROOT>, InventoryTransferSetItemsProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferProjection<>(this, this);    
    getFields().put("inventoryTransfer", projection);
    return projection;
  }

  public InventoryTransferLineItemUpdateProjection<InventoryTransferSetItemsProjectionRoot<PARENT, ROOT>, InventoryTransferSetItemsProjectionRoot<PARENT, ROOT>> updatedLineItems(
      ) {
    InventoryTransferLineItemUpdateProjection<InventoryTransferSetItemsProjectionRoot<PARENT, ROOT>, InventoryTransferSetItemsProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferLineItemUpdateProjection<>(this, this);    
    getFields().put("updatedLineItems", projection);
    return projection;
  }

  public InventoryTransferSetItemsUserErrorProjection<InventoryTransferSetItemsProjectionRoot<PARENT, ROOT>, InventoryTransferSetItemsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryTransferSetItemsUserErrorProjection<InventoryTransferSetItemsProjectionRoot<PARENT, ROOT>, InventoryTransferSetItemsProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferSetItemsUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
