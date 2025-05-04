package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingCycleConnection"));
  }

  public SubscriptionBillingCycleConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleEdgeProjection<SubscriptionBillingCycleConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     SubscriptionBillingCycleEdgeProjection<SubscriptionBillingCycleConnectionProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SubscriptionBillingCycleProjection<SubscriptionBillingCycleConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     SubscriptionBillingCycleProjection<SubscriptionBillingCycleConnectionProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SubscriptionBillingCycleConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<SubscriptionBillingCycleConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
