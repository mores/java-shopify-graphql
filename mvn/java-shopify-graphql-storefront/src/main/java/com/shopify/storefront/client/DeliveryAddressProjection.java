package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeliveryAddressProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryAddressProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryAddress"));
  }

  public DeliveryAddressProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressFragmentProjection<DeliveryAddressProjection<PARENT, ROOT>, ROOT> onMailingAddress(
      ) {
    MailingAddressFragmentProjection<DeliveryAddressProjection<PARENT, ROOT>, ROOT> fragment = new MailingAddressFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
