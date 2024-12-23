package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDeliveryPolicyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDeliveryPolicyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDeliveryPolicy"));
  }

  public SubscriptionDeliveryPolicyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanAnchorProjection<SubscriptionDeliveryPolicyProjection<PARENT, ROOT>, ROOT> anchors(
      ) {
     SellingPlanAnchorProjection<SubscriptionDeliveryPolicyProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanAnchorProjection<>(this, getRoot());
     getFields().put("anchors", projection);
     return projection;
  }

  public SellingPlanIntervalProjection<SubscriptionDeliveryPolicyProjection<PARENT, ROOT>, ROOT> interval(
      ) {
     SellingPlanIntervalProjection<SubscriptionDeliveryPolicyProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanIntervalProjection<>(this, getRoot());
     getFields().put("interval", projection);
     return projection;
  }

  public SubscriptionDeliveryPolicyProjection<PARENT, ROOT> intervalCount() {
    getFields().put("intervalCount", null);
    return this;
  }
}
