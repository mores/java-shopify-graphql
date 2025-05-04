package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryPromiseParticipantOwnerProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryPromiseParticipantOwnerProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryPromiseParticipantOwner"));
  }

  public DeliveryPromiseParticipantOwnerProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ProductVariantFragmentProjection<DeliveryPromiseParticipantOwnerProjection<PARENT, ROOT>, ROOT> onProductVariant(
      ) {
    ProductVariantFragmentProjection<DeliveryPromiseParticipantOwnerProjection<PARENT, ROOT>, ROOT> fragment = new ProductVariantFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
