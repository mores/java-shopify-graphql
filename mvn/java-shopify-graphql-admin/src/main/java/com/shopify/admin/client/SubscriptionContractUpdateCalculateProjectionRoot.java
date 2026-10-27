package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractUpdateCalculateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractUpdateCalculateProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractUpdateCalculatePayload"));
  }

  public SubscriptionContractUpdateCalculateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractCalculationProjection<SubscriptionContractUpdateCalculateProjectionRoot<PARENT, ROOT>, SubscriptionContractUpdateCalculateProjectionRoot<PARENT, ROOT>> subscriptionContractCalculation(
      ) {
    SubscriptionContractCalculationProjection<SubscriptionContractUpdateCalculateProjectionRoot<PARENT, ROOT>, SubscriptionContractUpdateCalculateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractCalculationProjection<>(this, this);    
    getFields().put("subscriptionContractCalculation", projection);
    return projection;
  }

  public SubscriptionContractUpdateCalculateUserErrorProjection<SubscriptionContractUpdateCalculateProjectionRoot<PARENT, ROOT>, SubscriptionContractUpdateCalculateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionContractUpdateCalculateUserErrorProjection<SubscriptionContractUpdateCalculateProjectionRoot<PARENT, ROOT>, SubscriptionContractUpdateCalculateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractUpdateCalculateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
