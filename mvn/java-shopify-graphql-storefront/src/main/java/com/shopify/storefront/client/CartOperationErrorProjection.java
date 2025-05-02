package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartOperationErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartOperationErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartOperationError"));
  }

  public CartOperationErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartOperationErrorProjection<PARENT, ROOT> code() {
    getFields().put("code", null);
    return this;
  }

  public CartOperationErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
