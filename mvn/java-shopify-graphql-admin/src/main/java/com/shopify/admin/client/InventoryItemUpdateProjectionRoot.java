package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryItemUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryItemUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryItemUpdatePayload"));
  }

  public InventoryItemUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryItemProjection<InventoryItemUpdateProjectionRoot<PARENT, ROOT>, InventoryItemUpdateProjectionRoot<PARENT, ROOT>> inventoryItem(
      ) {
    InventoryItemProjection<InventoryItemUpdateProjectionRoot<PARENT, ROOT>, InventoryItemUpdateProjectionRoot<PARENT, ROOT>> projection = new InventoryItemProjection<>(this, this);    
    getFields().put("inventoryItem", projection);
    return projection;
  }

  public UserErrorProjection<InventoryItemUpdateProjectionRoot<PARENT, ROOT>, InventoryItemUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<InventoryItemUpdateProjectionRoot<PARENT, ROOT>, InventoryItemUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
