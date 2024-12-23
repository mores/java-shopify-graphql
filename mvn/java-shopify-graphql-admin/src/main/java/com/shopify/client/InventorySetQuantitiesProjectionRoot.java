package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventorySetQuantitiesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventorySetQuantitiesProjectionRoot() {
    super(null, null, java.util.Optional.of("InventorySetQuantitiesPayload"));
  }

  public InventorySetQuantitiesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryAdjustmentGroupProjection<InventorySetQuantitiesProjectionRoot<PARENT, ROOT>, InventorySetQuantitiesProjectionRoot<PARENT, ROOT>> inventoryAdjustmentGroup(
      ) {
    InventoryAdjustmentGroupProjection<InventorySetQuantitiesProjectionRoot<PARENT, ROOT>, InventorySetQuantitiesProjectionRoot<PARENT, ROOT>> projection = new InventoryAdjustmentGroupProjection<>(this, this);    
    getFields().put("inventoryAdjustmentGroup", projection);
    return projection;
  }

  public InventorySetQuantitiesUserErrorProjection<InventorySetQuantitiesProjectionRoot<PARENT, ROOT>, InventorySetQuantitiesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventorySetQuantitiesUserErrorProjection<InventorySetQuantitiesProjectionRoot<PARENT, ROOT>, InventorySetQuantitiesProjectionRoot<PARENT, ROOT>> projection = new InventorySetQuantitiesUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
