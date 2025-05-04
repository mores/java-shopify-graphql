package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PurchasingEntityProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PurchasingEntityProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PurchasingEntity"));
  }

  public PurchasingEntityProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerFragmentProjection<PurchasingEntityProjection<PARENT, ROOT>, ROOT> onCustomer() {
    CustomerFragmentProjection<PurchasingEntityProjection<PARENT, ROOT>, ROOT> fragment = new CustomerFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public PurchasingCompanyFragmentProjection<PurchasingEntityProjection<PARENT, ROOT>, ROOT> onPurchasingCompany(
      ) {
    PurchasingCompanyFragmentProjection<PurchasingEntityProjection<PARENT, ROOT>, ROOT> fragment = new PurchasingCompanyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
