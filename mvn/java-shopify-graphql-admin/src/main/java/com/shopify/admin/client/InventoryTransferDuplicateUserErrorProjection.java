package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryTransferDuplicateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferDuplicateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransferDuplicateUserError"));
  }

  public InventoryTransferDuplicateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryTransferDuplicateUserErrorCodeProjection<InventoryTransferDuplicateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryTransferDuplicateUserErrorCodeProjection<InventoryTransferDuplicateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferDuplicateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryTransferDuplicateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryTransferDuplicateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
