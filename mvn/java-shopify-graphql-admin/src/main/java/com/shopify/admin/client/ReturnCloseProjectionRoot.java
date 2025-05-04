package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnCloseProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnCloseProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnClosePayload"));
  }

  public ReturnCloseProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnProjection<ReturnCloseProjectionRoot<PARENT, ROOT>, ReturnCloseProjectionRoot<PARENT, ROOT>> _return(
      ) {
    ReturnProjection<ReturnCloseProjectionRoot<PARENT, ROOT>, ReturnCloseProjectionRoot<PARENT, ROOT>> projection = new ReturnProjection<>(this, this);    
    getFields().put("return", projection);
    return projection;
  }

  public ReturnUserErrorProjection<ReturnCloseProjectionRoot<PARENT, ROOT>, ReturnCloseProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<ReturnCloseProjectionRoot<PARENT, ROOT>, ReturnCloseProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
