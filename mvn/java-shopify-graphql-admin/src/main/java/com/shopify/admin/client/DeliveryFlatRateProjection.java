package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryFlatRateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryFlatRateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryFlatRate"));
  }

  public DeliveryFlatRateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<DeliveryFlatRateProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<DeliveryFlatRateProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public DeliveryFlatRateProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryFlatRateProjection<PARENT, ROOT> transitTimeMaxSeconds() {
    getFields().put("transitTimeMaxSeconds", null);
    return this;
  }

  public DeliveryFlatRateProjection<PARENT, ROOT> transitTimeMinSeconds() {
    getFields().put("transitTimeMinSeconds", null);
    return this;
  }
}
