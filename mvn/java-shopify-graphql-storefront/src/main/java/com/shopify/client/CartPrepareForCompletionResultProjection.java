package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartPrepareForCompletionResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartPrepareForCompletionResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartPrepareForCompletionResult"));
  }

  public CartPrepareForCompletionResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartStatusNotReadyFragmentProjection<CartPrepareForCompletionResultProjection<PARENT, ROOT>, ROOT> onCartStatusNotReady(
      ) {
    CartStatusNotReadyFragmentProjection<CartPrepareForCompletionResultProjection<PARENT, ROOT>, ROOT> fragment = new CartStatusNotReadyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CartStatusReadyFragmentProjection<CartPrepareForCompletionResultProjection<PARENT, ROOT>, ROOT> onCartStatusReady(
      ) {
    CartStatusReadyFragmentProjection<CartPrepareForCompletionResultProjection<PARENT, ROOT>, ROOT> fragment = new CartStatusReadyFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public CartThrottledFragmentProjection<CartPrepareForCompletionResultProjection<PARENT, ROOT>, ROOT> onCartThrottled(
      ) {
    CartThrottledFragmentProjection<CartPrepareForCompletionResultProjection<PARENT, ROOT>, ROOT> fragment = new CartThrottledFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
