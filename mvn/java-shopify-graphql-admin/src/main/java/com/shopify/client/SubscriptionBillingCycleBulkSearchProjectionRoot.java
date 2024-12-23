package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleBulkSearchProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleBulkSearchProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycleBulkSearchPayload"));
  }

  public SubscriptionBillingCycleBulkSearchProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<SubscriptionBillingCycleBulkSearchProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleBulkSearchProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<SubscriptionBillingCycleBulkSearchProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleBulkSearchProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public SubscriptionBillingCycleBulkUserErrorProjection<SubscriptionBillingCycleBulkSearchProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleBulkSearchProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionBillingCycleBulkUserErrorProjection<SubscriptionBillingCycleBulkSearchProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleBulkSearchProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleBulkUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
