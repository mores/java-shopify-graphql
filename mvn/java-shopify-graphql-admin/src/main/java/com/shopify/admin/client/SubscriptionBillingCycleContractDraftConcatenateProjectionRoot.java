package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleContractDraftConcatenateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleContractDraftConcatenateProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycleContractDraftConcatenatePayload"));
  }

  public SubscriptionBillingCycleContractDraftConcatenateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDraftProjection<SubscriptionBillingCycleContractDraftConcatenateProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractDraftConcatenateProjectionRoot<PARENT, ROOT>> draft(
      ) {
    SubscriptionDraftProjection<SubscriptionBillingCycleContractDraftConcatenateProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractDraftConcatenateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftProjection<>(this, this);    
    getFields().put("draft", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionBillingCycleContractDraftConcatenateProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractDraftConcatenateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionBillingCycleContractDraftConcatenateProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractDraftConcatenateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
