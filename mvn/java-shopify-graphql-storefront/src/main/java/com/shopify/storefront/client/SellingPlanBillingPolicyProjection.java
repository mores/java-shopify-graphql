package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanBillingPolicyProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanBillingPolicyProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SellingPlanBillingPolicy"));
  }

  public SellingPlanBillingPolicyProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanRecurringBillingPolicyFragmentProjection<SellingPlanBillingPolicyProjection<PARENT, ROOT>, ROOT> onSellingPlanRecurringBillingPolicy(
      ) {
    SellingPlanRecurringBillingPolicyFragmentProjection<SellingPlanBillingPolicyProjection<PARENT, ROOT>, ROOT> fragment = new SellingPlanRecurringBillingPolicyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
