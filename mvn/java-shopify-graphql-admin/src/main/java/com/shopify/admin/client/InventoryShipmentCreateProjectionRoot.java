package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryShipmentCreatePayload"));
  }

  public InventoryShipmentCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentProjection<InventoryShipmentCreateProjectionRoot<PARENT, ROOT>, InventoryShipmentCreateProjectionRoot<PARENT, ROOT>> inventoryShipment(
      ) {
    InventoryShipmentProjection<InventoryShipmentCreateProjectionRoot<PARENT, ROOT>, InventoryShipmentCreateProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentProjection<>(this, this);    
    getFields().put("inventoryShipment", projection);
    return projection;
  }

  public InventoryShipmentCreateUserErrorProjection<InventoryShipmentCreateProjectionRoot<PARENT, ROOT>, InventoryShipmentCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryShipmentCreateUserErrorProjection<InventoryShipmentCreateProjectionRoot<PARENT, ROOT>, InventoryShipmentCreateProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
