package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CartCreatePayload"));
  }

  public CartCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartCreateProjectionRoot<PARENT, ROOT>, CartCreateProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartCreateProjectionRoot<PARENT, ROOT>, CartCreateProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartCreateProjectionRoot<PARENT, ROOT>, CartCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartCreateProjectionRoot<PARENT, ROOT>, CartCreateProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartCreateProjectionRoot<PARENT, ROOT>, CartCreateProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartCreateProjectionRoot<PARENT, ROOT>, CartCreateProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
