package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromiseParticipantsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromiseParticipantsProjectionRoot() {
    super(null, null, java.util.Optional.of("PromiseParticipantConnection"));
  }

  public DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PromiseParticipantEdgeProjection<DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>, DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    PromiseParticipantEdgeProjection<DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>, DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>> projection = new PromiseParticipantEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public PromiseParticipantProjection<DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>, DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    PromiseParticipantProjection<DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>, DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>> projection = new PromiseParticipantProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>, DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>, DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
