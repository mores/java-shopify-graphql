package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDeliveryOptionResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDeliveryOptionResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDeliveryOptionResult"));
  }

  public SubscriptionDeliveryOptionResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDeliveryOptionResultFailureFragmentProjection<SubscriptionDeliveryOptionResultProjection<PARENT, ROOT>, ROOT> onSubscriptionDeliveryOptionResultFailure(
      ) {
    SubscriptionDeliveryOptionResultFailureFragmentProjection<SubscriptionDeliveryOptionResultProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionDeliveryOptionResultFailureFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionDeliveryOptionResultSuccessFragmentProjection<SubscriptionDeliveryOptionResultProjection<PARENT, ROOT>, ROOT> onSubscriptionDeliveryOptionResultSuccess(
      ) {
    SubscriptionDeliveryOptionResultSuccessFragmentProjection<SubscriptionDeliveryOptionResultProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionDeliveryOptionResultSuccessFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
