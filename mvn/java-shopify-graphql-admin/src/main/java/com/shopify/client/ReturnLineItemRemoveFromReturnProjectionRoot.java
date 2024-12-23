package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnLineItemRemoveFromReturnProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnLineItemRemoveFromReturnProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnLineItemRemoveFromReturnPayload"));
  }

  public ReturnLineItemRemoveFromReturnProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnProjection<ReturnLineItemRemoveFromReturnProjectionRoot<PARENT, ROOT>, ReturnLineItemRemoveFromReturnProjectionRoot<PARENT, ROOT>> _return(
      ) {
    ReturnProjection<ReturnLineItemRemoveFromReturnProjectionRoot<PARENT, ROOT>, ReturnLineItemRemoveFromReturnProjectionRoot<PARENT, ROOT>> projection = new ReturnProjection<>(this, this);    
    getFields().put("return", projection);
    return projection;
  }

  public ReturnUserErrorProjection<ReturnLineItemRemoveFromReturnProjectionRoot<PARENT, ROOT>, ReturnLineItemRemoveFromReturnProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<ReturnLineItemRemoveFromReturnProjectionRoot<PARENT, ROOT>, ReturnLineItemRemoveFromReturnProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
