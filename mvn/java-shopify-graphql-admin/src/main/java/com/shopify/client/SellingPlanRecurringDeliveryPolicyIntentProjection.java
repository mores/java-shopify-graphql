package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanRecurringDeliveryPolicyIntentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanRecurringDeliveryPolicyIntentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanRecurringDeliveryPolicyIntent"));
  }

  public SellingPlanRecurringDeliveryPolicyIntentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
