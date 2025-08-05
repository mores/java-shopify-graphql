package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferLineItemUpdateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferLineItemUpdateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransferLineItemUpdate"));
  }

  public InventoryTransferLineItemUpdateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferLineItemUpdateProjection<PARENT, ROOT> deltaQuantity() {
    getFields().put("deltaQuantity", null);
    return this;
  }

  public InventoryTransferLineItemUpdateProjection<PARENT, ROOT> inventoryItemId() {
    getFields().put("inventoryItemId", null);
    return this;
  }

  public InventoryTransferLineItemUpdateProjection<PARENT, ROOT> newQuantity() {
    getFields().put("newQuantity", null);
    return this;
  }
}
