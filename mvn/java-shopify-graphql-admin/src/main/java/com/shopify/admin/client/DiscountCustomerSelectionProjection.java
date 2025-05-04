package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DiscountCustomerSelectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DiscountCustomerSelectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DiscountCustomerSelection"));
  }

  public DiscountCustomerSelectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DiscountCustomerAllFragmentProjection<DiscountCustomerSelectionProjection<PARENT, ROOT>, ROOT> onDiscountCustomerAll(
      ) {
    DiscountCustomerAllFragmentProjection<DiscountCustomerSelectionProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCustomerAllFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCustomerSegmentsFragmentProjection<DiscountCustomerSelectionProjection<PARENT, ROOT>, ROOT> onDiscountCustomerSegments(
      ) {
    DiscountCustomerSegmentsFragmentProjection<DiscountCustomerSelectionProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCustomerSegmentsFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DiscountCustomersFragmentProjection<DiscountCustomerSelectionProjection<PARENT, ROOT>, ROOT> onDiscountCustomers(
      ) {
    DiscountCustomersFragmentProjection<DiscountCustomerSelectionProjection<PARENT, ROOT>, ROOT> fragment = new DiscountCustomersFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
