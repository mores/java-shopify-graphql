package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleUnskipUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleUnskipUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingCycleUnskipUserError"));
  }

  public SubscriptionBillingCycleUnskipUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleUnskipUserErrorCodeProjection<SubscriptionBillingCycleUnskipUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SubscriptionBillingCycleUnskipUserErrorCodeProjection<SubscriptionBillingCycleUnskipUserErrorProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleUnskipUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public SubscriptionBillingCycleUnskipUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public SubscriptionBillingCycleUnskipUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
