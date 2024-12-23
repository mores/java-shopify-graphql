package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryCarrierServiceEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryCarrierServiceEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryCarrierServiceEdge"));
  }

  public DeliveryCarrierServiceEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCarrierServiceProjection<DeliveryCarrierServiceEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DeliveryCarrierServiceProjection<DeliveryCarrierServiceEdgeProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCarrierServiceProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DeliveryCarrierServiceEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
