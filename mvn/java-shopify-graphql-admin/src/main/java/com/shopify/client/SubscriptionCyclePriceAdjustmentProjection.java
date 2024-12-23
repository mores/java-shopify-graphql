package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionCyclePriceAdjustmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionCyclePriceAdjustmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionCyclePriceAdjustment"));
  }

  public SubscriptionCyclePriceAdjustmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanPricingPolicyAdjustmentTypeProjection<SubscriptionCyclePriceAdjustmentProjection<PARENT, ROOT>, ROOT> adjustmentType(
      ) {
     SellingPlanPricingPolicyAdjustmentTypeProjection<SubscriptionCyclePriceAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanPricingPolicyAdjustmentTypeProjection<>(this, getRoot());
     getFields().put("adjustmentType", projection);
     return projection;
  }

  public SellingPlanPricingPolicyAdjustmentValueProjection<SubscriptionCyclePriceAdjustmentProjection<PARENT, ROOT>, ROOT> adjustmentValue(
      ) {
     SellingPlanPricingPolicyAdjustmentValueProjection<SubscriptionCyclePriceAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanPricingPolicyAdjustmentValueProjection<>(this, getRoot());
     getFields().put("adjustmentValue", projection);
     return projection;
  }

  public MoneyV2Projection<SubscriptionCyclePriceAdjustmentProjection<PARENT, ROOT>, ROOT> computedPrice(
      ) {
     MoneyV2Projection<SubscriptionCyclePriceAdjustmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("computedPrice", projection);
     return projection;
  }

  public SubscriptionCyclePriceAdjustmentProjection<PARENT, ROOT> afterCycle() {
    getFields().put("afterCycle", null);
    return this;
  }
}
