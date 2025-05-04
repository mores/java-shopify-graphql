package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDraftDiscountUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDraftDiscountUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionDraftDiscountUpdatePayload"));
  }

  public SubscriptionDraftDiscountUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionManualDiscountProjection<SubscriptionDraftDiscountUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountUpdateProjectionRoot<PARENT, ROOT>> discountUpdated(
      ) {
    SubscriptionManualDiscountProjection<SubscriptionDraftDiscountUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountUpdateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionManualDiscountProjection<>(this, this);    
    getFields().put("discountUpdated", projection);
    return projection;
  }

  public SubscriptionDraftProjection<SubscriptionDraftDiscountUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountUpdateProjectionRoot<PARENT, ROOT>> draft(
      ) {
    SubscriptionDraftProjection<SubscriptionDraftDiscountUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountUpdateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftProjection<>(this, this);    
    getFields().put("draft", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionDraftDiscountUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionDraftDiscountUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftDiscountUpdateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
