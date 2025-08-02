package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryShipmentTrackingProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentTrackingProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipmentTracking"));
  }

  public InventoryShipmentTrackingProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentTrackingProjection<PARENT, ROOT> arrivesAt() {
    getFields().put("arrivesAt", null);
    return this;
  }

  public InventoryShipmentTrackingProjection<PARENT, ROOT> company() {
    getFields().put("company", null);
    return this;
  }

  public InventoryShipmentTrackingProjection<PARENT, ROOT> trackingNumber() {
    getFields().put("trackingNumber", null);
    return this;
  }

  public InventoryShipmentTrackingProjection<PARENT, ROOT> trackingUrl() {
    getFields().put("trackingUrl", null);
    return this;
  }
}
