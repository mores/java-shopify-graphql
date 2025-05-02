package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartDeliveryAddressesRemoveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDeliveryAddressesRemoveProjectionRoot() {
    super(null, null, java.util.Optional.of("CartDeliveryAddressesRemovePayload"));
  }

  public CartDeliveryAddressesRemoveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartDeliveryAddressesRemoveProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesRemoveProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartDeliveryAddressesRemoveProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesRemoveProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartDeliveryAddressesRemoveProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesRemoveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartDeliveryAddressesRemoveProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesRemoveProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartDeliveryAddressesRemoveProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesRemoveProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartDeliveryAddressesRemoveProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesRemoveProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
