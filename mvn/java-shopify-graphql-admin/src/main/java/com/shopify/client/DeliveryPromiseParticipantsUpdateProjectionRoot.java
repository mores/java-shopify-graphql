package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromiseParticipantsUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromiseParticipantsUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryPromiseParticipantsUpdatePayload"));
  }

  public DeliveryPromiseParticipantsUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PromiseParticipantProjection<DeliveryPromiseParticipantsUpdateProjectionRoot<PARENT, ROOT>, DeliveryPromiseParticipantsUpdateProjectionRoot<PARENT, ROOT>> promiseParticipants(
      ) {
    PromiseParticipantProjection<DeliveryPromiseParticipantsUpdateProjectionRoot<PARENT, ROOT>, DeliveryPromiseParticipantsUpdateProjectionRoot<PARENT, ROOT>> projection = new PromiseParticipantProjection<>(this, this);    
    getFields().put("promiseParticipants", projection);
    return projection;
  }

  public UserErrorProjection<DeliveryPromiseParticipantsUpdateProjectionRoot<PARENT, ROOT>, DeliveryPromiseParticipantsUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<DeliveryPromiseParticipantsUpdateProjectionRoot<PARENT, ROOT>, DeliveryPromiseParticipantsUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
