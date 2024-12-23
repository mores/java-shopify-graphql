package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryAdjustQuantitiesUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryAdjustQuantitiesUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryAdjustQuantitiesUserError"));
  }

  public InventoryAdjustQuantitiesUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryAdjustQuantitiesUserErrorCodeProjection<InventoryAdjustQuantitiesUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryAdjustQuantitiesUserErrorCodeProjection<InventoryAdjustQuantitiesUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryAdjustQuantitiesUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryAdjustQuantitiesUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryAdjustQuantitiesUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
