package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CartStatusNotReadyFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CartStatusNotReadyFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartStatusNotReady"));
  }

  public CartStatusNotReadyFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartStatusNotReadyFragmentProjection<PARENT, ROOT>, ROOT> cart() {
     CartProjection<CartStatusNotReadyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartProjection<>(this, getRoot());
     getFields().put("cart", projection);
     return projection;
  }

  public CartOperationErrorProjection<CartStatusNotReadyFragmentProjection<PARENT, ROOT>, ROOT> errors(
      ) {
     CartOperationErrorProjection<CartStatusNotReadyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartOperationErrorProjection<>(this, getRoot());
     getFields().put("errors", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CartStatusNotReady {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
