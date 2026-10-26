package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryWeightBasedRateGroupEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryWeightBasedRateGroupEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryWeightBasedRateGroupEdge"));
  }

  public DeliveryWeightBasedRateGroupEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryWeightBasedRateGroupProjection<DeliveryWeightBasedRateGroupEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DeliveryWeightBasedRateGroupProjection<DeliveryWeightBasedRateGroupEdgeProjection<PARENT, ROOT>, ROOT> projection = new DeliveryWeightBasedRateGroupProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DeliveryWeightBasedRateGroupEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
