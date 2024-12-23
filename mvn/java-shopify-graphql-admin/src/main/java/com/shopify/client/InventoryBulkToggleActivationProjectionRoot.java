package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryBulkToggleActivationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryBulkToggleActivationProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryBulkToggleActivationPayload"));
  }

  public InventoryBulkToggleActivationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemProjection<InventoryBulkToggleActivationProjectionRoot<PARENT, ROOT>, InventoryBulkToggleActivationProjectionRoot<PARENT, ROOT>> inventoryItem(
      ) {
    InventoryItemProjection<InventoryBulkToggleActivationProjectionRoot<PARENT, ROOT>, InventoryBulkToggleActivationProjectionRoot<PARENT, ROOT>> projection = new InventoryItemProjection<>(this, this);    
    getFields().put("inventoryItem", projection);
    return projection;
  }

  public InventoryLevelProjection<InventoryBulkToggleActivationProjectionRoot<PARENT, ROOT>, InventoryBulkToggleActivationProjectionRoot<PARENT, ROOT>> inventoryLevels(
      ) {
    InventoryLevelProjection<InventoryBulkToggleActivationProjectionRoot<PARENT, ROOT>, InventoryBulkToggleActivationProjectionRoot<PARENT, ROOT>> projection = new InventoryLevelProjection<>(this, this);    
    getFields().put("inventoryLevels", projection);
    return projection;
  }

  public InventoryBulkToggleActivationUserErrorProjection<InventoryBulkToggleActivationProjectionRoot<PARENT, ROOT>, InventoryBulkToggleActivationProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    InventoryBulkToggleActivationUserErrorProjection<InventoryBulkToggleActivationProjectionRoot<PARENT, ROOT>, InventoryBulkToggleActivationProjectionRoot<PARENT, ROOT>> projection = new InventoryBulkToggleActivationUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
