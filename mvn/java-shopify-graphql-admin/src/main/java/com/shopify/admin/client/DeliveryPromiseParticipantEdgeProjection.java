package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromiseParticipantEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromiseParticipantEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryPromiseParticipantEdge"));
  }

  public DeliveryPromiseParticipantEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryPromiseParticipantProjection<DeliveryPromiseParticipantEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     DeliveryPromiseParticipantProjection<DeliveryPromiseParticipantEdgeProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromiseParticipantProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DeliveryPromiseParticipantEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
