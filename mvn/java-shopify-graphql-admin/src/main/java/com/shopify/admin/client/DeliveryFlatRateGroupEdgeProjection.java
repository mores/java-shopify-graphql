package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryFlatRateGroupEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryFlatRateGroupEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryFlatRateGroupEdge"));
  }

  public DeliveryFlatRateGroupEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryFlatRateGroupProjection<DeliveryFlatRateGroupEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DeliveryFlatRateGroupProjection<DeliveryFlatRateGroupEdgeProjection<PARENT, ROOT>, ROOT> projection = new DeliveryFlatRateGroupProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DeliveryFlatRateGroupEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
