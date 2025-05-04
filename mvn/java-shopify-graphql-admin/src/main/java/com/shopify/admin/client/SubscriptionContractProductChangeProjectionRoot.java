package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractProductChangeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractProductChangeProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractProductChangePayload"));
  }

  public SubscriptionContractProductChangeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractProjection<SubscriptionContractProductChangeProjectionRoot<PARENT, ROOT>, SubscriptionContractProductChangeProjectionRoot<PARENT, ROOT>> contract(
      ) {
    SubscriptionContractProjection<SubscriptionContractProductChangeProjectionRoot<PARENT, ROOT>, SubscriptionContractProductChangeProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractProjection<>(this, this);    
    getFields().put("contract", projection);
    return projection;
  }

  public SubscriptionLineProjection<SubscriptionContractProductChangeProjectionRoot<PARENT, ROOT>, SubscriptionContractProductChangeProjectionRoot<PARENT, ROOT>> lineUpdated(
      ) {
    SubscriptionLineProjection<SubscriptionContractProductChangeProjectionRoot<PARENT, ROOT>, SubscriptionContractProductChangeProjectionRoot<PARENT, ROOT>> projection = new SubscriptionLineProjection<>(this, this);    
    getFields().put("lineUpdated", projection);
    return projection;
  }

  public SubscriptionDraftUserErrorProjection<SubscriptionContractProductChangeProjectionRoot<PARENT, ROOT>, SubscriptionContractProductChangeProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionDraftUserErrorProjection<SubscriptionContractProductChangeProjectionRoot<PARENT, ROOT>, SubscriptionContractProductChangeProjectionRoot<PARENT, ROOT>> projection = new SubscriptionDraftUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
