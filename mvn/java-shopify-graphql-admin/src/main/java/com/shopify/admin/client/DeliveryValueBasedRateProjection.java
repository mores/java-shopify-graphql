package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryValueBasedRateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryValueBasedRateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryValueBasedRate"));
  }

  public DeliveryValueBasedRateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<DeliveryValueBasedRateProjection<PARENT, ROOT>, ROOT> maxValue() {
     MoneyV2Projection<DeliveryValueBasedRateProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("maxValue", projection);
     return projection;
  }

  public MoneyV2Projection<DeliveryValueBasedRateProjection<PARENT, ROOT>, ROOT> minValue() {
     MoneyV2Projection<DeliveryValueBasedRateProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("minValue", projection);
     return projection;
  }

  public MoneyV2Projection<DeliveryValueBasedRateProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<DeliveryValueBasedRateProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public DeliveryValueBasedRateProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryValueBasedRateProjection<PARENT, ROOT> transitTimeMaxSeconds() {
    getFields().put("transitTimeMaxSeconds", null);
    return this;
  }

  public DeliveryValueBasedRateProjection<PARENT, ROOT> transitTimeMinSeconds() {
    getFields().put("transitTimeMinSeconds", null);
    return this;
  }
}
