package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryMoveQuantitiesUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryMoveQuantitiesUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryMoveQuantitiesUserError"));
  }

  public InventoryMoveQuantitiesUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryMoveQuantitiesUserErrorCodeProjection<InventoryMoveQuantitiesUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryMoveQuantitiesUserErrorCodeProjection<InventoryMoveQuantitiesUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryMoveQuantitiesUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryMoveQuantitiesUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryMoveQuantitiesUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
