package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartTransformDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartTransformDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CartTransformDeletePayload"));
  }

  public CartTransformDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartTransformDeleteUserErrorProjection<CartTransformDeleteProjectionRoot<PARENT, ROOT>, CartTransformDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartTransformDeleteUserErrorProjection<CartTransformDeleteProjectionRoot<PARENT, ROOT>, CartTransformDeleteProjectionRoot<PARENT, ROOT>> projection = new CartTransformDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartTransformDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
