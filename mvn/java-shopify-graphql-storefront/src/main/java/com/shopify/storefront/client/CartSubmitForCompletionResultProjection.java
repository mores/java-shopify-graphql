package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartSubmitForCompletionResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartSubmitForCompletionResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartSubmitForCompletionResult"));
  }

  public CartSubmitForCompletionResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubmitAlreadyAcceptedFragmentProjection<CartSubmitForCompletionResultProjection<PARENT, ROOT>, ROOT> onSubmitAlreadyAccepted(
      ) {
    SubmitAlreadyAcceptedFragmentProjection<CartSubmitForCompletionResultProjection<PARENT, ROOT>, ROOT> fragment = new SubmitAlreadyAcceptedFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubmitFailedFragmentProjection<CartSubmitForCompletionResultProjection<PARENT, ROOT>, ROOT> onSubmitFailed(
      ) {
    SubmitFailedFragmentProjection<CartSubmitForCompletionResultProjection<PARENT, ROOT>, ROOT> fragment = new SubmitFailedFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubmitSuccessFragmentProjection<CartSubmitForCompletionResultProjection<PARENT, ROOT>, ROOT> onSubmitSuccess(
      ) {
    SubmitSuccessFragmentProjection<CartSubmitForCompletionResultProjection<PARENT, ROOT>, ROOT> fragment = new SubmitSuccessFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubmitThrottledFragmentProjection<CartSubmitForCompletionResultProjection<PARENT, ROOT>, ROOT> onSubmitThrottled(
      ) {
    SubmitThrottledFragmentProjection<CartSubmitForCompletionResultProjection<PARENT, ROOT>, ROOT> fragment = new SubmitThrottledFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
