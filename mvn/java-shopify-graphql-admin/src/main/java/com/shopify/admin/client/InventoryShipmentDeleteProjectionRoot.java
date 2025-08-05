package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryShipmentDeletePayload"));
  }

  public InventoryShipmentDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentDeleteUserErrorProjection<InventoryShipmentDeleteProjectionRoot<PARENT, ROOT>, InventoryShipmentDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryShipmentDeleteUserErrorProjection<InventoryShipmentDeleteProjectionRoot<PARENT, ROOT>, InventoryShipmentDeleteProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public InventoryShipmentDeleteProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
