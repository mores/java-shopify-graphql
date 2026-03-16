package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferSetItemsUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferSetItemsUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransferSetItemsUserError"));
  }

  public InventoryTransferSetItemsUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferSetItemsUserErrorCodeProjection<InventoryTransferSetItemsUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryTransferSetItemsUserErrorCodeProjection<InventoryTransferSetItemsUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferSetItemsUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryTransferSetItemsUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryTransferSetItemsUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
