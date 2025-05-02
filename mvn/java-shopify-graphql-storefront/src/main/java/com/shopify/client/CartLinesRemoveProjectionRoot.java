package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartLinesRemoveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartLinesRemoveProjectionRoot() {
    super(null, null, java.util.Optional.of("CartLinesRemovePayload"));
  }

  public CartLinesRemoveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartLinesRemoveProjectionRoot<PARENT, ROOT>, CartLinesRemoveProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartLinesRemoveProjectionRoot<PARENT, ROOT>, CartLinesRemoveProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartLinesRemoveProjectionRoot<PARENT, ROOT>, CartLinesRemoveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartLinesRemoveProjectionRoot<PARENT, ROOT>, CartLinesRemoveProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartLinesRemoveProjectionRoot<PARENT, ROOT>, CartLinesRemoveProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartLinesRemoveProjectionRoot<PARENT, ROOT>, CartLinesRemoveProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
