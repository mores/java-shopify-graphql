package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class InventoryItemMeasurementProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryItemMeasurementProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryItemMeasurement"));
  }

  public InventoryItemMeasurementProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WeightProjection<InventoryItemMeasurementProjection<PARENT, ROOT>, ROOT> weight() {
     WeightProjection<InventoryItemMeasurementProjection<PARENT, ROOT>, ROOT> projection = new WeightProjection<>(this, getRoot());
     getFields().put("weight", projection);
     return projection;
  }

  public InventoryItemMeasurementProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
