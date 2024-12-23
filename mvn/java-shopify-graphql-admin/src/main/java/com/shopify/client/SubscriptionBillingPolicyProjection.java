package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingPolicyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingPolicyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingPolicy"));
  }

  public SubscriptionBillingPolicyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanAnchorProjection<SubscriptionBillingPolicyProjection<PARENT, ROOT>, ROOT> anchors(
      ) {
     SellingPlanAnchorProjection<SubscriptionBillingPolicyProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAnchorProjection<>(this, getRoot());
     getFields().put("anchors", projection);
     return projection;
  }

  public SellingPlanIntervalProjection<SubscriptionBillingPolicyProjection<PARENT, ROOT>, ROOT> interval(
      ) {
     SellingPlanIntervalProjection<SubscriptionBillingPolicyProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanIntervalProjection<>(this, getRoot());
     getFields().put("interval", projection);
     return projection;
  }

  public SubscriptionBillingPolicyProjection<PARENT, ROOT> intervalCount() {
    getFields().put("intervalCount", null);
    return this;
  }

  public SubscriptionBillingPolicyProjection<PARENT, ROOT> maxCycles() {
    getFields().put("maxCycles", null);
    return this;
  }

  public SubscriptionBillingPolicyProjection<PARENT, ROOT> minCycles() {
    getFields().put("minCycles", null);
    return this;
  }
}
