package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountContextProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountContextProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountContext"));
  }

  public DiscountContextProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountBuyerSelectionAllFragmentProjection<DiscountContextProjection<PARENT, ROOT>, ROOT> onDiscountBuyerSelectionAll(
      ) {
    DiscountBuyerSelectionAllFragmentProjection<DiscountContextProjection<PARENT, ROOT>, ROOT> fragment = new DiscountBuyerSelectionAllFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCustomerSegmentsFragmentProjection<DiscountContextProjection<PARENT, ROOT>, ROOT> onDiscountCustomerSegments(
      ) {
    DiscountCustomerSegmentsFragmentProjection<DiscountContextProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCustomerSegmentsFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCustomersFragmentProjection<DiscountContextProjection<PARENT, ROOT>, ROOT> onDiscountCustomers(
      ) {
    DiscountCustomersFragmentProjection<DiscountContextProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCustomersFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
