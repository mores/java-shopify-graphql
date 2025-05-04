package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractActivateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractActivateProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractActivatePayload"));
  }

  public SubscriptionContractActivateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractProjection<SubscriptionContractActivateProjectionRoot<PARENT, ROOT>, SubscriptionContractActivateProjectionRoot<PARENT, ROOT>> contract(
      ) {
    SubscriptionContractProjection<SubscriptionContractActivateProjectionRoot<PARENT, ROOT>, SubscriptionContractActivateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractProjection<>(this, this);    
    getFields().put("contract", projection);
    return projection;
  }

  public SubscriptionContractStatusUpdateUserErrorProjection<SubscriptionContractActivateProjectionRoot<PARENT, ROOT>, SubscriptionContractActivateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionContractStatusUpdateUserErrorProjection<SubscriptionContractActivateProjectionRoot<PARENT, ROOT>, SubscriptionContractActivateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractStatusUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
