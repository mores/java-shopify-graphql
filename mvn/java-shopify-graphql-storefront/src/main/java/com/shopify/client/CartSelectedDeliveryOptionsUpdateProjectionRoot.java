package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartSelectedDeliveryOptionsUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartSelectedDeliveryOptionsUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CartSelectedDeliveryOptionsUpdatePayload"));
  }

  public CartSelectedDeliveryOptionsUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartSelectedDeliveryOptionsUpdateProjectionRoot<PARENT, ROOT>, CartSelectedDeliveryOptionsUpdateProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartSelectedDeliveryOptionsUpdateProjectionRoot<PARENT, ROOT>, CartSelectedDeliveryOptionsUpdateProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartSelectedDeliveryOptionsUpdateProjectionRoot<PARENT, ROOT>, CartSelectedDeliveryOptionsUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartSelectedDeliveryOptionsUpdateProjectionRoot<PARENT, ROOT>, CartSelectedDeliveryOptionsUpdateProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartSelectedDeliveryOptionsUpdateProjectionRoot<PARENT, ROOT>, CartSelectedDeliveryOptionsUpdateProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartSelectedDeliveryOptionsUpdateProjectionRoot<PARENT, ROOT>, CartSelectedDeliveryOptionsUpdateProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
