package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentAddItemsUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentAddItemsUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentAddItemsUserError"));
  }

  public InventoryShipmentAddItemsUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentAddItemsUserErrorCodeProjection<InventoryShipmentAddItemsUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryShipmentAddItemsUserErrorCodeProjection<InventoryShipmentAddItemsUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentAddItemsUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryShipmentAddItemsUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryShipmentAddItemsUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
