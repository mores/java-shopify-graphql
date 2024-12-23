package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDraftLineAddProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDraftLineAddProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionDraftLineAddPayload"));
  }

  public SubscriptionDraftLineAddProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDraftProjection<SubscriptionDraftLineAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineAddProjectionRoot<PARENT, ROOT>> draft(
      ) {
    SubscriptionDraftProjection<SubscriptionDraftLineAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineAddProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftProjection<>(this, this);    
    getFields().put("draft", projection);
    return projection;
  }

  public SubscriptionLineProjection<SubscriptionDraftLineAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineAddProjectionRoot<PARENT, ROOT>> lineAdded(
      ) {
    SubscriptionLineProjection<SubscriptionDraftLineAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineAddProjectionRoot<PARENT, ROOT>> projection = new SubscriptionLineProjection<>(this, this);    
    getFields().put("lineAdded", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionDraftLineAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineAddProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionDraftLineAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineAddProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
