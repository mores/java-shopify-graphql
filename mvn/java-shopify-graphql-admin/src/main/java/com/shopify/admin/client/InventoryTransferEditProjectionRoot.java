package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferEditProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferEditProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryTransferEditPayload"));
  }

  public InventoryTransferEditProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferProjection<InventoryTransferEditProjectionRoot<PARENT, ROOT>, InventoryTransferEditProjectionRoot<PARENT, ROOT>> inventoryTransfer(
      ) {
    InventoryTransferProjection<InventoryTransferEditProjectionRoot<PARENT, ROOT>, InventoryTransferEditProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferProjection<>(this, this);    
    getFields().put("inventoryTransfer", projection);
    return projection;
  }

  public InventoryTransferEditUserErrorProjection<InventoryTransferEditProjectionRoot<PARENT, ROOT>, InventoryTransferEditProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryTransferEditUserErrorProjection<InventoryTransferEditProjectionRoot<PARENT, ROOT>, InventoryTransferEditProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferEditUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
