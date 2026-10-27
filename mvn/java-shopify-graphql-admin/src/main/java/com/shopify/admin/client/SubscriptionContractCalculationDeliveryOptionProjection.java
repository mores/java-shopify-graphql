package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractCalculationDeliveryOptionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractCalculationDeliveryOptionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractCalculationDeliveryOption"));
  }

  public SubscriptionContractCalculationDeliveryOptionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractCalculationLocalDeliveryOptionFragmentProjection<SubscriptionContractCalculationDeliveryOptionProjection<PARENT, ROOT>, ROOT> onSubscriptionContractCalculationLocalDeliveryOption(
      ) {
    SubscriptionContractCalculationLocalDeliveryOptionFragmentProjection<SubscriptionContractCalculationDeliveryOptionProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionContractCalculationLocalDeliveryOptionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionContractCalculationPickupOptionFragmentProjection<SubscriptionContractCalculationDeliveryOptionProjection<PARENT, ROOT>, ROOT> onSubscriptionContractCalculationPickupOption(
      ) {
    SubscriptionContractCalculationPickupOptionFragmentProjection<SubscriptionContractCalculationDeliveryOptionProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionContractCalculationPickupOptionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public SubscriptionContractCalculationShippingOptionFragmentProjection<SubscriptionContractCalculationDeliveryOptionProjection<PARENT, ROOT>, ROOT> onSubscriptionContractCalculationShippingOption(
      ) {
    SubscriptionContractCalculationShippingOptionFragmentProjection<SubscriptionContractCalculationDeliveryOptionProjection<PARENT, ROOT>, ROOT> fragment = new SubscriptionContractCalculationShippingOptionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
