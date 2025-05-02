package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartLinesUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartLinesUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CartLinesUpdatePayload"));
  }

  public CartLinesUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartLinesUpdateProjectionRoot<PARENT, ROOT>, CartLinesUpdateProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartLinesUpdateProjectionRoot<PARENT, ROOT>, CartLinesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartLinesUpdateProjectionRoot<PARENT, ROOT>, CartLinesUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartLinesUpdateProjectionRoot<PARENT, ROOT>, CartLinesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartLinesUpdateProjectionRoot<PARENT, ROOT>, CartLinesUpdateProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartLinesUpdateProjectionRoot<PARENT, ROOT>, CartLinesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
