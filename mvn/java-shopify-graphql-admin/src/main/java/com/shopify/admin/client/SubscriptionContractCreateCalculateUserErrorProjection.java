package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractCreateCalculateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractCreateCalculateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractCreateCalculateUserError"));
  }

  public SubscriptionContractCreateCalculateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractCreateCalculateUserErrorCodeProjection<SubscriptionContractCreateCalculateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SubscriptionContractCreateCalculateUserErrorCodeProjection<SubscriptionContractCreateCalculateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractCreateCalculateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public SubscriptionContractCreateCalculateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public SubscriptionContractCreateCalculateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
