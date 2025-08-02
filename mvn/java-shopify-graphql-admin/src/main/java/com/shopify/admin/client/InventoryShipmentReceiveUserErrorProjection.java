package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentReceiveUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentReceiveUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentReceiveUserError"));
  }

  public InventoryShipmentReceiveUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentReceiveUserErrorCodeProjection<InventoryShipmentReceiveUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryShipmentReceiveUserErrorCodeProjection<InventoryShipmentReceiveUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentReceiveUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryShipmentReceiveUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryShipmentReceiveUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
