package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDraftFreeShippingDiscountAddProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDraftFreeShippingDiscountAddProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionDraftFreeShippingDiscountAddPayload"));
  }

  public SubscriptionDraftFreeShippingDiscountAddProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionManualDiscountProjection<SubscriptionDraftFreeShippingDiscountAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftFreeShippingDiscountAddProjectionRoot<PARENT, ROOT>> discountAdded(
      ) {
    SubscriptionManualDiscountProjection<SubscriptionDraftFreeShippingDiscountAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftFreeShippingDiscountAddProjectionRoot<PARENT, ROOT>> projection = new SubscriptionManualDiscountProjection<>(this, this);    
    getFields().put("discountAdded", projection);
    return projection;
  }

  public SubscriptionDraftProjection<SubscriptionDraftFreeShippingDiscountAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftFreeShippingDiscountAddProjectionRoot<PARENT, ROOT>> draft(
      ) {
    SubscriptionDraftProjection<SubscriptionDraftFreeShippingDiscountAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftFreeShippingDiscountAddProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftProjection<>(this, this);    
    getFields().put("draft", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionDraftFreeShippingDiscountAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftFreeShippingDiscountAddProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionDraftFreeShippingDiscountAddProjectionRoot<PARENT, ROOT>, SubscriptionDraftFreeShippingDiscountAddProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
