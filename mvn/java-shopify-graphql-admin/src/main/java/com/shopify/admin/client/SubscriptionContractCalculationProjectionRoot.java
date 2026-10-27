package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractCalculationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractCalculationProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractCalculation"));
  }

  public SubscriptionContractCalculationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractCalculationFailureFragmentProjection<SubscriptionContractCalculationProjectionRoot<PARENT, ROOT>, SubscriptionContractCalculationProjectionRoot<PARENT, ROOT>> onSubscriptionContractCalculationFailure(
      ) {
    SubscriptionContractCalculationFailureFragmentProjection<SubscriptionContractCalculationProjectionRoot<PARENT, ROOT>, SubscriptionContractCalculationProjectionRoot<PARENT, ROOT>> fragment = new SubscriptionContractCalculationFailureFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionContractCalculationPendingFragmentProjection<SubscriptionContractCalculationProjectionRoot<PARENT, ROOT>, SubscriptionContractCalculationProjectionRoot<PARENT, ROOT>> onSubscriptionContractCalculationPending(
      ) {
    SubscriptionContractCalculationPendingFragmentProjection<SubscriptionContractCalculationProjectionRoot<PARENT, ROOT>, SubscriptionContractCalculationProjectionRoot<PARENT, ROOT>> fragment = new SubscriptionContractCalculationPendingFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionContractCalculationSuccessFragmentProjection<SubscriptionContractCalculationProjectionRoot<PARENT, ROOT>, SubscriptionContractCalculationProjectionRoot<PARENT, ROOT>> onSubscriptionContractCalculationSuccess(
      ) {
    SubscriptionContractCalculationSuccessFragmentProjection<SubscriptionContractCalculationProjectionRoot<PARENT, ROOT>, SubscriptionContractCalculationProjectionRoot<PARENT, ROOT>> fragment = new SubscriptionContractCalculationSuccessFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
