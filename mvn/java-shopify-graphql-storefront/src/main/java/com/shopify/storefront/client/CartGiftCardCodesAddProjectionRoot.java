package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartGiftCardCodesAddProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartGiftCardCodesAddProjectionRoot() {
    super(null, null, java.util.Optional.of("CartGiftCardCodesAddPayload"));
  }

  public CartGiftCardCodesAddProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartGiftCardCodesAddProjectionRoot<PARENT, ROOT>, CartGiftCardCodesAddProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartGiftCardCodesAddProjectionRoot<PARENT, ROOT>, CartGiftCardCodesAddProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartGiftCardCodesAddProjectionRoot<PARENT, ROOT>, CartGiftCardCodesAddProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartGiftCardCodesAddProjectionRoot<PARENT, ROOT>, CartGiftCardCodesAddProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartGiftCardCodesAddProjectionRoot<PARENT, ROOT>, CartGiftCardCodesAddProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartGiftCardCodesAddProjectionRoot<PARENT, ROOT>, CartGiftCardCodesAddProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
