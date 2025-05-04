package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingCycleEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingCycleEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingCycleEdge"));
  }

  public SubscriptionBillingCycleEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingCycleProjection<SubscriptionBillingCycleEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     SubscriptionBillingCycleProjection<SubscriptionBillingCycleEdgeProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingCycleProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SubscriptionBillingCycleEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
