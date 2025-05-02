package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UnitPriceMeasurementProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UnitPriceMeasurementProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UnitPriceMeasurement"));
  }

  public UnitPriceMeasurementProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UnitPriceMeasurementMeasuredTypeProjection<UnitPriceMeasurementProjection<PARENT, ROOT>, ROOT> measuredType(
      ) {
     UnitPriceMeasurementMeasuredTypeProjection<UnitPriceMeasurementProjection<PARENT, ROOT>, ROOT> projection = new UnitPriceMeasurementMeasuredTypeProjection<>(this, getRoot());
     getFields().put("measuredType", projection);
     return projection;
  }

  public UnitPriceMeasurementMeasuredUnitProjection<UnitPriceMeasurementProjection<PARENT, ROOT>, ROOT> quantityUnit(
      ) {
     UnitPriceMeasurementMeasuredUnitProjection<UnitPriceMeasurementProjection<PARENT, ROOT>, ROOT> projection = new UnitPriceMeasurementMeasuredUnitProjection<>(this, getRoot());
     getFields().put("quantityUnit", projection);
     return projection;
  }

  public UnitPriceMeasurementMeasuredUnitProjection<UnitPriceMeasurementProjection<PARENT, ROOT>, ROOT> referenceUnit(
      ) {
     UnitPriceMeasurementMeasuredUnitProjection<UnitPriceMeasurementProjection<PARENT, ROOT>, ROOT> projection = new UnitPriceMeasurementMeasuredUnitProjection<>(this, getRoot());
     getFields().put("referenceUnit", projection);
     return projection;
  }

  public UnitPriceMeasurementProjection<PARENT, ROOT> quantityValue() {
    getFields().put("quantityValue", null);
    return this;
  }

  public UnitPriceMeasurementProjection<PARENT, ROOT> referenceValue() {
    getFields().put("referenceValue", null);
    return this;
  }
}
