package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CartCompletionSuccessFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CartCompletionSuccessFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CartCompletionSuccess"));
  }

  public CartCompletionSuccessFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartCompletionSuccessFragmentProjection<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public CartCompletionSuccessFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CartCompletionSuccessFragmentProjection<PARENT, ROOT> orderId() {
    getFields().put("orderId", null);
    return this;
  }

  public CartCompletionSuccessFragmentProjection<PARENT, ROOT> orderUrl() {
    getFields().put("orderUrl", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CartCompletionSuccess {");
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
