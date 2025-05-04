package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCyclesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCyclesProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionBillingCycleConnection"));
  }

  public SubscriptionBillingCyclesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleEdgeProjection<SubscriptionBillingCyclesProjectionRoot<PARENT, ROOT>, SubscriptionBillingCyclesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SubscriptionBillingCycleEdgeProjection<SubscriptionBillingCyclesProjectionRoot<PARENT, ROOT>, SubscriptionBillingCyclesProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SubscriptionBillingCycleProjection<SubscriptionBillingCyclesProjectionRoot<PARENT, ROOT>, SubscriptionBillingCyclesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SubscriptionBillingCycleProjection<SubscriptionBillingCyclesProjectionRoot<PARENT, ROOT>, SubscriptionBillingCyclesProjectionRoot<PARENT, ROOT>> projection = new SubscriptionBillingCycleProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<SubscriptionBillingCyclesProjectionRoot<PARENT, ROOT>, SubscriptionBillingCyclesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<SubscriptionBillingCyclesProjectionRoot<PARENT, ROOT>, SubscriptionBillingCyclesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
