package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartPaymentUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartPaymentUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CartPaymentUpdatePayload"));
  }

  public CartPaymentUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartPaymentUpdateProjectionRoot<PARENT, ROOT>, CartPaymentUpdateProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartPaymentUpdateProjectionRoot<PARENT, ROOT>, CartPaymentUpdateProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartPaymentUpdateProjectionRoot<PARENT, ROOT>, CartPaymentUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartPaymentUpdateProjectionRoot<PARENT, ROOT>, CartPaymentUpdateProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartPaymentUpdateProjectionRoot<PARENT, ROOT>, CartPaymentUpdateProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartPaymentUpdateProjectionRoot<PARENT, ROOT>, CartPaymentUpdateProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
