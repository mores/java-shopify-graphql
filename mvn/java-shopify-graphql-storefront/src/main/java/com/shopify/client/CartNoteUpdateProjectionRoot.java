package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CartNoteUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CartNoteUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CartNoteUpdatePayload"));
  }

  public CartNoteUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CartProjection<CartNoteUpdateProjectionRoot<PARENT, ROOT>, CartNoteUpdateProjectionRoot<PARENT, ROOT>> cart(
      ) {
    CartProjection<CartNoteUpdateProjectionRoot<PARENT, ROOT>, CartNoteUpdateProjectionRoot<PARENT, ROOT>> projection = new CartProjection<>(this, this);    
    getFields().put("cart", projection);
    return projection;
  }

  public CartUserErrorProjection<CartNoteUpdateProjectionRoot<PARENT, ROOT>, CartNoteUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CartUserErrorProjection<CartNoteUpdateProjectionRoot<PARENT, ROOT>, CartNoteUpdateProjectionRoot<PARENT, ROOT>> projection = new CartUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CartWarningProjection<CartNoteUpdateProjectionRoot<PARENT, ROOT>, CartNoteUpdateProjectionRoot<PARENT, ROOT>> warnings(
      ) {
    CartWarningProjection<CartNoteUpdateProjectionRoot<PARENT, ROOT>, CartNoteUpdateProjectionRoot<PARENT, ROOT>> projection = new CartWarningProjection<>(this, this);    
    getFields().put("warnings", projection);
    return projection;
  }
}
