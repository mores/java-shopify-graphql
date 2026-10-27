package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractCalculationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractCalculationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractCalculation"));
  }

  public SubscriptionContractCalculationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractCalculationFailureFragmentProjection<SubscriptionContractCalculationProjection<PARENT, ROOT>, ROOT> onSubscriptionContractCalculationFailure(
      ) {
    SubscriptionContractCalculationFailureFragmentProjection<SubscriptionContractCalculationProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionContractCalculationFailureFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionContractCalculationPendingFragmentProjection<SubscriptionContractCalculationProjection<PARENT, ROOT>, ROOT> onSubscriptionContractCalculationPending(
      ) {
    SubscriptionContractCalculationPendingFragmentProjection<SubscriptionContractCalculationProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionContractCalculationPendingFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionContractCalculationSuccessFragmentProjection<SubscriptionContractCalculationProjection<PARENT, ROOT>, ROOT> onSubscriptionContractCalculationSuccess(
      ) {
    SubscriptionContractCalculationSuccessFragmentProjection<SubscriptionContractCalculationProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionContractCalculationSuccessFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
