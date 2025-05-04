package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractAtomicCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractAtomicCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractAtomicCreatePayload"));
  }

  public SubscriptionContractAtomicCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractProjection<SubscriptionContractAtomicCreateProjectionRoot<PARENT, ROOT>, SubscriptionContractAtomicCreateProjectionRoot<PARENT, ROOT>> contract(
      ) {
    SubscriptionContractProjection<SubscriptionContractAtomicCreateProjectionRoot<PARENT, ROOT>, SubscriptionContractAtomicCreateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractProjection<>(this, this);    
    getFields().put("contract", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionContractAtomicCreateProjectionRoot<PARENT, ROOT>, SubscriptionContractAtomicCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionContractAtomicCreateProjectionRoot<PARENT, ROOT>, SubscriptionContractAtomicCreateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
