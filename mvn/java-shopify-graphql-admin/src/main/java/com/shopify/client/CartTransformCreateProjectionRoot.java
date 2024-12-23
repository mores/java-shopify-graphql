package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartTransformCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartTransformCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CartTransformCreatePayload"));
  }

  public CartTransformCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartTransformProjection<CartTransformCreateProjectionRoot<PARENT, ROOT>, CartTransformCreateProjectionRoot<PARENT, ROOT>> cartTransform(
      ) {
    CartTransformProjection<CartTransformCreateProjectionRoot<PARENT, ROOT>, CartTransformCreateProjectionRoot<PARENT, ROOT>> projection = new CartTransformProjection<>(this, this);    
    getFields().put("cartTransform", projection);
    return projection;
  }

  public CartTransformCreateUserErrorProjection<CartTransformCreateProjectionRoot<PARENT, ROOT>, CartTransformCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartTransformCreateUserErrorProjection<CartTransformCreateProjectionRoot<PARENT, ROOT>, CartTransformCreateProjectionRoot<PARENT, ROOT>> projection = new CartTransformCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
