package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromisePromiseParticipantPromiseParticipantOwnerProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromisePromiseParticipantPromiseParticipantOwnerProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryPromisePromiseParticipantPromiseParticipantOwner"));
  }

  public DeliveryPromisePromiseParticipantPromiseParticipantOwnerProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantFragmentProjection<DeliveryPromisePromiseParticipantPromiseParticipantOwnerProjection<PARENT, ROOT>, ROOT> onProductVariant(
      ) {
    ProductVariantFragmentProjection<DeliveryPromisePromiseParticipantPromiseParticipantOwnerProjection<PARENT, ROOT>, ROOT> fragment = new ProductVariantFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
