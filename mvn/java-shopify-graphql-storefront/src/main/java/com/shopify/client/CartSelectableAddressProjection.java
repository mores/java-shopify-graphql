package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartSelectableAddressProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartSelectableAddressProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartSelectableAddress"));
  }

  public CartSelectableAddressProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartAddressProjection<CartSelectableAddressProjection<PARENT, ROOT>, ROOT> address() {
     CartAddressProjection<CartSelectableAddressProjection<PARENT, ROOT>, ROOT> projection = new CartAddressProjection<>(this, getRoot());
     getFields().put("address", projection);
     return projection;
  }

  public CartSelectableAddressProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CartSelectableAddressProjection<PARENT, ROOT> oneTimeUse() {
    getFields().put("oneTimeUse", null);
    return this;
  }

  public CartSelectableAddressProjection<PARENT, ROOT> selected() {
    getFields().put("selected", null);
    return this;
  }
}
