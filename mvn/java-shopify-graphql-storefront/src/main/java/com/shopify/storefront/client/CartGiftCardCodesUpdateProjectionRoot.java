package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartGiftCardCodesUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartGiftCardCodesUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CartGiftCardCodesUpdatePayload"));
  }

  public CartGiftCardCodesUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartGiftCardCodesUpdateProjectionRoot<PARENT, ROOT>, CartGiftCardCodesUpdateProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartGiftCardCodesUpdateProjectionRoot<PARENT, ROOT>, CartGiftCardCodesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartGiftCardCodesUpdateProjectionRoot<PARENT, ROOT>, CartGiftCardCodesUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartGiftCardCodesUpdateProjectionRoot<PARENT, ROOT>, CartGiftCardCodesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartGiftCardCodesUpdateProjectionRoot<PARENT, ROOT>, CartGiftCardCodesUpdateProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartGiftCardCodesUpdateProjectionRoot<PARENT, ROOT>, CartGiftCardCodesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
