package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartLinesAddProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartLinesAddProjectionRoot() {
    super(null, null, java.util.Optional.of("CartLinesAddPayload"));
  }

  public CartLinesAddProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartLinesAddProjectionRoot<PARENT, ROOT>, CartLinesAddProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartLinesAddProjectionRoot<PARENT, ROOT>, CartLinesAddProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartLinesAddProjectionRoot<PARENT, ROOT>, CartLinesAddProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartLinesAddProjectionRoot<PARENT, ROOT>, CartLinesAddProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartLinesAddProjectionRoot<PARENT, ROOT>, CartLinesAddProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartLinesAddProjectionRoot<PARENT, ROOT>, CartLinesAddProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
