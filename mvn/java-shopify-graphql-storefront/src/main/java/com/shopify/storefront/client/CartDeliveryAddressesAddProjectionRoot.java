package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartDeliveryAddressesAddProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDeliveryAddressesAddProjectionRoot() {
    super(null, null, java.util.Optional.of("CartDeliveryAddressesAddPayload"));
  }

  public CartDeliveryAddressesAddProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartDeliveryAddressesAddProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesAddProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartDeliveryAddressesAddProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesAddProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartDeliveryAddressesAddProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesAddProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartDeliveryAddressesAddProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesAddProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartDeliveryAddressesAddProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesAddProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartDeliveryAddressesAddProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesAddProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
