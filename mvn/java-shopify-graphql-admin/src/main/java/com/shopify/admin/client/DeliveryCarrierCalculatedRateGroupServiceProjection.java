package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCarrierCalculatedRateGroupServiceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCarrierCalculatedRateGroupServiceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCarrierCalculatedRateGroupService"));
  }

  public DeliveryCarrierCalculatedRateGroupServiceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCarrierCalculatedRateGroupServiceStatusProjection<DeliveryCarrierCalculatedRateGroupServiceProjection<PARENT, ROOT>, ROOT> status(
      ) {
     DeliveryCarrierCalculatedRateGroupServiceStatusProjection<DeliveryCarrierCalculatedRateGroupServiceProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierCalculatedRateGroupServiceStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public DeliveryCarrierCalculatedRateGroupServiceProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
