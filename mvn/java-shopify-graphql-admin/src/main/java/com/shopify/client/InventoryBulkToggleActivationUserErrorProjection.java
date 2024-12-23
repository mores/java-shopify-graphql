package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryBulkToggleActivationUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryBulkToggleActivationUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryBulkToggleActivationUserError"));
  }

  public InventoryBulkToggleActivationUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryBulkToggleActivationUserErrorCodeProjection<InventoryBulkToggleActivationUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryBulkToggleActivationUserErrorCodeProjection<InventoryBulkToggleActivationUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryBulkToggleActivationUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryBulkToggleActivationUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryBulkToggleActivationUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
