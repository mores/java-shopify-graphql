package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleSkipProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleSkipProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycleSkipPayload"));
  }

  public SubscriptionBillingCycleSkipProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleProjection<SubscriptionBillingCycleSkipProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleSkipProjectionRoot<PARENT, ROOT>> billingCycle(
      ) {
    SubscriptionBillingCycleProjection<SubscriptionBillingCycleSkipProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleSkipProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleProjection<>(this, this);    
    getFields().put("billingCycle", projection);
    return projection;
  }

  public SubscriptionBillingCycleSkipUserErrorProjection<SubscriptionBillingCycleSkipProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleSkipProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionBillingCycleSkipUserErrorProjection<SubscriptionBillingCycleSkipProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleSkipProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleSkipUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
