package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractUpdateCalculateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractUpdateCalculateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractUpdateCalculateUserError"));
  }

  public SubscriptionContractUpdateCalculateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractUpdateCalculateUserErrorCodeProjection<SubscriptionContractUpdateCalculateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SubscriptionContractUpdateCalculateUserErrorCodeProjection<SubscriptionContractUpdateCalculateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractUpdateCalculateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public SubscriptionContractUpdateCalculateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public SubscriptionContractUpdateCalculateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
