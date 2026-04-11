package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingAttemptActionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingAttemptActionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttemptAction"));
  }

  public SubscriptionBillingAttemptActionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptPaymentChallengeFragmentProjection<SubscriptionBillingAttemptActionProjection<PARENT, ROOT>, ROOT> onSubscriptionBillingAttemptPaymentChallenge(
      ) {
    SubscriptionBillingAttemptPaymentChallengeFragmentProjection<SubscriptionBillingAttemptActionProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionBillingAttemptPaymentChallengeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
