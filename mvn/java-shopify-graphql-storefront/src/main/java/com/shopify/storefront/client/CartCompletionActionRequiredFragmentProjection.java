package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CartCompletionActionRequiredFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CartCompletionActionRequiredFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartCompletionActionRequired"));
  }

  public CartCompletionActionRequiredFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartCompletionActionProjection<CartCompletionActionRequiredFragmentProjection<PARENT, ROOT>, ROOT> action(
      ) {
     CartCompletionActionProjection<CartCompletionActionRequiredFragmentProjection<PARENT, ROOT>, ROOT> projection = new CartCompletionActionProjection<>(this, getRoot());
     getFields().put("action", projection);
     return projection;
  }

  public CartCompletionActionRequiredFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CartCompletionActionRequired {");
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
