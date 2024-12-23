package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractSetNextBillingDateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractSetNextBillingDateProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractSetNextBillingDatePayload"));
  }

  public SubscriptionContractSetNextBillingDateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractProjection<SubscriptionContractSetNextBillingDateProjectionRoot<PARENT, ROOT>, SubscriptionContractSetNextBillingDateProjectionRoot<PARENT, ROOT>> contract(
      ) {
    SubscriptionContractProjection<SubscriptionContractSetNextBillingDateProjectionRoot<PARENT, ROOT>, SubscriptionContractSetNextBillingDateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractProjection<>(this, this);    
    getFields().put("contract", projection);
    return projection;
  }

  public SubscriptionContractUserErrorProjection<SubscriptionContractSetNextBillingDateProjectionRoot<PARENT, ROOT>, SubscriptionContractSetNextBillingDateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionContractUserErrorProjection<SubscriptionContractSetNextBillingDateProjectionRoot<PARENT, ROOT>, SubscriptionContractSetNextBillingDateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
