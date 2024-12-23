package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionShippingOptionResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionShippingOptionResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionShippingOptionResult"));
  }

  public SubscriptionShippingOptionResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionShippingOptionResultFailureFragmentProjection<SubscriptionShippingOptionResultProjection<PARENT, ROOT>, ROOT> onSubscriptionShippingOptionResultFailure(
      ) {
    SubscriptionShippingOptionResultFailureFragmentProjection<SubscriptionShippingOptionResultProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionShippingOptionResultFailureFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionShippingOptionResultSuccessFragmentProjection<SubscriptionShippingOptionResultProjection<PARENT, ROOT>, ROOT> onSubscriptionShippingOptionResultSuccess(
      ) {
    SubscriptionShippingOptionResultSuccessFragmentProjection<SubscriptionShippingOptionResultProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionShippingOptionResultSuccessFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
