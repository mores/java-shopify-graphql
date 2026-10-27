package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCarrierCalculatedRateGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCarrierCalculatedRateGroupProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCarrierCalculatedRateGroup"));
  }

  public DeliveryCarrierCalculatedRateGroupProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<DeliveryCarrierCalculatedRateGroupProjection<PARENT, ROOT>, ROOT> absoluteAdjustment(
      ) {
     MoneyV2Projection<DeliveryCarrierCalculatedRateGroupProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("absoluteAdjustment", projection);
     return projection;
  }

  public DeliveryCarrierServiceProjection<DeliveryCarrierCalculatedRateGroupProjection<PARENT, ROOT>, ROOT> carrierService(
      ) {
     DeliveryCarrierServiceProjection<DeliveryCarrierCalculatedRateGroupProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceProjection<>(this, getRoot());
     getFields().put("carrierService", projection);
     return projection;
  }

  public DeliveryRateGroupConditionsProjection<DeliveryCarrierCalculatedRateGroupProjection<PARENT, ROOT>, ROOT> conditions(
      ) {
     DeliveryRateGroupConditionsProjection<DeliveryCarrierCalculatedRateGroupProjection<PARENT, ROOT>, ROOT> projection = new DeliveryRateGroupConditionsProjection<>(this, getRoot());
     getFields().put("conditions", projection);
     return projection;
  }

  public DeliveryCarrierCalculatedRateGroupServiceProjection<DeliveryCarrierCalculatedRateGroupProjection<PARENT, ROOT>, ROOT> serviceConfiguration(
      ) {
     DeliveryCarrierCalculatedRateGroupServiceProjection<DeliveryCarrierCalculatedRateGroupProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierCalculatedRateGroupServiceProjection<>(this, getRoot());
     getFields().put("serviceConfiguration", projection);
     return projection;
  }

  public DeliveryCarrierCalculatedRateGroupProjection<PARENT, ROOT> autoIncludeNewServices() {
    getFields().put("autoIncludeNewServices", null);
    return this;
  }

  public DeliveryCarrierCalculatedRateGroupProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryCarrierCalculatedRateGroupProjection<PARENT, ROOT> percentageAdjustment() {
    getFields().put("percentageAdjustment", null);
    return this;
  }
}
