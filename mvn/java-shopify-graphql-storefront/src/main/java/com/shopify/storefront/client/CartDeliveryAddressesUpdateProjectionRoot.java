package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartDeliveryAddressesUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDeliveryAddressesUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CartDeliveryAddressesUpdatePayload"));
  }

  public CartDeliveryAddressesUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartDeliveryAddressesUpdateProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesUpdateProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartDeliveryAddressesUpdateProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartDeliveryAddressesUpdateProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartDeliveryAddressesUpdateProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartDeliveryAddressesUpdateProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesUpdateProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartDeliveryAddressesUpdateProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
