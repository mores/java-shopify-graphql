package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartRemovePersonalDataProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartRemovePersonalDataProjectionRoot() {
    super(null, null, java.util.Optional.of("CartRemovePersonalDataPayload"));
  }

  public CartRemovePersonalDataProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartRemovePersonalDataProjectionRoot<PARENT, ROOT>, CartRemovePersonalDataProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartRemovePersonalDataProjectionRoot<PARENT, ROOT>, CartRemovePersonalDataProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartRemovePersonalDataProjectionRoot<PARENT, ROOT>, CartRemovePersonalDataProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartRemovePersonalDataProjectionRoot<PARENT, ROOT>, CartRemovePersonalDataProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartRemovePersonalDataProjectionRoot<PARENT, ROOT>, CartRemovePersonalDataProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartRemovePersonalDataProjectionRoot<PARENT, ROOT>, CartRemovePersonalDataProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
