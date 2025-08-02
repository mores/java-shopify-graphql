package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferRemoveItemsUserErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferRemoveItemsUserErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransferRemoveItemsUserErrorCode"));
  }

  public InventoryTransferRemoveItemsUserErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
