package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartCompletionAttemptProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartCompletionAttemptProjectionRoot() {
    super(null, null, java.util.Optional.of("CartCompletionAttemptResult"));
  }

  public CartCompletionAttemptProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartCompletionActionRequiredFragmentProjection<CartCompletionAttemptProjectionRoot<PARENT, ROOT>, CartCompletionAttemptProjectionRoot<PARENT, ROOT>> onCartCompletionActionRequired(
      ) {
    CartCompletionActionRequiredFragmentProjection<CartCompletionAttemptProjectionRoot<PARENT, ROOT>, CartCompletionAttemptProjectionRoot<PARENT, ROOT>> fragment = new CartCompletionActionRequiredFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CartCompletionFailedFragmentProjection<CartCompletionAttemptProjectionRoot<PARENT, ROOT>, CartCompletionAttemptProjectionRoot<PARENT, ROOT>> onCartCompletionFailed(
      ) {
    CartCompletionFailedFragmentProjection<CartCompletionAttemptProjectionRoot<PARENT, ROOT>, CartCompletionAttemptProjectionRoot<PARENT, ROOT>> fragment = new CartCompletionFailedFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CartCompletionProcessingFragmentProjection<CartCompletionAttemptProjectionRoot<PARENT, ROOT>, CartCompletionAttemptProjectionRoot<PARENT, ROOT>> onCartCompletionProcessing(
      ) {
    CartCompletionProcessingFragmentProjection<CartCompletionAttemptProjectionRoot<PARENT, ROOT>, CartCompletionAttemptProjectionRoot<PARENT, ROOT>> fragment = new CartCompletionProcessingFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }

  public CartCompletionSuccessFragmentProjection<CartCompletionAttemptProjectionRoot<PARENT, ROOT>, CartCompletionAttemptProjectionRoot<PARENT, ROOT>> onCartCompletionSuccess(
      ) {
    CartCompletionSuccessFragmentProjection<CartCompletionAttemptProjectionRoot<PARENT, ROOT>, CartCompletionAttemptProjectionRoot<PARENT, ROOT>> fragment = new CartCompletionSuccessFragmentProjection<>(this, this);
    getFragments().add(fragment);
    return fragment;
  }
}
