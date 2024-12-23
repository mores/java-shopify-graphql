package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractCancelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractCancelProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractCancelPayload"));
  }

  public SubscriptionContractCancelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractProjection<SubscriptionContractCancelProjectionRoot<PARENT, ROOT>, SubscriptionContractCancelProjectionRoot<PARENT, ROOT>> contract(
      ) {
    SubscriptionContractProjection<SubscriptionContractCancelProjectionRoot<PARENT, ROOT>, SubscriptionContractCancelProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractProjection<>(this, this);    
    getFields().put("contract", projection);
    return projection;
  }

  public SubscriptionContractStatusUpdateUserErrorProjection<SubscriptionContractCancelProjectionRoot<PARENT, ROOT>, SubscriptionContractCancelProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionContractStatusUpdateUserErrorProjection<SubscriptionContractCancelProjectionRoot<PARENT, ROOT>, SubscriptionContractCancelProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractStatusUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
