package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryParticipantServiceProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryParticipantServiceProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryParticipantService"));
  }

  public DeliveryParticipantServiceProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryParticipantServiceProjection<PARENT, ROOT> active() {
    getFields().put("active", null);
    return this;
  }

  public DeliveryParticipantServiceProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }
}
