package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleScheduleEditProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleScheduleEditProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycleScheduleEditPayload"));
  }

  public SubscriptionBillingCycleScheduleEditProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleProjection<SubscriptionBillingCycleScheduleEditProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleScheduleEditProjectionRoot<PARENT, ROOT>> billingCycle(
      ) {
    SubscriptionBillingCycleProjection<SubscriptionBillingCycleScheduleEditProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleScheduleEditProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleProjection<>(this, this);    
    getFields().put("billingCycle", projection);
    return projection;
  }

  public SubscriptionBillingCycleUserErrorProjection<SubscriptionBillingCycleScheduleEditProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleScheduleEditProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionBillingCycleUserErrorProjection<SubscriptionBillingCycleScheduleEditProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleScheduleEditProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
