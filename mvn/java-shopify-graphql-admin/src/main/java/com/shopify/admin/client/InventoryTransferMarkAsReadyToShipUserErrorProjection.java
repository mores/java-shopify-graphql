package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferMarkAsReadyToShipUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferMarkAsReadyToShipUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransferMarkAsReadyToShipUserError"));
  }

  public InventoryTransferMarkAsReadyToShipUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferMarkAsReadyToShipUserErrorCodeProjection<InventoryTransferMarkAsReadyToShipUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryTransferMarkAsReadyToShipUserErrorCodeProjection<InventoryTransferMarkAsReadyToShipUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferMarkAsReadyToShipUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryTransferMarkAsReadyToShipUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryTransferMarkAsReadyToShipUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
