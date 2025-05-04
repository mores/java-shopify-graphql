package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanPricingPolicyAdjustmentTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanPricingPolicyAdjustmentTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanPricingPolicyAdjustmentType"));
  }

  public SellingPlanPricingPolicyAdjustmentTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
