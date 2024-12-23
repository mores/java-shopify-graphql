package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCustomerBuysValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCustomerBuysValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountCustomerBuysValue"));
  }

  public DiscountCustomerBuysValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountPurchaseAmountFragmentProjection<DiscountCustomerBuysValueProjection<PARENT, ROOT>, ROOT> onDiscountPurchaseAmount(
      ) {
    DiscountPurchaseAmountFragmentProjection<DiscountCustomerBuysValueProjection<PARENT, ROOT>, ROOT> fragment = new DiscountPurchaseAmountFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountQuantityFragmentProjection<DiscountCustomerBuysValueProjection<PARENT, ROOT>, ROOT> onDiscountQuantity(
      ) {
    DiscountQuantityFragmentProjection<DiscountCustomerBuysValueProjection<PARENT, ROOT>, ROOT> fragment = new DiscountQuantityFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
