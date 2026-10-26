package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractCreateCalculateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractCreateCalculateProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractCreateCalculatePayload"));
  }

  public SubscriptionContractCreateCalculateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractCalculationProjection<SubscriptionContractCreateCalculateProjectionRoot<PARENT, ROOT>, SubscriptionContractCreateCalculateProjectionRoot<PARENT, ROOT>> subscriptionContractCalculation(
      ) {
    SubscriptionContractCalculationProjection<SubscriptionContractCreateCalculateProjectionRoot<PARENT, ROOT>, SubscriptionContractCreateCalculateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractCalculationProjection<>(this, this);    
    getFields().put("subscriptionContractCalculation", projection);
    return projection;
  }

  public SubscriptionContractCreateCalculateUserErrorProjection<SubscriptionContractCreateCalculateProjectionRoot<PARENT, ROOT>, SubscriptionContractCreateCalculateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionContractCreateCalculateUserErrorProjection<SubscriptionContractCreateCalculateProjectionRoot<PARENT, ROOT>, SubscriptionContractCreateCalculateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractCreateCalculateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
