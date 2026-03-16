package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentUpdateItemQuantitiesUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentUpdateItemQuantitiesUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentUpdateItemQuantitiesUserError"));
  }

  public InventoryShipmentUpdateItemQuantitiesUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentUpdateItemQuantitiesUserErrorCodeProjection<InventoryShipmentUpdateItemQuantitiesUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryShipmentUpdateItemQuantitiesUserErrorCodeProjection<InventoryShipmentUpdateItemQuantitiesUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentUpdateItemQuantitiesUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryShipmentUpdateItemQuantitiesUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryShipmentUpdateItemQuantitiesUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
