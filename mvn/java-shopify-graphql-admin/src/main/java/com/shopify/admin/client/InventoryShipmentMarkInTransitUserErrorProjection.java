package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentMarkInTransitUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentMarkInTransitUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentMarkInTransitUserError"));
  }

  public InventoryShipmentMarkInTransitUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentMarkInTransitUserErrorCodeProjection<InventoryShipmentMarkInTransitUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryShipmentMarkInTransitUserErrorCodeProjection<InventoryShipmentMarkInTransitUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentMarkInTransitUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryShipmentMarkInTransitUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryShipmentMarkInTransitUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
