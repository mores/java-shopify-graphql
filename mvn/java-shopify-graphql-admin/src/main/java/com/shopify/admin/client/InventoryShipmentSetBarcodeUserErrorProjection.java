package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentSetBarcodeUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentSetBarcodeUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentSetBarcodeUserError"));
  }

  public InventoryShipmentSetBarcodeUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentSetBarcodeUserErrorCodeProjection<InventoryShipmentSetBarcodeUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryShipmentSetBarcodeUserErrorCodeProjection<InventoryShipmentSetBarcodeUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentSetBarcodeUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryShipmentSetBarcodeUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryShipmentSetBarcodeUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
