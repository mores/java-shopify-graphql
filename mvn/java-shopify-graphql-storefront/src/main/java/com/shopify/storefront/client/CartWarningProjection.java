package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartWarningProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartWarningProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartWarning"));
  }

  public CartWarningProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartWarningCodeProjection<CartWarningProjection<PARENT, ROOT>, ROOT> code() {
     CartWarningCodeProjection<CartWarningProjection<PARENT, ROOT>, ROOT> projection = new CartWarningCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CartWarningProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  public CartWarningProjection<PARENT, ROOT> target() {
    getFields().put("target", null);
    return this;
  }
}
