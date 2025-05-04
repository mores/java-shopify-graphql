package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleContractDraftCommitProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleContractDraftCommitProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycleContractDraftCommitPayload"));
  }

  public SubscriptionBillingCycleContractDraftCommitProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleEditedContractProjection<SubscriptionBillingCycleContractDraftCommitProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractDraftCommitProjectionRoot<PARENT, ROOT>> contract(
      ) {
    SubscriptionBillingCycleEditedContractProjection<SubscriptionBillingCycleContractDraftCommitProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractDraftCommitProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleEditedContractProjection<>(this, this);    
    getFields().put("contract", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionBillingCycleContractDraftCommitProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractDraftCommitProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionBillingCycleContractDraftCommitProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractDraftCommitProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
