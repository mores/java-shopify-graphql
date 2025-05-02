package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartGiftCardCodesRemoveProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartGiftCardCodesRemoveProjectionRoot() {
    super(null, null, java.util.Optional.of("CartGiftCardCodesRemovePayload"));
  }

  public CartGiftCardCodesRemoveProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartGiftCardCodesRemoveProjectionRoot<PARENT, ROOT>, CartGiftCardCodesRemoveProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartGiftCardCodesRemoveProjectionRoot<PARENT, ROOT>, CartGiftCardCodesRemoveProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartGiftCardCodesRemoveProjectionRoot<PARENT, ROOT>, CartGiftCardCodesRemoveProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartGiftCardCodesRemoveProjectionRoot<PARENT, ROOT>, CartGiftCardCodesRemoveProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartGiftCardCodesRemoveProjectionRoot<PARENT, ROOT>, CartGiftCardCodesRemoveProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartGiftCardCodesRemoveProjectionRoot<PARENT, ROOT>, CartGiftCardCodesRemoveProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
