package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartPrepareForCompletionProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartPrepareForCompletionProjectionRoot() {
    super(null, null, java.util.Optional.of("CartPrepareForCompletionPayload"));
  }

  public CartPrepareForCompletionProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartPrepareForCompletionResultProjection<CartPrepareForCompletionProjectionRoot<PARENT, ROOT>, CartPrepareForCompletionProjectionRoot<PARENT, ROOT>> result(
      ) {
    CartPrepareForCompletionResultProjection<CartPrepareForCompletionProjectionRoot<PARENT, ROOT>, CartPrepareForCompletionProjectionRoot<PARENT, ROOT>> projection = new CartPrepareForCompletionResultProjection<>(this, this);    
    getFields().put("result", projection);
    return projection;
  }

  public CartUserErrorProjection<CartPrepareForCompletionProjectionRoot<PARENT, ROOT>, CartPrepareForCompletionProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartPrepareForCompletionProjectionRoot<PARENT, ROOT>, CartPrepareForCompletionProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
