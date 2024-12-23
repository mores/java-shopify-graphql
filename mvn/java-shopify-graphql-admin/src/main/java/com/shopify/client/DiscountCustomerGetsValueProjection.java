package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCustomerGetsValueProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCustomerGetsValueProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountCustomerGetsValue"));
  }

  public DiscountCustomerGetsValueProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountAmountFragmentProjection<DiscountCustomerGetsValueProjection<PARENT, ROOT>, ROOT> onDiscountAmount(
      ) {
    DiscountAmountFragmentProjection<DiscountCustomerGetsValueProjection<PARENT, ROOT>, ROOT> fragment = new DiscountAmountFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountOnQuantityFragmentProjection<DiscountCustomerGetsValueProjection<PARENT, ROOT>, ROOT> onDiscountOnQuantity(
      ) {
    DiscountOnQuantityFragmentProjection<DiscountCustomerGetsValueProjection<PARENT, ROOT>, ROOT> fragment = new DiscountOnQuantityFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountPercentageFragmentProjection<DiscountCustomerGetsValueProjection<PARENT, ROOT>, ROOT> onDiscountPercentage(
      ) {
    DiscountPercentageFragmentProjection<DiscountCustomerGetsValueProjection<PARENT, ROOT>, ROOT> fragment = new DiscountPercentageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
