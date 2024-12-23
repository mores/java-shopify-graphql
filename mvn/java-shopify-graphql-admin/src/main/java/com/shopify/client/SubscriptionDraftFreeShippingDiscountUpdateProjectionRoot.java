package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionDraftFreeShippingDiscountUpdatePayload"));
  }

  public SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionManualDiscountProjection<SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot<PARENT, ROOT>> discountUpdated(
      ) {
    SubscriptionManualDiscountProjection<SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionManualDiscountProjection<>(this, this);    
    getFields().put("discountUpdated", projection);
    return projection;
  }

  public SubscriptionDraftProjection<SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot<PARENT, ROOT>> draft(
      ) {
    SubscriptionDraftProjection<SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftProjection<>(this, this);    
    getFields().put("draft", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot<PARENT, ROOT>, SubscriptionDraftFreeShippingDiscountUpdateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
