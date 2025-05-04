package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionBillingAttemptProcessingErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionBillingAttemptProcessingErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionBillingAttemptProcessingError"));
  }

  public SubscriptionBillingAttemptProcessingErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionBillingAttemptErrorCodeProjection<SubscriptionBillingAttemptProcessingErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     SubscriptionBillingAttemptErrorCodeProjection<SubscriptionBillingAttemptProcessingErrorProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionBillingAttemptErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public SubscriptionBillingAttemptProcessingErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  public SubscriptionBillingAttemptGenericErrorFragmentProjection<SubscriptionBillingAttemptProcessingErrorProjection<PARENT, ROOT>, ROOT> onSubscriptionBillingAttemptGenericError(
      ) {
    SubscriptionBillingAttemptGenericErrorFragmentProjection<SubscriptionBillingAttemptProcessingErrorProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionBillingAttemptGenericErrorFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection<SubscriptionBillingAttemptProcessingErrorProjection<PARENT, ROOT>, ROOT> onSubscriptionBillingAttemptInsufficientStockProductVariantsError(
      ) {
    SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection<SubscriptionBillingAttemptProcessingErrorProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionBillingAttemptInsufficientStockProductVariantsErrorFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionBillingAttemptOutOfStockProductVariantsErrorFragmentProjection<SubscriptionBillingAttemptProcessingErrorProjection<PARENT, ROOT>, ROOT> onSubscriptionBillingAttemptOutOfStockProductVariantsError(
      ) {
    SubscriptionBillingAttemptOutOfStockProductVariantsErrorFragmentProjection<SubscriptionBillingAttemptProcessingErrorProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionBillingAttemptOutOfStockProductVariantsErrorFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
