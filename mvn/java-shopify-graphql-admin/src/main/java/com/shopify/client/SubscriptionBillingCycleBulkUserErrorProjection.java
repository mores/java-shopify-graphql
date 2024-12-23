package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleBulkUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleBulkUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingCycleBulkUserError"));
  }

  public SubscriptionBillingCycleBulkUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleBulkUserErrorCodeProjection<SubscriptionBillingCycleBulkUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SubscriptionBillingCycleBulkUserErrorCodeProjection<SubscriptionBillingCycleBulkUserErrorProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleBulkUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public SubscriptionBillingCycleBulkUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public SubscriptionBillingCycleBulkUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
