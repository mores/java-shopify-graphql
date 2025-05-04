package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceRuleValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleValue"));
  }

  public PriceRuleValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceRuleFixedAmountValueFragmentProjection<PriceRuleValueProjection<PARENT, ROOT>, ROOT> onPriceRuleFixedAmountValue(
      ) {
    PriceRuleFixedAmountValueFragmentProjection<PriceRuleValueProjection<PARENT, ROOT>, ROOT> fragment = new PriceRuleFixedAmountValueFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PriceRulePercentValueFragmentProjection<PriceRuleValueProjection<PARENT, ROOT>, ROOT> onPriceRulePercentValue(
      ) {
    PriceRulePercentValueFragmentProjection<PriceRuleValueProjection<PARENT, ROOT>, ROOT> fragment = new PriceRulePercentValueFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
