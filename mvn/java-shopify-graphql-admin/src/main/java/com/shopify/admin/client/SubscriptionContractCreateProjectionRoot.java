package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractCreatePayload"));
  }

  public SubscriptionContractCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDraftProjection<SubscriptionContractCreateProjectionRoot<PARENT, ROOT>, SubscriptionContractCreateProjectionRoot<PARENT, ROOT>> draft(
      ) {
    SubscriptionDraftProjection<SubscriptionContractCreateProjectionRoot<PARENT, ROOT>, SubscriptionContractCreateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftProjection<>(this, this);    
    getFields().put("draft", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionContractCreateProjectionRoot<PARENT, ROOT>, SubscriptionContractCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionContractCreateProjectionRoot<PARENT, ROOT>, SubscriptionContractCreateProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
