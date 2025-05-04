package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountMinimumRequirementProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountMinimumRequirementProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountMinimumRequirement"));
  }

  public DiscountMinimumRequirementProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountMinimumQuantityFragmentProjection<DiscountMinimumRequirementProjection<PARENT, ROOT>, ROOT> onDiscountMinimumQuantity(
      ) {
    DiscountMinimumQuantityFragmentProjection<DiscountMinimumRequirementProjection<PARENT, ROOT>, ROOT> fragment = new DiscountMinimumQuantityFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountMinimumSubtotalFragmentProjection<DiscountMinimumRequirementProjection<PARENT, ROOT>, ROOT> onDiscountMinimumSubtotal(
      ) {
    DiscountMinimumSubtotalFragmentProjection<DiscountMinimumRequirementProjection<PARENT, ROOT>, ROOT> fragment = new DiscountMinimumSubtotalFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
