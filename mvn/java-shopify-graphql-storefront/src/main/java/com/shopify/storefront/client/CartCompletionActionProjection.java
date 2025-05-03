package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartCompletionActionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartCompletionActionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartCompletionAction"));
  }

  public CartCompletionActionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompletePaymentChallengeFragmentProjection<CartCompletionActionProjection<PARENT, ROOT>, ROOT> onCompletePaymentChallenge(
      ) {
    CompletePaymentChallengeFragmentProjection<CartCompletionActionProjection<PARENT, ROOT>, ROOT> fragment = new CompletePaymentChallengeFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
