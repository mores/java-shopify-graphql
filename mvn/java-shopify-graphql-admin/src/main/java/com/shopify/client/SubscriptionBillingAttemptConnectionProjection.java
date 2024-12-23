package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingAttemptConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingAttemptConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttemptConnection"));
  }

  public SubscriptionBillingAttemptConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptEdgeProjection<SubscriptionBillingAttemptConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     SubscriptionBillingAttemptEdgeProjection<SubscriptionBillingAttemptConnectionProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SubscriptionBillingAttemptProjection<SubscriptionBillingAttemptConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     SubscriptionBillingAttemptProjection<SubscriptionBillingAttemptConnectionProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SubscriptionBillingAttemptConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<SubscriptionBillingAttemptConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
