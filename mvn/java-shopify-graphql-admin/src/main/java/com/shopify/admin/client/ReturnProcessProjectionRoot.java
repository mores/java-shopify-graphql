package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnProcessProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnProcessProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnProcessPayload"));
  }

  public ReturnProcessProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnProjection<ReturnProcessProjectionRoot<PARENT, ROOT>, ReturnProcessProjectionRoot<PARENT, ROOT>> _return(
      ) {
    ReturnProjection<ReturnProcessProjectionRoot<PARENT, ROOT>, ReturnProcessProjectionRoot<PARENT, ROOT>> projection = new ReturnProjection<>(this, this);    
    getFields().put("return", projection);
    return projection;
  }

  public ReturnUserErrorProjection<ReturnProcessProjectionRoot<PARENT, ROOT>, ReturnProcessProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<ReturnProcessProjectionRoot<PARENT, ROOT>, ReturnProcessProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
