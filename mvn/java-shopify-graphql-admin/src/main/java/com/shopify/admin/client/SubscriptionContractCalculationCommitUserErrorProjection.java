package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractCalculationCommitUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractCalculationCommitUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractCalculationCommitUserError"));
  }

  public SubscriptionContractCalculationCommitUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractCalculationCommitUserErrorCodeProjection<SubscriptionContractCalculationCommitUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SubscriptionContractCalculationCommitUserErrorCodeProjection<SubscriptionContractCalculationCommitUserErrorProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractCalculationCommitUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public SubscriptionContractCalculationCommitUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public SubscriptionContractCalculationCommitUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
