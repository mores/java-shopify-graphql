package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDraftDiscountAddProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDraftDiscountAddProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionDraftDiscountAddPayload"));
  }

  public SubscriptionDraftDiscountAddProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionManualDiscountProjection<SubscriptionDraftDiscountAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountAddProjectionRoot<PARENT, ROOT>> discountAdded(
      ) {
    SubscriptionManualDiscountProjection<SubscriptionDraftDiscountAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountAddProjectionRoot<PARENT, ROOT>> projection = new SubscriptionManualDiscountProjection<>(this, this);    
    getFields().put("discountAdded", projection);
    return projection;
  }

  public SubscriptionDraftProjection<SubscriptionDraftDiscountAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountAddProjectionRoot<PARENT, ROOT>> draft(
      ) {
    SubscriptionDraftProjection<SubscriptionDraftDiscountAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountAddProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftProjection<>(this, this);    
    getFields().put("draft", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionDraftDiscountAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountAddProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionDraftDiscountAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountAddProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
