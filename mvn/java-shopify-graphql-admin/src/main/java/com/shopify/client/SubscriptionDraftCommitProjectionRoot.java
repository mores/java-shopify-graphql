package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDraftCommitProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDraftCommitProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionDraftCommitPayload"));
  }

  public SubscriptionDraftCommitProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractProjection<SubscriptionDraftCommitProjectionRoot<PARENT, ROOT>, SubscriptionDraftCommitProjectionRoot<PARENT, ROOT>> contract(
      ) {
    SubscriptionContractProjection<SubscriptionDraftCommitProjectionRoot<PARENT, ROOT>, SubscriptionDraftCommitProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractProjection<>(this, this);    
    getFields().put("contract", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionDraftCommitProjectionRoot<PARENT, ROOT>, SubscriptionDraftCommitProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionDraftCommitProjectionRoot<PARENT, ROOT>, SubscriptionDraftCommitProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
