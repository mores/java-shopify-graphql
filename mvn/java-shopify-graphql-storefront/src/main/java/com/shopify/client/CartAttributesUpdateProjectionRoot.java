package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartAttributesUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartAttributesUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CartAttributesUpdatePayload"));
  }

  public CartAttributesUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartAttributesUpdateProjectionRoot<PARENT, ROOT>, CartAttributesUpdateProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartAttributesUpdateProjectionRoot<PARENT, ROOT>, CartAttributesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartAttributesUpdateProjectionRoot<PARENT, ROOT>, CartAttributesUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartAttributesUpdateProjectionRoot<PARENT, ROOT>, CartAttributesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartAttributesUpdateProjectionRoot<PARENT, ROOT>, CartAttributesUpdateProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartAttributesUpdateProjectionRoot<PARENT, ROOT>, CartAttributesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
