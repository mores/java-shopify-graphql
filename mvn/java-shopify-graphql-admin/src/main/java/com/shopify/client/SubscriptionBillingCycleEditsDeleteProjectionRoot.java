package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleEditsDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleEditsDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycleEditsDeletePayload"));
  }

  public SubscriptionBillingCycleEditsDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleProjection<SubscriptionBillingCycleEditsDeleteProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleEditsDeleteProjectionRoot<PARENT, ROOT>> billingCycles(
      ) {
    SubscriptionBillingCycleProjection<SubscriptionBillingCycleEditsDeleteProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleEditsDeleteProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleProjection<>(this, this);    
    getFields().put("billingCycles", projection);
    return projection;
  }

  public SubscriptionBillingCycleUserErrorProjection<SubscriptionBillingCycleEditsDeleteProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleEditsDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionBillingCycleUserErrorProjection<SubscriptionBillingCycleEditsDeleteProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleEditsDeleteProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
