package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromiseParticipantProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromiseParticipantProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryPromiseParticipant"));
  }

  public DeliveryPromiseParticipantProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryPromiseParticipantOwnerProjection<DeliveryPromiseParticipantProjection<PARENT, ROOT>, ROOT> owner(
      ) {
     DeliveryPromiseParticipantOwnerProjection<DeliveryPromiseParticipantProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromiseParticipantOwnerProjection<>(this, getRoot());
     getFields().put("owner", projection);
     return projection;
  }

  public DeliveryPromiseParticipantOwnerTypeProjection<DeliveryPromiseParticipantProjection<PARENT, ROOT>, ROOT> ownerType(
      ) {
     DeliveryPromiseParticipantOwnerTypeProjection<DeliveryPromiseParticipantProjection<PARENT, ROOT>, ROOT> projection = new DeliveryPromiseParticipantOwnerTypeProjection<>(this, getRoot());
     getFields().put("ownerType", projection);
     return projection;
  }

  public DeliveryPromiseParticipantProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
