package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractFailProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractFailProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractFailPayload"));
  }

  public SubscriptionContractFailProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractProjection<SubscriptionContractFailProjectionRoot<PARENT, ROOT>, SubscriptionContractFailProjectionRoot<PARENT, ROOT>> contract(
      ) {
    SubscriptionContractProjection<SubscriptionContractFailProjectionRoot<PARENT, ROOT>, SubscriptionContractFailProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractProjection<>(this, this);    
    getFields().put("contract", projection);
    return projection;
  }

  public SubscriptionContractStatusUpdateUserErrorProjection<SubscriptionContractFailProjectionRoot<PARENT, ROOT>, SubscriptionContractFailProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionContractStatusUpdateUserErrorProjection<SubscriptionContractFailProjectionRoot<PARENT, ROOT>, SubscriptionContractFailProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractStatusUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
