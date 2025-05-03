package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartDiscountCodesUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartDiscountCodesUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CartDiscountCodesUpdatePayload"));
  }

  public CartDiscountCodesUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartDiscountCodesUpdateProjectionRoot<PARENT, ROOT>, CartDiscountCodesUpdateProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartDiscountCodesUpdateProjectionRoot<PARENT, ROOT>, CartDiscountCodesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartDiscountCodesUpdateProjectionRoot<PARENT, ROOT>, CartDiscountCodesUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartDiscountCodesUpdateProjectionRoot<PARENT, ROOT>, CartDiscountCodesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartDiscountCodesUpdateProjectionRoot<PARENT, ROOT>, CartDiscountCodesUpdateProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartDiscountCodesUpdateProjectionRoot<PARENT, ROOT>, CartDiscountCodesUpdateProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
