package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryWeightBasedRateEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryWeightBasedRateEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryWeightBasedRateEdge"));
  }

  public DeliveryWeightBasedRateEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryWeightBasedRateProjection<DeliveryWeightBasedRateEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DeliveryWeightBasedRateProjection<DeliveryWeightBasedRateEdgeProjection<PARENT, ROOT>, ROOT> projection = new DeliveryWeightBasedRateProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DeliveryWeightBasedRateEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
