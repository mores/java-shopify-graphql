package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingAttemptEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingAttemptEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttemptEdge"));
  }

  public SubscriptionBillingAttemptEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptProjection<SubscriptionBillingAttemptEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     SubscriptionBillingAttemptProjection<SubscriptionBillingAttemptEdgeProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SubscriptionBillingAttemptEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
