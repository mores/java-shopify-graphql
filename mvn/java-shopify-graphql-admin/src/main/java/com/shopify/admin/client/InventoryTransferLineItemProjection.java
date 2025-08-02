package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransferLineItem"));
  }

  public InventoryTransferLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemProjection<InventoryTransferLineItemProjection<PARENT, ROOT>, ROOT> inventoryItem(
      ) {
     InventoryItemProjection<InventoryTransferLineItemProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemProjection<>(this, getRoot());
     getFields().put("inventoryItem", projection);
     return projection;
  }

  public InventoryTransferLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryTransferLineItemProjection<PARENT, ROOT> pickedForShipmentQuantity() {
    getFields().put("pickedForShipmentQuantity", null);
    return this;
  }

  public InventoryTransferLineItemProjection<PARENT, ROOT> processableQuantity() {
    getFields().put("processableQuantity", null);
    return this;
  }

  public InventoryTransferLineItemProjection<PARENT, ROOT> shippableQuantity() {
    getFields().put("shippableQuantity", null);
    return this;
  }

  public InventoryTransferLineItemProjection<PARENT, ROOT> shippedQuantity() {
    getFields().put("shippedQuantity", null);
    return this;
  }

  public InventoryTransferLineItemProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public InventoryTransferLineItemProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }
}
