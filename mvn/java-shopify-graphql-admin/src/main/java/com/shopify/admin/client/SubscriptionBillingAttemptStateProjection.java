package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingAttemptStateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingAttemptStateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttemptState"));
  }

  public SubscriptionBillingAttemptStateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptActionRequiredStateFragmentProjection<SubscriptionBillingAttemptStateProjection<PARENT, ROOT>, ROOT> onSubscriptionBillingAttemptActionRequiredState(
      ) {
    SubscriptionBillingAttemptActionRequiredStateFragmentProjection<SubscriptionBillingAttemptStateProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionBillingAttemptActionRequiredStateFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionBillingAttemptFailedStateFragmentProjection<SubscriptionBillingAttemptStateProjection<PARENT, ROOT>, ROOT> onSubscriptionBillingAttemptFailedState(
      ) {
    SubscriptionBillingAttemptFailedStateFragmentProjection<SubscriptionBillingAttemptStateProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionBillingAttemptFailedStateFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionBillingAttemptPendingStateFragmentProjection<SubscriptionBillingAttemptStateProjection<PARENT, ROOT>, ROOT> onSubscriptionBillingAttemptPendingState(
      ) {
    SubscriptionBillingAttemptPendingStateFragmentProjection<SubscriptionBillingAttemptStateProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionBillingAttemptPendingStateFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionBillingAttemptSuccessStateFragmentProjection<SubscriptionBillingAttemptStateProjection<PARENT, ROOT>, ROOT> onSubscriptionBillingAttemptSuccessState(
      ) {
    SubscriptionBillingAttemptSuccessStateFragmentProjection<SubscriptionBillingAttemptStateProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionBillingAttemptSuccessStateFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
