package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDraftLineUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDraftLineUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionDraftLineUpdatePayload"));
  }

  public SubscriptionDraftLineUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDraftProjection<SubscriptionDraftLineUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineUpdateProjectionRoot<PARENT, ROOT>> draft(
      ) {
    SubscriptionDraftProjection<SubscriptionDraftLineUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineUpdateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftProjection<>(this, this);    
    getFields().put("draft", projection);
    return projection;
  }

  public SubscriptionLineProjection<SubscriptionDraftLineUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineUpdateProjectionRoot<PARENT, ROOT>> lineUpdated(
      ) {
    SubscriptionLineProjection<SubscriptionDraftLineUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineUpdateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionLineProjection<>(this, this);    
    getFields().put("lineUpdated", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionDraftLineUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionDraftLineUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineUpdateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
