package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionDeliveryMethodProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionDeliveryMethodProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionDeliveryMethod"));
  }

  public SubscriptionDeliveryMethodProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionDeliveryMethodLocalDeliveryFragmentProjection<SubscriptionDeliveryMethodProjection<PARENT, ROOT>, ROOT> onSubscriptionDeliveryMethodLocalDelivery(
      ) {
    SubscriptionDeliveryMethodLocalDeliveryFragmentProjection<SubscriptionDeliveryMethodProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionDeliveryMethodLocalDeliveryFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionDeliveryMethodPickupFragmentProjection<SubscriptionDeliveryMethodProjection<PARENT, ROOT>, ROOT> onSubscriptionDeliveryMethodPickup(
      ) {
    SubscriptionDeliveryMethodPickupFragmentProjection<SubscriptionDeliveryMethodProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionDeliveryMethodPickupFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionDeliveryMethodShippingFragmentProjection<SubscriptionDeliveryMethodProjection<PARENT, ROOT>, ROOT> onSubscriptionDeliveryMethodShipping(
      ) {
    SubscriptionDeliveryMethodShippingFragmentProjection<SubscriptionDeliveryMethodProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionDeliveryMethodShippingFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
