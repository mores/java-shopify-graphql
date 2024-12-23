package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleBulkChargeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleBulkChargeProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycleBulkChargePayload"));
  }

  public SubscriptionBillingCycleBulkChargeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<SubscriptionBillingCycleBulkChargeProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleBulkChargeProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<SubscriptionBillingCycleBulkChargeProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleBulkChargeProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public SubscriptionBillingCycleBulkUserErrorProjection<SubscriptionBillingCycleBulkChargeProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleBulkChargeProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SubscriptionBillingCycleBulkUserErrorProjection<SubscriptionBillingCycleBulkChargeProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleBulkChargeProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleBulkUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
