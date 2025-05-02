package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CartCompletionFailedFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CartCompletionFailedFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartCompletionFailed"));
  }

  public CartCompletionFailedFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompletionErrorProjection<CartCompletionFailedFragmentProjection<PARENT, ROOT>, ROOT> errors(
      ) {
     CompletionErrorProjection<CartCompletionFailedFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompletionErrorProjection<>(this, getRoot());
     getFields().put("errors", projection);
     return projection;
  }

  public CartCompletionFailedFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CartCompletionFailed {");
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
