package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractStatusUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractStatusUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractStatusUpdateUserError"));
  }

  public SubscriptionContractStatusUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractStatusUpdateErrorCodeProjection<SubscriptionContractStatusUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SubscriptionContractStatusUpdateErrorCodeProjection<SubscriptionContractStatusUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractStatusUpdateErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public SubscriptionContractStatusUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public SubscriptionContractStatusUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
