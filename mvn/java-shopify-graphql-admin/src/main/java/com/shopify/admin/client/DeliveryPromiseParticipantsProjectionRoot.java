package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromiseParticipantsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromiseParticipantsProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryPromiseParticipantConnection"));
  }

  public DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryPromiseParticipantEdgeProjection<DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>, DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    DeliveryPromiseParticipantEdgeProjection<DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>, DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>> projection = new DeliveryPromiseParticipantEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public DeliveryPromiseParticipantProjection<DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>, DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    DeliveryPromiseParticipantProjection<DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>, DeliveryPromiseParticipantsProjectionRoot<PARENT, ROOT>> projection = new DeliveryPromiseParticipantProjection<>(this, this);    
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
