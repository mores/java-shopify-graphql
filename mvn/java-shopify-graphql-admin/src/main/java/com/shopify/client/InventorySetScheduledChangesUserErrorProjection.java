package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventorySetScheduledChangesUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventorySetScheduledChangesUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventorySetScheduledChangesUserError"));
  }

  public InventorySetScheduledChangesUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventorySetScheduledChangesUserErrorCodeProjection<InventorySetScheduledChangesUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventorySetScheduledChangesUserErrorCodeProjection<InventorySetScheduledChangesUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventorySetScheduledChangesUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventorySetScheduledChangesUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventorySetScheduledChangesUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
