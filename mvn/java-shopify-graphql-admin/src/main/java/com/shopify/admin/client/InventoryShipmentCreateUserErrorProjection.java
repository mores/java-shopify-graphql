package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentCreateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentCreateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentCreateUserError"));
  }

  public InventoryShipmentCreateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentCreateUserErrorCodeProjection<InventoryShipmentCreateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryShipmentCreateUserErrorCodeProjection<InventoryShipmentCreateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentCreateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryShipmentCreateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryShipmentCreateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
