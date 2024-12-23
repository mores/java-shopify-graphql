package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDraftDiscountCodeApplyProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDraftDiscountCodeApplyProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionDraftDiscountCodeApplyPayload"));
  }

  public SubscriptionDraftDiscountCodeApplyProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionAppliedCodeDiscountProjection<SubscriptionDraftDiscountCodeApplyProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountCodeApplyProjectionRoot<PARENT, ROOT>> appliedDiscount(
      ) {
    SubscriptionAppliedCodeDiscountProjection<SubscriptionDraftDiscountCodeApplyProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountCodeApplyProjectionRoot<PARENT, ROOT>> projection = new SubscriptionAppliedCodeDiscountProjection<>(this, this);    
    getFields().put("appliedDiscount", projection);
    return projection;
  }

  public SubscriptionDraftProjection<SubscriptionDraftDiscountCodeApplyProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountCodeApplyProjectionRoot<PARENT, ROOT>> draft(
      ) {
    SubscriptionDraftProjection<SubscriptionDraftDiscountCodeApplyProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountCodeApplyProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftProjection<>(this, this);    
    getFields().put("draft", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionDraftDiscountCodeApplyProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountCodeApplyProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionDraftDiscountCodeApplyProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountCodeApplyProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
