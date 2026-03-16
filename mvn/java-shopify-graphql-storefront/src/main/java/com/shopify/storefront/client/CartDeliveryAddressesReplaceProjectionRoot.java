package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartDeliveryAddressesReplaceProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDeliveryAddressesReplaceProjectionRoot() {
    super(null, null, java.util.Optional.of("CartDeliveryAddressesReplacePayload"));
  }

  public CartDeliveryAddressesReplaceProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartDeliveryAddressesReplaceProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesReplaceProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartDeliveryAddressesReplaceProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesReplaceProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartDeliveryAddressesReplaceProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesReplaceProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartDeliveryAddressesReplaceProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesReplaceProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartDeliveryAddressesReplaceProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesReplaceProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartDeliveryAddressesReplaceProjectionRoot<PARENT, ROOT>, CartDeliveryAddressesReplaceProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
