package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryTransferDeletePayload"));
  }

  public InventoryTransferDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferDeleteUserErrorProjection<InventoryTransferDeleteProjectionRoot<PARENT, ROOT>, InventoryTransferDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryTransferDeleteUserErrorProjection<InventoryTransferDeleteProjectionRoot<PARENT, ROOT>, InventoryTransferDeleteProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public InventoryTransferDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
