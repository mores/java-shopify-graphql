package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDeliveryOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDeliveryOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDeliveryOption"));
  }

  public SubscriptionDeliveryOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionLocalDeliveryOptionFragmentProjection<SubscriptionDeliveryOptionProjection<PARENT, ROOT>, ROOT> onSubscriptionLocalDeliveryOption(
      ) {
    SubscriptionLocalDeliveryOptionFragmentProjection<SubscriptionDeliveryOptionProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionLocalDeliveryOptionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionPickupOptionFragmentProjection<SubscriptionDeliveryOptionProjection<PARENT, ROOT>, ROOT> onSubscriptionPickupOption(
      ) {
    SubscriptionPickupOptionFragmentProjection<SubscriptionDeliveryOptionProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionPickupOptionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionShippingOptionFragmentProjection<SubscriptionDeliveryOptionProjection<PARENT, ROOT>, ROOT> onSubscriptionShippingOption(
      ) {
    SubscriptionShippingOptionFragmentProjection<SubscriptionDeliveryOptionProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionShippingOptionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
