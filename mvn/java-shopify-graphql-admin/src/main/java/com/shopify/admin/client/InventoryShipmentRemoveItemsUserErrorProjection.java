package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentRemoveItemsUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentRemoveItemsUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentRemoveItemsUserError"));
  }

  public InventoryShipmentRemoveItemsUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentRemoveItemsUserErrorCodeProjection<InventoryShipmentRemoveItemsUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryShipmentRemoveItemsUserErrorCodeProjection<InventoryShipmentRemoveItemsUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentRemoveItemsUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryShipmentRemoveItemsUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryShipmentRemoveItemsUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
