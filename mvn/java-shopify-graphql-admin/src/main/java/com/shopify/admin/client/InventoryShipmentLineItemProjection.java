package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentLineItem"));
  }

  public InventoryShipmentLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemProjection<InventoryShipmentLineItemProjection<PARENT, ROOT>, ROOT> inventoryItem(
      ) {
     InventoryItemProjection<InventoryShipmentLineItemProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("inventoryItem", projection);
     return projection;
  }

  public InventoryShipmentLineItemProjection<PARENT, ROOT> acceptedQuantity() {
    getFields().put("acceptedQuantity", null);
    return this;
  }

  public InventoryShipmentLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryShipmentLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }

  public InventoryShipmentLineItemProjection<PARENT, ROOT> rejectedQuantity() {
    getFields().put("rejectedQuantity", null);
    return this;
  }

  public InventoryShipmentLineItemProjection<PARENT, ROOT> unreceivedQuantity() {
    getFields().put("unreceivedQuantity", null);
    return this;
  }
}
