package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryValueBasedRateEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryValueBasedRateEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryValueBasedRateEdge"));
  }

  public DeliveryValueBasedRateEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryValueBasedRateProjection<DeliveryValueBasedRateEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DeliveryValueBasedRateProjection<DeliveryValueBasedRateEdgeProjection<PARENT, ROOT>, ROOT> projection = new DeliveryValueBasedRateProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DeliveryValueBasedRateEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
