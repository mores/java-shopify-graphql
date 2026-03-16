package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentUpdateItemQuantitiesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentUpdateItemQuantitiesProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryShipmentUpdateItemQuantitiesPayload"));
  }

  public InventoryShipmentUpdateItemQuantitiesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentProjection<InventoryShipmentUpdateItemQuantitiesProjectionRoot<PARENT, ROOT>, InventoryShipmentUpdateItemQuantitiesProjectionRoot<PARENT, ROOT>> shipment(
      ) {
    InventoryShipmentProjection<InventoryShipmentUpdateItemQuantitiesProjectionRoot<PARENT, ROOT>, InventoryShipmentUpdateItemQuantitiesProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentProjection<>(this, this);    
    getFields().put("shipment", projection);
    return projection;
  }

  public InventoryShipmentLineItemProjection<InventoryShipmentUpdateItemQuantitiesProjectionRoot<PARENT, ROOT>, InventoryShipmentUpdateItemQuantitiesProjectionRoot<PARENT, ROOT>> updatedLineItems(
      ) {
    InventoryShipmentLineItemProjection<InventoryShipmentUpdateItemQuantitiesProjectionRoot<PARENT, ROOT>, InventoryShipmentUpdateItemQuantitiesProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentLineItemProjection<>(this, this);    
    getFields().put("updatedLineItems", projection);
    return projection;
  }

  public InventoryShipmentUpdateItemQuantitiesUserErrorProjection<InventoryShipmentUpdateItemQuantitiesProjectionRoot<PARENT, ROOT>, InventoryShipmentUpdateItemQuantitiesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryShipmentUpdateItemQuantitiesUserErrorProjection<InventoryShipmentUpdateItemQuantitiesProjectionRoot<PARENT, ROOT>, InventoryShipmentUpdateItemQuantitiesProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentUpdateItemQuantitiesUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
