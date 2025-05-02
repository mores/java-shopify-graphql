package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartBillingAddressUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartBillingAddressUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CartBillingAddressUpdatePayload"));
  }

  public CartBillingAddressUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartBillingAddressUpdateProjectionRoot<PARENT, ROOT>, CartBillingAddressUpdateProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartBillingAddressUpdateProjectionRoot<PARENT, ROOT>, CartBillingAddressUpdateProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartBillingAddressUpdateProjectionRoot<PARENT, ROOT>, CartBillingAddressUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartBillingAddressUpdateProjectionRoot<PARENT, ROOT>, CartBillingAddressUpdateProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartBillingAddressUpdateProjectionRoot<PARENT, ROOT>, CartBillingAddressUpdateProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartBillingAddressUpdateProjectionRoot<PARENT, ROOT>, CartBillingAddressUpdateProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
