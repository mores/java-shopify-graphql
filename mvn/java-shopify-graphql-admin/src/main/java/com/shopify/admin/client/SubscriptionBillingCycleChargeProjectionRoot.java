package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleChargeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleChargeProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycleChargePayload"));
  }

  public SubscriptionBillingCycleChargeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<SubscriptionBillingCycleChargeProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleChargeProjectionRoot<PARENT, ROOT>> subscriptionBillingAttempt(
      ) {
    SubscriptionBillingAttemptProjection<SubscriptionBillingCycleChargeProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleChargeProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingAttemptProjection<>(this, this);    
    getFields().put("subscriptionBillingAttempt", projection);
    return projection;
  }

  public BillingAttemptUserErrorProjection<SubscriptionBillingCycleChargeProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleChargeProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BillingAttemptUserErrorProjection<SubscriptionBillingCycleChargeProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleChargeProjectionRoot<PARENT, ROOT>> projection = new BillingAttemptUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
