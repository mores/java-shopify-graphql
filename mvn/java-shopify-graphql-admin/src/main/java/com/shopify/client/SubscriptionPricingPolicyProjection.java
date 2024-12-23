package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionPricingPolicyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionPricingPolicyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionPricingPolicy"));
  }

  public SubscriptionPricingPolicyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<SubscriptionPricingPolicyProjection<PARENT, ROOT>, ROOT> basePrice() {
     MoneyV2Projection<SubscriptionPricingPolicyProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("basePrice", projection);
     return projection;
  }

  public SubscriptionCyclePriceAdjustmentProjection<SubscriptionPricingPolicyProjection<PARENT, ROOT>, ROOT> cycleDiscounts(
      ) {
     SubscriptionCyclePriceAdjustmentProjection<SubscriptionPricingPolicyProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionCyclePriceAdjustmentProjection<>(this, getRoot());
     getFields().put("cycleDiscounts", projection);
     return projection;
  }
}
