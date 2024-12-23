package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryRateProviderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryRateProviderProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryRateProvider"));
  }

  public DeliveryRateProviderProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryParticipantFragmentProjection<DeliveryRateProviderProjection<PARENT, ROOT>, ROOT> onDeliveryParticipant(
      ) {
    DeliveryParticipantFragmentProjection<DeliveryRateProviderProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryParticipantFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public DeliveryRateDefinitionFragmentProjection<DeliveryRateProviderProjection<PARENT, ROOT>, ROOT> onDeliveryRateDefinition(
      ) {
    DeliveryRateDefinitionFragmentProjection<DeliveryRateProviderProjection<PARENT, ROOT>, ROOT> fragment = new DeliveryRateDefinitionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
