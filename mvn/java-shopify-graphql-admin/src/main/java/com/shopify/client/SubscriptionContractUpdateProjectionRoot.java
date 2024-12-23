package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractUpdatePayload"));
  }

  public SubscriptionContractUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDraftProjection<SubscriptionContractUpdateProjectionRoot<PARENT, ROOT>, SubscriptionContractUpdateProjectionRoot<PARENT, ROOT>> draft(
      ) {
    SubscriptionDraftProjection<SubscriptionContractUpdateProjectionRoot<PARENT, ROOT>, SubscriptionContractUpdateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftProjection<>(this, this);    
    getFields().put("draft", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionContractUpdateProjectionRoot<PARENT, ROOT>, SubscriptionContractUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionContractUpdateProjectionRoot<PARENT, ROOT>, SubscriptionContractUpdateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
