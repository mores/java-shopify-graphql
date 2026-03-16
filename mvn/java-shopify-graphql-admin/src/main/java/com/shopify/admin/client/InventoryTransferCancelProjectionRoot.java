package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferCancelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferCancelProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryTransferCancelPayload"));
  }

  public InventoryTransferCancelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferProjection<InventoryTransferCancelProjectionRoot<PARENT, ROOT>, InventoryTransferCancelProjectionRoot<PARENT, ROOT>> inventoryTransfer(
      ) {
    InventoryTransferProjection<InventoryTransferCancelProjectionRoot<PARENT, ROOT>, InventoryTransferCancelProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferProjection<>(this, this);    
    getFields().put("inventoryTransfer", projection);
    return projection;
  }

  public InventoryTransferCancelUserErrorProjection<InventoryTransferCancelProjectionRoot<PARENT, ROOT>, InventoryTransferCancelProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryTransferCancelUserErrorProjection<InventoryTransferCancelProjectionRoot<PARENT, ROOT>, InventoryTransferCancelProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferCancelUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
