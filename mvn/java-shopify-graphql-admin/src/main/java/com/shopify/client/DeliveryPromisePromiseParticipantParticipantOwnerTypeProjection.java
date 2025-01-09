package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromisePromiseParticipantParticipantOwnerTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromisePromiseParticipantParticipantOwnerTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryPromisePromiseParticipantParticipantOwnerType"));
  }

  public DeliveryPromisePromiseParticipantParticipantOwnerTypeProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }
}
