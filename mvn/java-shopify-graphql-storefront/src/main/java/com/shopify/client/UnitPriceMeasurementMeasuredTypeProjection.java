package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UnitPriceMeasurementMeasuredTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UnitPriceMeasurementMeasuredTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UnitPriceMeasurementMeasuredType"));
  }

  public UnitPriceMeasurementMeasuredTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
