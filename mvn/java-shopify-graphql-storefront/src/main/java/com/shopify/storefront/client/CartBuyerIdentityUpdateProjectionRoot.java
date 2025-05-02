package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartBuyerIdentityUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartBuyerIdentityUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CartBuyerIdentityUpdatePayload"));
  }

  public CartBuyerIdentityUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartBuyerIdentityUpdateProjectionRoot<PARENT, ROOT>, CartBuyerIdentityUpdateProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartBuyerIdentityUpdateProjectionRoot<PARENT, ROOT>, CartBuyerIdentityUpdateProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartBuyerIdentityUpdateProjectionRoot<PARENT, ROOT>, CartBuyerIdentityUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartBuyerIdentityUpdateProjectionRoot<PARENT, ROOT>, CartBuyerIdentityUpdateProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartBuyerIdentityUpdateProjectionRoot<PARENT, ROOT>, CartBuyerIdentityUpdateProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartBuyerIdentityUpdateProjectionRoot<PARENT, ROOT>, CartBuyerIdentityUpdateProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
