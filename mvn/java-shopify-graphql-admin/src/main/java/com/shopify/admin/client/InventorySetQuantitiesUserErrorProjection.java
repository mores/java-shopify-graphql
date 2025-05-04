package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventorySetQuantitiesUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventorySetQuantitiesUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventorySetQuantitiesUserError"));
  }

  public InventorySetQuantitiesUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventorySetQuantitiesUserErrorCodeProjection<InventorySetQuantitiesUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventorySetQuantitiesUserErrorCodeProjection<InventorySetQuantitiesUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventorySetQuantitiesUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventorySetQuantitiesUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventorySetQuantitiesUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
