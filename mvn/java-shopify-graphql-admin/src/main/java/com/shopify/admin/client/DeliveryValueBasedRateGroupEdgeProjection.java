package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryValueBasedRateGroupEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryValueBasedRateGroupEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryValueBasedRateGroupEdge"));
  }

  public DeliveryValueBasedRateGroupEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryValueBasedRateGroupProjection<DeliveryValueBasedRateGroupEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DeliveryValueBasedRateGroupProjection<DeliveryValueBasedRateGroupEdgeProjection<PARENT, ROOT>, ROOT> projection = new DeliveryValueBasedRateGroupProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DeliveryValueBasedRateGroupEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
