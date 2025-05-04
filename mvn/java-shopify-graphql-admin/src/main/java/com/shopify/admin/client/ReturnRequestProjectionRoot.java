package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnRequestProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnRequestProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnRequestPayload"));
  }

  public ReturnRequestProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnProjection<ReturnRequestProjectionRoot<PARENT, ROOT>, ReturnRequestProjectionRoot<PARENT, ROOT>> _return(
      ) {
    ReturnProjection<ReturnRequestProjectionRoot<PARENT, ROOT>, ReturnRequestProjectionRoot<PARENT, ROOT>> projection = new ReturnProjection<>(this, this);    
    getFields().put("return", projection);
    return projection;
  }

  public ReturnUserErrorProjection<ReturnRequestProjectionRoot<PARENT, ROOT>, ReturnRequestProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<ReturnRequestProjectionRoot<PARENT, ROOT>, ReturnRequestProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
