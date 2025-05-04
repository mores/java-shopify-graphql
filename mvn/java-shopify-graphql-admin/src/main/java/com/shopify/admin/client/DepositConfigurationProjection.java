package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DepositConfigurationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DepositConfigurationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DepositConfiguration"));
  }

  public DepositConfigurationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DepositPercentageFragmentProjection<DepositConfigurationProjection<PARENT, ROOT>, ROOT> onDepositPercentage(
      ) {
    DepositPercentageFragmentProjection<DepositConfigurationProjection<PARENT, ROOT>, ROOT> fragment = new DepositPercentageFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
