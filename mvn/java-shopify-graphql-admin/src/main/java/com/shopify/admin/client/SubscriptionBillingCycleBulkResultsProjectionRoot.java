package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleBulkResultsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleBulkResultsProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycleConnection"));
  }

  public SubscriptionBillingCycleBulkResultsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleEdgeProjection<SubscriptionBillingCycleBulkResultsProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleBulkResultsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SubscriptionBillingCycleEdgeProjection<SubscriptionBillingCycleBulkResultsProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleBulkResultsProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SubscriptionBillingCycleProjection<SubscriptionBillingCycleBulkResultsProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleBulkResultsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SubscriptionBillingCycleProjection<SubscriptionBillingCycleBulkResultsProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleBulkResultsProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<SubscriptionBillingCycleBulkResultsProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleBulkResultsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<SubscriptionBillingCycleBulkResultsProjectionRoot<PARENT, ROOT>, SubscriptionBillingCycleBulkResultsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
