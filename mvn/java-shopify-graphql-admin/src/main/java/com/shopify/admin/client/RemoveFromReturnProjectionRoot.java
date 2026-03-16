package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RemoveFromReturnProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RemoveFromReturnProjectionRoot() {
    super(null, null, java.util.Optional.of("RemoveFromReturnPayload"));
  }

  public RemoveFromReturnProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnProjection<RemoveFromReturnProjectionRoot<PARENT, ROOT>, RemoveFromReturnProjectionRoot<PARENT, ROOT>> _return(
      ) {
    ReturnProjection<RemoveFromReturnProjectionRoot<PARENT, ROOT>, RemoveFromReturnProjectionRoot<PARENT, ROOT>> projection = new ReturnProjection<>(this, this);    
    getFields().put("return", projection);
    return projection;
  }

  public ReturnUserErrorProjection<RemoveFromReturnProjectionRoot<PARENT, ROOT>, RemoveFromReturnProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<RemoveFromReturnProjectionRoot<PARENT, ROOT>, RemoveFromReturnProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
