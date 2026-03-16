package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferRemoveItemsUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferRemoveItemsUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransferRemoveItemsUserError"));
  }

  public InventoryTransferRemoveItemsUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferRemoveItemsUserErrorCodeProjection<InventoryTransferRemoveItemsUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryTransferRemoveItemsUserErrorCodeProjection<InventoryTransferRemoveItemsUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferRemoveItemsUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryTransferRemoveItemsUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryTransferRemoveItemsUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
