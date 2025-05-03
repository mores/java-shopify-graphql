package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartSubmitForCompletionProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartSubmitForCompletionProjectionRoot() {
    super(null, null, java.util.Optional.of("CartSubmitForCompletionPayload"));
  }

  public CartSubmitForCompletionProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartSubmitForCompletionResultProjection<CartSubmitForCompletionProjectionRoot<PARENT, ROOT>, CartSubmitForCompletionProjectionRoot<PARENT, ROOT>> result(
      ) {
    CartSubmitForCompletionResultProjection<CartSubmitForCompletionProjectionRoot<PARENT, ROOT>, CartSubmitForCompletionProjectionRoot<PARENT, ROOT>> projection = new CartSubmitForCompletionResultProjection<>(this, this);    
    getFields().put("result", projection);
    return projection;
  }

  public CartUserErrorProjection<CartSubmitForCompletionProjectionRoot<PARENT, ROOT>, CartSubmitForCompletionProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartSubmitForCompletionProjectionRoot<PARENT, ROOT>, CartSubmitForCompletionProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
