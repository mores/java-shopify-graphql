package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryWeightBasedRateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryWeightBasedRateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryWeightBasedRate"));
  }

  public DeliveryWeightBasedRateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public WeightProjection<DeliveryWeightBasedRateProjection<PARENT, ROOT>, ROOT> maxWeight() {
     WeightProjection<DeliveryWeightBasedRateProjection<PARENT, ROOT>, ROOT> projection = new WeightProjection<>(this, getRoot());
     getFields().put("maxWeight", projection);
     return projection;
  }

  public WeightProjection<DeliveryWeightBasedRateProjection<PARENT, ROOT>, ROOT> minWeight() {
     WeightProjection<DeliveryWeightBasedRateProjection<PARENT, ROOT>, ROOT> projection = new WeightProjection<>(this, getRoot());
     getFields().put("minWeight", projection);
     return projection;
  }

  public MoneyV2Projection<DeliveryWeightBasedRateProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<DeliveryWeightBasedRateProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public DeliveryWeightBasedRateProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryWeightBasedRateProjection<PARENT, ROOT> transitTimeMaxSeconds() {
    getFields().put("transitTimeMaxSeconds", null);
    return this;
  }

  public DeliveryWeightBasedRateProjection<PARENT, ROOT> transitTimeMinSeconds() {
    getFields().put("transitTimeMinSeconds", null);
    return this;
  }
}
