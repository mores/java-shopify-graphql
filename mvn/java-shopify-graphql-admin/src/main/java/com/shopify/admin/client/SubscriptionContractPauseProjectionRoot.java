package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractPauseProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractPauseProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractPausePayload"));
  }

  public SubscriptionContractPauseProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractProjection<SubscriptionContractPauseProjectionRoot<PARENT, ROOT>, SubscriptionContractPauseProjectionRoot<PARENT, ROOT>> contract(
      ) {
    SubscriptionContractProjection<SubscriptionContractPauseProjectionRoot<PARENT, ROOT>, SubscriptionContractPauseProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractProjection<>(this, this);    
    getFields().put("contract", projection);
    return projection;
  }

  public SubscriptionContractStatusUpdateUserErrorProjection<SubscriptionContractPauseProjectionRoot<PARENT, ROOT>, SubscriptionContractPauseProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionContractStatusUpdateUserErrorProjection<SubscriptionContractPauseProjectionRoot<PARENT, ROOT>, SubscriptionContractPauseProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractStatusUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
