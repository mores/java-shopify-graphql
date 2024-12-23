package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryDeactivateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryDeactivateProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryDeactivatePayload"));
  }

  public InventoryDeactivateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<InventoryDeactivateProjectionRoot<PARENT, ROOT>, InventoryDeactivateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<InventoryDeactivateProjectionRoot<PARENT, ROOT>, InventoryDeactivateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
