package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDraftDiscountRemoveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDraftDiscountRemoveProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionDraftDiscountRemovePayload"));
  }

  public SubscriptionDraftDiscountRemoveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDiscountProjection<SubscriptionDraftDiscountRemoveProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountRemoveProjectionRoot<PARENT, ROOT>> discountRemoved(
      ) {
    SubscriptionDiscountProjection<SubscriptionDraftDiscountRemoveProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountRemoveProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDiscountProjection<>(this, this);    
    getFields().put("discountRemoved", projection);
    return projection;
  }

  public SubscriptionDraftProjection<SubscriptionDraftDiscountRemoveProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountRemoveProjectionRoot<PARENT, ROOT>> draft(
      ) {
    SubscriptionDraftProjection<SubscriptionDraftDiscountRemoveProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountRemoveProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftProjection<>(this, this);    
    getFields().put("draft", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionDraftDiscountRemoveProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountRemoveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionDraftDiscountRemoveProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountRemoveProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
