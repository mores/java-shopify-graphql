package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromiseParticipantConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromiseParticipantConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryPromiseParticipantConnection"));
  }

  public DeliveryPromiseParticipantConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryPromiseParticipantEdgeProjection<DeliveryPromiseParticipantConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DeliveryPromiseParticipantEdgeProjection<DeliveryPromiseParticipantConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromiseParticipantEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DeliveryPromiseParticipantProjection<DeliveryPromiseParticipantConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DeliveryPromiseParticipantProjection<DeliveryPromiseParticipantConnectionProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromiseParticipantProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DeliveryPromiseParticipantConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<DeliveryPromiseParticipantConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
