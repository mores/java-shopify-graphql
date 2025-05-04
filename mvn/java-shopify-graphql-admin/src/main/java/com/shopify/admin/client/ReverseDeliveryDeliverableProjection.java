package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseDeliveryDeliverableProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseDeliveryDeliverableProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseDeliveryDeliverable"));
  }

  public ReverseDeliveryDeliverableProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseDeliveryShippingDeliverableFragmentProjection<ReverseDeliveryDeliverableProjection<PARENT, ROOT>, ROOT> onReverseDeliveryShippingDeliverable(
      ) {
    ReverseDeliveryShippingDeliverableFragmentProjection<ReverseDeliveryDeliverableProjection<PARENT, ROOT>, ROOT> fragment = new ReverseDeliveryShippingDeliverableFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
