package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryMoveQuantitiesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryMoveQuantitiesProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryMoveQuantitiesPayload"));
  }

  public InventoryMoveQuantitiesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryAdjustmentGroupProjection<InventoryMoveQuantitiesProjectionRoot<PARENT, ROOT>, InventoryMoveQuantitiesProjectionRoot<PARENT, ROOT>> inventoryAdjustmentGroup(
      ) {
    InventoryAdjustmentGroupProjection<InventoryMoveQuantitiesProjectionRoot<PARENT, ROOT>, InventoryMoveQuantitiesProjectionRoot<PARENT, ROOT>> projection = new InventoryAdjustmentGroupProjection<>(this, this);    
    getFields().put("inventoryAdjustmentGroup", projection);
    return projection;
  }

  public InventoryMoveQuantitiesUserErrorProjection<InventoryMoveQuantitiesProjectionRoot<PARENT, ROOT>, InventoryMoveQuantitiesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryMoveQuantitiesUserErrorProjection<InventoryMoveQuantitiesProjectionRoot<PARENT, ROOT>, InventoryMoveQuantitiesProjectionRoot<PARENT, ROOT>> projection = new InventoryMoveQuantitiesUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
