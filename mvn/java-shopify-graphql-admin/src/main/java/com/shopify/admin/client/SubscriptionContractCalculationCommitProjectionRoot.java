package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractCalculationCommitProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractCalculationCommitProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractCalculationCommitPayload"));
  }

  public SubscriptionContractCalculationCommitProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionCommittedContractProjection<SubscriptionContractCalculationCommitProjectionRoot<PARENT, ROOT>, SubscriptionContractCalculationCommitProjectionRoot<PARENT, ROOT>> contract(
      ) {
    SubscriptionCommittedContractProjection<SubscriptionContractCalculationCommitProjectionRoot<PARENT, ROOT>, SubscriptionContractCalculationCommitProjectionRoot<PARENT, ROOT>> projection = new SubscriptionCommittedContractProjection<>(this, this);    
    getFields().put("contract", projection);
    return projection;
  }

  public SubscriptionContractCalculationCommitUserErrorProjection<SubscriptionContractCalculationCommitProjectionRoot<PARENT, ROOT>, SubscriptionContractCalculationCommitProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionContractCalculationCommitUserErrorProjection<SubscriptionContractCalculationCommitProjectionRoot<PARENT, ROOT>, SubscriptionContractCalculationCommitProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractCalculationCommitUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
