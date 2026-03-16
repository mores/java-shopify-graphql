package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentSetTrackingUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentSetTrackingUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentSetTrackingUserError"));
  }

  public InventoryShipmentSetTrackingUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentSetTrackingUserErrorCodeProjection<InventoryShipmentSetTrackingUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     InventoryShipmentSetTrackingUserErrorCodeProjection<InventoryShipmentSetTrackingUserErrorProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentSetTrackingUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public InventoryShipmentSetTrackingUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public InventoryShipmentSetTrackingUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
