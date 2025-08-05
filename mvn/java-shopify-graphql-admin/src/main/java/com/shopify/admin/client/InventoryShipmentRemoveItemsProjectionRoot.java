package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentRemoveItemsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentRemoveItemsProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryShipmentRemoveItemsPayload"));
  }

  public InventoryShipmentRemoveItemsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentProjection<InventoryShipmentRemoveItemsProjectionRoot<PARENT, ROOT>, InventoryShipmentRemoveItemsProjectionRoot<PARENT, ROOT>> inventoryShipment(
      ) {
    InventoryShipmentProjection<InventoryShipmentRemoveItemsProjectionRoot<PARENT, ROOT>, InventoryShipmentRemoveItemsProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentProjection<>(this, this);    
    getFields().put("inventoryShipment", projection);
    return projection;
  }

  public InventoryShipmentRemoveItemsUserErrorProjection<InventoryShipmentRemoveItemsProjectionRoot<PARENT, ROOT>, InventoryShipmentRemoveItemsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryShipmentRemoveItemsUserErrorProjection<InventoryShipmentRemoveItemsProjectionRoot<PARENT, ROOT>, InventoryShipmentRemoveItemsProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentRemoveItemsUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
