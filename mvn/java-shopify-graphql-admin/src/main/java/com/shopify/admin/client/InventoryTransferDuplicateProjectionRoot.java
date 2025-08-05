package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferDuplicateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferDuplicateProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryTransferDuplicatePayload"));
  }

  public InventoryTransferDuplicateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferProjection<InventoryTransferDuplicateProjectionRoot<PARENT, ROOT>, InventoryTransferDuplicateProjectionRoot<PARENT, ROOT>> inventoryTransfer(
      ) {
    InventoryTransferProjection<InventoryTransferDuplicateProjectionRoot<PARENT, ROOT>, InventoryTransferDuplicateProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferProjection<>(this, this);    
    getFields().put("inventoryTransfer", projection);
    return projection;
  }

  public InventoryTransferDuplicateUserErrorProjection<InventoryTransferDuplicateProjectionRoot<PARENT, ROOT>, InventoryTransferDuplicateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryTransferDuplicateUserErrorProjection<InventoryTransferDuplicateProjectionRoot<PARENT, ROOT>, InventoryTransferDuplicateProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferDuplicateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
