package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryActivateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryActivateProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryActivatePayload"));
  }

  public InventoryActivateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryLevelProjection<InventoryActivateProjectionRoot<PARENT, ROOT>, InventoryActivateProjectionRoot<PARENT, ROOT>> inventoryLevel(
      ) {
    InventoryLevelProjection<InventoryActivateProjectionRoot<PARENT, ROOT>, InventoryActivateProjectionRoot<PARENT, ROOT>> projection = new InventoryLevelProjection<>(this, this);    
    getFields().put("inventoryLevel", projection);
    return projection;
  }

  public UserErrorProjection<InventoryActivateProjectionRoot<PARENT, ROOT>, InventoryActivateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<InventoryActivateProjectionRoot<PARENT, ROOT>, InventoryActivateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
