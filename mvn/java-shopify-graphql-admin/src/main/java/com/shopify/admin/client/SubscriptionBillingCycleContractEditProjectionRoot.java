package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleContractEditProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleContractEditProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycleContractEditPayload"));
  }

  public SubscriptionBillingCycleContractEditProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDraftProjection<SubscriptionBillingCycleContractEditProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractEditProjectionRoot<PARENT, ROOT>> draft(
      ) {
    SubscriptionDraftProjection<SubscriptionBillingCycleContractEditProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractEditProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftProjection<>(this, this);    
    getFields().put("draft", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionBillingCycleContractEditProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractEditProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionBillingCycleContractEditProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleContractEditProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
