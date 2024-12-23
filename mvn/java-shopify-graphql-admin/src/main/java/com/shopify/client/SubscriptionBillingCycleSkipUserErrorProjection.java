package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleSkipUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleSkipUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingCycleSkipUserError"));
  }

  public SubscriptionBillingCycleSkipUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleSkipUserErrorCodeProjection<SubscriptionBillingCycleSkipUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SubscriptionBillingCycleSkipUserErrorCodeProjection<SubscriptionBillingCycleSkipUserErrorProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleSkipUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public SubscriptionBillingCycleSkipUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public SubscriptionBillingCycleSkipUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
