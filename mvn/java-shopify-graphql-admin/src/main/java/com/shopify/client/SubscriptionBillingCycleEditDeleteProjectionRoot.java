package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleEditDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleEditDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycleEditDeletePayload"));
  }

  public SubscriptionBillingCycleEditDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleProjection<SubscriptionBillingCycleEditDeleteProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleEditDeleteProjectionRoot<PARENT, ROOT>> billingCycles(
      ) {
    SubscriptionBillingCycleProjection<SubscriptionBillingCycleEditDeleteProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleEditDeleteProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleProjection<>(this, this);    
    getFields().put("billingCycles", projection);
    return projection;
  }

  public SubscriptionBillingCycleUserErrorProjection<SubscriptionBillingCycleEditDeleteProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleEditDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionBillingCycleUserErrorProjection<SubscriptionBillingCycleEditDeleteProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleEditDeleteProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
