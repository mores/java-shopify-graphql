package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentUpdateItemQuantitiesUserErrorCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentUpdateItemQuantitiesUserErrorCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentUpdateItemQuantitiesUserErrorCode"));
  }

  public InventoryShipmentUpdateItemQuantitiesUserErrorCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
