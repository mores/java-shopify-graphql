package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventorySetOnHandQuantitiesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventorySetOnHandQuantitiesProjectionRoot() {
    super(null, null, java.util.Optional.of("InventorySetOnHandQuantitiesPayload"));
  }

  public InventorySetOnHandQuantitiesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryAdjustmentGroupProjection<InventorySetOnHandQuantitiesProjectionRoot<PARENT, ROOT>, InventorySetOnHandQuantitiesProjectionRoot<PARENT, ROOT>> inventoryAdjustmentGroup(
      ) {
    InventoryAdjustmentGroupProjection<InventorySetOnHandQuantitiesProjectionRoot<PARENT, ROOT>, InventorySetOnHandQuantitiesProjectionRoot<PARENT, ROOT>> projection = new InventoryAdjustmentGroupProjection<>(this, this);    
    getFields().put("inventoryAdjustmentGroup", projection);
    return projection;
  }

  public InventorySetOnHandQuantitiesUserErrorProjection<InventorySetOnHandQuantitiesProjectionRoot<PARENT, ROOT>, InventorySetOnHandQuantitiesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventorySetOnHandQuantitiesUserErrorProjection<InventorySetOnHandQuantitiesProjectionRoot<PARENT, ROOT>, InventorySetOnHandQuantitiesProjectionRoot<PARENT, ROOT>> projection = new InventorySetOnHandQuantitiesUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
