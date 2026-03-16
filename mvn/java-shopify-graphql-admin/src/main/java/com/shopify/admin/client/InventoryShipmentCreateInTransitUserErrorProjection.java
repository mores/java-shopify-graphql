package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentCreateInTransitUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentCreateInTransitUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentCreateInTransitUserError"));
  }

  public InventoryShipmentCreateInTransitUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentCreateInTransitUserErrorCodeProjection<InventoryShipmentCreateInTransitUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryShipmentCreateInTransitUserErrorCodeProjection<InventoryShipmentCreateInTransitUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentCreateInTransitUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryShipmentCreateInTransitUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryShipmentCreateInTransitUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
