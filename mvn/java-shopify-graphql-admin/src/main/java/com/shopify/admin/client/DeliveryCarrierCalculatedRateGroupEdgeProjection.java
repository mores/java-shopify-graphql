package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCarrierCalculatedRateGroupEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCarrierCalculatedRateGroupEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCarrierCalculatedRateGroupEdge"));
  }

  public DeliveryCarrierCalculatedRateGroupEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCarrierCalculatedRateGroupProjection<DeliveryCarrierCalculatedRateGroupEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DeliveryCarrierCalculatedRateGroupProjection<DeliveryCarrierCalculatedRateGroupEdgeProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierCalculatedRateGroupProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DeliveryCarrierCalculatedRateGroupEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
