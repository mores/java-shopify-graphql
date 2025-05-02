package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartMetafieldDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartMetafieldDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("CartMetafieldDeletePayload"));
  }

  public CartMetafieldDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDeleteUserErrorProjection<CartMetafieldDeleteProjectionRoot<PARENT, ROOT>, CartMetafieldDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MetafieldDeleteUserErrorProjection<CartMetafieldDeleteProjectionRoot<PARENT, ROOT>, CartMetafieldDeleteProjectionRoot<PARENT, ROOT>> projection = new MetafieldDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartMetafieldDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
