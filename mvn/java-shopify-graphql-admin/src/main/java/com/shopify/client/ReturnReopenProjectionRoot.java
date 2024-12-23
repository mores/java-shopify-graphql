package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnReopenProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnReopenProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnReopenPayload"));
  }

  public ReturnReopenProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnProjection<ReturnReopenProjectionRoot<PARENT, ROOT>, ReturnReopenProjectionRoot<PARENT, ROOT>> _return(
      ) {
    ReturnProjection<ReturnReopenProjectionRoot<PARENT, ROOT>, ReturnReopenProjectionRoot<PARENT, ROOT>> projection = new ReturnProjection<>(this, this);    
    getFields().put("return", projection);
    return projection;
  }

  public ReturnUserErrorProjection<ReturnReopenProjectionRoot<PARENT, ROOT>, ReturnReopenProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<ReturnReopenProjectionRoot<PARENT, ROOT>, ReturnReopenProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
