package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractExpireProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractExpireProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractExpirePayload"));
  }

  public SubscriptionContractExpireProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractProjection<SubscriptionContractExpireProjectionRoot<PARENT, ROOT>, SubscriptionContractExpireProjectionRoot<PARENT, ROOT>> contract(
      ) {
    SubscriptionContractProjection<SubscriptionContractExpireProjectionRoot<PARENT, ROOT>, SubscriptionContractExpireProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractProjection<>(this, this);    
    getFields().put("contract", projection);
    return projection;
  }

  public SubscriptionContractStatusUpdateUserErrorProjection<SubscriptionContractExpireProjectionRoot<PARENT, ROOT>, SubscriptionContractExpireProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionContractStatusUpdateUserErrorProjection<SubscriptionContractExpireProjectionRoot<PARENT, ROOT>, SubscriptionContractExpireProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractStatusUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
