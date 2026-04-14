package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartCloneProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartCloneProjectionRoot() {
    super(null, null, java.util.Optional.of("CartClonePayload"));
  }

  public CartCloneProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartCloneProjectionRoot<PARENT, ROOT>, CartCloneProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartCloneProjectionRoot<PARENT, ROOT>, CartCloneProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartCloneProjectionRoot<PARENT, ROOT>, CartCloneProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartCloneProjectionRoot<PARENT, ROOT>, CartCloneProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartCloneProjectionRoot<PARENT, ROOT>, CartCloneProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartCloneProjectionRoot<PARENT, ROOT>, CartCloneProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
