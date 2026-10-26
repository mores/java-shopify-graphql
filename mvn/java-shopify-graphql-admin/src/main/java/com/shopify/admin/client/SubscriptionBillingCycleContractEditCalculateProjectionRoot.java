package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleContractEditCalculateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleContractEditCalculateProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycleContractEditCalculatePayload"));
  }

  public SubscriptionBillingCycleContractEditCalculateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractCalculationProjection<SubscriptionBillingCycleContractEditCalculateProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractEditCalculateProjectionRoot<PARENT, ROOT>> subscriptionContractCalculation(
      ) {
    SubscriptionContractCalculationProjection<SubscriptionBillingCycleContractEditCalculateProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractEditCalculateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractCalculationProjection<>(this, this);    
    getFields().put("subscriptionContractCalculation", projection);
    return projection;
  }

  public SubscriptionBillingCycleContractEditCalculateUserErrorProjection<SubscriptionBillingCycleContractEditCalculateProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractEditCalculateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionBillingCycleContractEditCalculateUserErrorProjection<SubscriptionBillingCycleContractEditCalculateProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractEditCalculateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleContractEditCalculateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
