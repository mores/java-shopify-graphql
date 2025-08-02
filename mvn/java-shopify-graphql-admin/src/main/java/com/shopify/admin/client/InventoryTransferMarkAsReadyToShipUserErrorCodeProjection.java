package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferMarkAsReadyToShipUserErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferMarkAsReadyToShipUserErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransferMarkAsReadyToShipUserErrorCode"));
  }

  public InventoryTransferMarkAsReadyToShipUserErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
