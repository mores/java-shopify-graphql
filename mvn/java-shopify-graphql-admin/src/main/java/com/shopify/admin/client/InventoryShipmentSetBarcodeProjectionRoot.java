package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentSetBarcodeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentSetBarcodeProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryShipmentSetBarcodePayload"));
  }

  public InventoryShipmentSetBarcodeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentProjection<InventoryShipmentSetBarcodeProjectionRoot<PARENT, ROOT>, InventoryShipmentSetBarcodeProjectionRoot<PARENT, ROOT>> inventoryShipment(
      ) {
    InventoryShipmentProjection<InventoryShipmentSetBarcodeProjectionRoot<PARENT, ROOT>, InventoryShipmentSetBarcodeProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentProjection<>(this, this);    
    getFields().put("inventoryShipment", projection);
    return projection;
  }

  public InventoryShipmentSetBarcodeUserErrorProjection<InventoryShipmentSetBarcodeProjectionRoot<PARENT, ROOT>, InventoryShipmentSetBarcodeProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryShipmentSetBarcodeUserErrorProjection<InventoryShipmentSetBarcodeProjectionRoot<PARENT, ROOT>, InventoryShipmentSetBarcodeProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentSetBarcodeUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
