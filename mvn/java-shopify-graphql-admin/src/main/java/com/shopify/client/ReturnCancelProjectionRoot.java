package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnCancelProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnCancelProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnCancelPayload"));
  }

  public ReturnCancelProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnProjection<ReturnCancelProjectionRoot<PARENT, ROOT>, ReturnCancelProjectionRoot<PARENT, ROOT>> _return(
      ) {
    ReturnProjection<ReturnCancelProjectionRoot<PARENT, ROOT>, ReturnCancelProjectionRoot<PARENT, ROOT>> projection = new ReturnProjection<>(this, this);    
    getFields().put("return", projection);
    return projection;
  }

  public ReturnUserErrorProjection<ReturnCancelProjectionRoot<PARENT, ROOT>, ReturnCancelProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<ReturnCancelProjectionRoot<PARENT, ROOT>, ReturnCancelProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
