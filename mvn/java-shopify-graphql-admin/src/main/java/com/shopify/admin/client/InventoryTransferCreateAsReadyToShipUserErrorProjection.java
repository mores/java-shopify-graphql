package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferCreateAsReadyToShipUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferCreateAsReadyToShipUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransferCreateAsReadyToShipUserError"));
  }

  public InventoryTransferCreateAsReadyToShipUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferCreateAsReadyToShipUserErrorCodeProjection<InventoryTransferCreateAsReadyToShipUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryTransferCreateAsReadyToShipUserErrorCodeProjection<InventoryTransferCreateAsReadyToShipUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferCreateAsReadyToShipUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryTransferCreateAsReadyToShipUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryTransferCreateAsReadyToShipUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
