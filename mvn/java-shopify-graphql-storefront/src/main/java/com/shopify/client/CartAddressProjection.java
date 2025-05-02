package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartAddressProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartAddressProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartAddress"));
  }

  public CartAddressProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartDeliveryAddressFragmentProjection<CartAddressProjection<PARENT, ROOT>, ROOT> onCartDeliveryAddress(
      ) {
    CartDeliveryAddressFragmentProjection<CartAddressProjection<PARENT, ROOT>, ROOT> fragment = new CartDeliveryAddressFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
