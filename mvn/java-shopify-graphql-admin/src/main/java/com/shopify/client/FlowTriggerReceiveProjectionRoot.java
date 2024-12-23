package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FlowTriggerReceiveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FlowTriggerReceiveProjectionRoot() {
    super(null, null, java.util.Optional.of("FlowTriggerReceivePayload"));
  }

  public FlowTriggerReceiveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<FlowTriggerReceiveProjectionRoot<PARENT, ROOT>, FlowTriggerReceiveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<FlowTriggerReceiveProjectionRoot<PARENT, ROOT>, FlowTriggerReceiveProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
