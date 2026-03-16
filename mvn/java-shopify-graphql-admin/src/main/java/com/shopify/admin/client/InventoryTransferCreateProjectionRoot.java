package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryTransferCreatePayload"));
  }

  public InventoryTransferCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferProjection<InventoryTransferCreateProjectionRoot<PARENT, ROOT>, InventoryTransferCreateProjectionRoot<PARENT, ROOT>> inventoryTransfer(
      ) {
    InventoryTransferProjection<InventoryTransferCreateProjectionRoot<PARENT, ROOT>, InventoryTransferCreateProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferProjection<>(this, this);    
    getFields().put("inventoryTransfer", projection);
    return projection;
  }

  public InventoryTransferCreateUserErrorProjection<InventoryTransferCreateProjectionRoot<PARENT, ROOT>, InventoryTransferCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryTransferCreateUserErrorProjection<InventoryTransferCreateProjectionRoot<PARENT, ROOT>, InventoryTransferCreateProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
