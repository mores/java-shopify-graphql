package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartUserError"));
  }

  public CartUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartErrorCodeProjection<CartUserErrorProjection<PARENT, ROOT>, ROOT> code() {
     CartErrorCodeProjection<CartUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CartErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CartUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CartUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
