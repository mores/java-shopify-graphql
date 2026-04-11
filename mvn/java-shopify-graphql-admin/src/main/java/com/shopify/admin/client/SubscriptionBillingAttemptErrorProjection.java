package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingAttemptErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingAttemptErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttemptError"));
  }

  public SubscriptionBillingAttemptErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptGeneralErrorFragmentProjection<SubscriptionBillingAttemptErrorProjection<PARENT, ROOT>, ROOT> onSubscriptionBillingAttemptGeneralError(
      ) {
    SubscriptionBillingAttemptGeneralErrorFragmentProjection<SubscriptionBillingAttemptErrorProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionBillingAttemptGeneralErrorFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionBillingAttemptInventoryErrorFragmentProjection<SubscriptionBillingAttemptErrorProjection<PARENT, ROOT>, ROOT> onSubscriptionBillingAttemptInventoryError(
      ) {
    SubscriptionBillingAttemptInventoryErrorFragmentProjection<SubscriptionBillingAttemptErrorProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionBillingAttemptInventoryErrorFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionBillingAttemptPaymentErrorFragmentProjection<SubscriptionBillingAttemptErrorProjection<PARENT, ROOT>, ROOT> onSubscriptionBillingAttemptPaymentError(
      ) {
    SubscriptionBillingAttemptPaymentErrorFragmentProjection<SubscriptionBillingAttemptErrorProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionBillingAttemptPaymentErrorFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionBillingAttemptUnexpectedErrorFragmentProjection<SubscriptionBillingAttemptErrorProjection<PARENT, ROOT>, ROOT> onSubscriptionBillingAttemptUnexpectedError(
      ) {
    SubscriptionBillingAttemptUnexpectedErrorFragmentProjection<SubscriptionBillingAttemptErrorProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionBillingAttemptUnexpectedErrorFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
