package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventorySetOnHandQuantitiesUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventorySetOnHandQuantitiesUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventorySetOnHandQuantitiesUserError"));
  }

  public InventorySetOnHandQuantitiesUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventorySetOnHandQuantitiesUserErrorCodeProjection<InventorySetOnHandQuantitiesUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventorySetOnHandQuantitiesUserErrorCodeProjection<InventorySetOnHandQuantitiesUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventorySetOnHandQuantitiesUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventorySetOnHandQuantitiesUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventorySetOnHandQuantitiesUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
