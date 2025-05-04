package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanRecurringDeliveryPolicyPreAnchorBehaviorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanRecurringDeliveryPolicyPreAnchorBehaviorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanRecurringDeliveryPolicyPreAnchorBehavior"));
  }

  public SellingPlanRecurringDeliveryPolicyPreAnchorBehaviorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
