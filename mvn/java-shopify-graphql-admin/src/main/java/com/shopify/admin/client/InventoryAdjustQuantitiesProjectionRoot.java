package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryAdjustQuantitiesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryAdjustQuantitiesProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryAdjustQuantitiesPayload"));
  }

  public InventoryAdjustQuantitiesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryAdjustmentGroupProjection<InventoryAdjustQuantitiesProjectionRoot<PARENT, ROOT>, InventoryAdjustQuantitiesProjectionRoot<PARENT, ROOT>> inventoryAdjustmentGroup(
      ) {
    InventoryAdjustmentGroupProjection<InventoryAdjustQuantitiesProjectionRoot<PARENT, ROOT>, InventoryAdjustQuantitiesProjectionRoot<PARENT, ROOT>> projection = new InventoryAdjustmentGroupProjection<>(this, this);    
    getFields().put("inventoryAdjustmentGroup", projection);
    return projection;
  }

  public InventoryAdjustQuantitiesUserErrorProjection<InventoryAdjustQuantitiesProjectionRoot<PARENT, ROOT>, InventoryAdjustQuantitiesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryAdjustQuantitiesUserErrorProjection<InventoryAdjustQuantitiesProjectionRoot<PARENT, ROOT>, InventoryAdjustQuantitiesProjectionRoot<PARENT, ROOT>> projection = new InventoryAdjustQuantitiesUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
