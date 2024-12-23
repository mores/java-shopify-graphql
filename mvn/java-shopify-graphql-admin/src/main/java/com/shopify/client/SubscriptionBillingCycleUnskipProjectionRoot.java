package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleUnskipProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleUnskipProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycleUnskipPayload"));
  }

  public SubscriptionBillingCycleUnskipProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleProjection<SubscriptionBillingCycleUnskipProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleUnskipProjectionRoot<PARENT, ROOT>> billingCycle(
      ) {
    SubscriptionBillingCycleProjection<SubscriptionBillingCycleUnskipProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleUnskipProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleProjection<>(this, this);    
    getFields().put("billingCycle", projection);
    return projection;
  }

  public SubscriptionBillingCycleUnskipUserErrorProjection<SubscriptionBillingCycleUnskipProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleUnskipProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionBillingCycleUnskipUserErrorProjection<SubscriptionBillingCycleUnskipProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleUnskipProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleUnskipUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
