package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDraftLineRemoveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDraftLineRemoveProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionDraftLineRemovePayload"));
  }

  public SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionManualDiscountProjection<SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>> discountsUpdated(
      ) {
    SubscriptionManualDiscountProjection<SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>> projection = new SubscriptionManualDiscountProjection<>(this, this);    
    getFields().put("discountsUpdated", projection);
    return projection;
  }

  public SubscriptionDraftProjection<SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>> draft(
      ) {
    SubscriptionDraftProjection<SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftProjection<>(this, this);    
    getFields().put("draft", projection);
    return projection;
  }

  public SubscriptionLineProjection<SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>> lineRemoved(
      ) {
    SubscriptionLineProjection<SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>> projection = new SubscriptionLineProjection<>(this, this);    
    getFields().put("lineRemoved", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>, SubscriptionDraftLineRemoveProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
