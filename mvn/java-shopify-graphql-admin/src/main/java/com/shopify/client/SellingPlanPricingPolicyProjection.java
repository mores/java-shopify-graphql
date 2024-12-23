package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanPricingPolicyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanPricingPolicyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanPricingPolicy"));
  }

  public SellingPlanPricingPolicyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanFixedPricingPolicyFragmentProjection<SellingPlanPricingPolicyProjection<PARENT, ROOT>, ROOT> onSellingPlanFixedPricingPolicy(
      ) {
    SellingPlanFixedPricingPolicyFragmentProjection<SellingPlanPricingPolicyProjection<PARENT, ROOT>, ROOT> fragment = new SellingPlanFixedPricingPolicyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SellingPlanRecurringPricingPolicyFragmentProjection<SellingPlanPricingPolicyProjection<PARENT, ROOT>, ROOT> onSellingPlanRecurringPricingPolicy(
      ) {
    SellingPlanRecurringPricingPolicyFragmentProjection<SellingPlanPricingPolicyProjection<PARENT, ROOT>, ROOT> fragment = new SellingPlanRecurringPricingPolicyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
