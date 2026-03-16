package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentAddItemsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentAddItemsProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryShipmentAddItemsPayload"));
  }

  public InventoryShipmentAddItemsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentLineItemProjection<InventoryShipmentAddItemsProjectionRoot<PARENT, ROOT>, InventoryShipmentAddItemsProjectionRoot<PARENT, ROOT>> addedItems(
      ) {
    InventoryShipmentLineItemProjection<InventoryShipmentAddItemsProjectionRoot<PARENT, ROOT>, InventoryShipmentAddItemsProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentLineItemProjection<>(this, this);    
    getFields().put("addedItems", projection);
    return projection;
  }

  public InventoryShipmentProjection<InventoryShipmentAddItemsProjectionRoot<PARENT, ROOT>, InventoryShipmentAddItemsProjectionRoot<PARENT, ROOT>> inventoryShipment(
      ) {
    InventoryShipmentProjection<InventoryShipmentAddItemsProjectionRoot<PARENT, ROOT>, InventoryShipmentAddItemsProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentProjection<>(this, this);    
    getFields().put("inventoryShipment", projection);
    return projection;
  }

  public InventoryShipmentAddItemsUserErrorProjection<InventoryShipmentAddItemsProjectionRoot<PARENT, ROOT>, InventoryShipmentAddItemsProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryShipmentAddItemsUserErrorProjection<InventoryShipmentAddItemsProjectionRoot<PARENT, ROOT>, InventoryShipmentAddItemsProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentAddItemsUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
