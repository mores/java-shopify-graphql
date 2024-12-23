package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanFixedDeliveryPolicyPreAnchorBehaviorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanFixedDeliveryPolicyPreAnchorBehaviorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanFixedDeliveryPolicyPreAnchorBehavior"));
  }

  public SellingPlanFixedDeliveryPolicyPreAnchorBehaviorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
