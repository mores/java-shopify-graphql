package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PromiseParticipantProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PromiseParticipantProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PromiseParticipant"));
  }

  public PromiseParticipantProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryPromisePromiseParticipantPromiseParticipantOwnerProjection<PromiseParticipantProjection<PARENT, ROOT>, ROOT> owner(
      ) {
     DeliveryPromisePromiseParticipantPromiseParticipantOwnerProjection<PromiseParticipantProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromisePromiseParticipantPromiseParticipantOwnerProjection<>(this, getRoot());
     getFields().put("owner", projection);
     return projection;
  }

  public DeliveryPromisePromiseParticipantParticipantOwnerTypeProjection<PromiseParticipantProjection<PARENT, ROOT>, ROOT> ownerType(
      ) {
     DeliveryPromisePromiseParticipantParticipantOwnerTypeProjection<PromiseParticipantProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromisePromiseParticipantParticipantOwnerTypeProjection<>(this, getRoot());
     getFields().put("ownerType", projection);
     return projection;
  }

  public PromiseParticipantProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
