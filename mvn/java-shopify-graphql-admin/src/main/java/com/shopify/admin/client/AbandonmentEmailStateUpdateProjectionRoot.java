package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonmentEmailStateUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonmentEmailStateUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("AbandonmentEmailStateUpdatePayload"));
  }

  public AbandonmentEmailStateUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonmentProjection<AbandonmentEmailStateUpdateProjectionRoot<PARENT, ROOT>, AbandonmentEmailStateUpdateProjectionRoot<PARENT, ROOT>> abandonment(
      ) {
    AbandonmentProjection<AbandonmentEmailStateUpdateProjectionRoot<PARENT, ROOT>, AbandonmentEmailStateUpdateProjectionRoot<PARENT, ROOT>> projection = new AbandonmentProjection<>(this, this);    
    getFields().put("abandonment", projection);
    return projection;
  }

  public AbandonmentEmailStateUpdateUserErrorProjection<AbandonmentEmailStateUpdateProjectionRoot<PARENT, ROOT>, AbandonmentEmailStateUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    AbandonmentEmailStateUpdateUserErrorProjection<AbandonmentEmailStateUpdateProjectionRoot<PARENT, ROOT>, AbandonmentEmailStateUpdateProjectionRoot<PARENT, ROOT>> projection = new AbandonmentEmailStateUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
