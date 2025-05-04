package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMomentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMomentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMoment"));
  }

  public CustomerMomentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerMomentProjection<PARENT, ROOT> occurredAt() {
    getFields().put("occurredAt", null);
    return this;
  }

  public CustomerVisitFragmentProjection<CustomerMomentProjection<PARENT, ROOT>, ROOT> onCustomerVisit(
      ) {
    CustomerVisitFragmentProjection<CustomerMomentProjection<PARENT, ROOT>, ROOT> fragment = new CustomerVisitFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
