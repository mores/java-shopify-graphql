package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnCreatePayload"));
  }

  public ReturnCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnProjection<ReturnCreateProjectionRoot<PARENT, ROOT>, ReturnCreateProjectionRoot<PARENT, ROOT>> _return(
      ) {
    ReturnProjection<ReturnCreateProjectionRoot<PARENT, ROOT>, ReturnCreateProjectionRoot<PARENT, ROOT>> projection = new ReturnProjection<>(this, this);    
    getFields().put("return", projection);
    return projection;
  }

  public ReturnUserErrorProjection<ReturnCreateProjectionRoot<PARENT, ROOT>, ReturnCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<ReturnCreateProjectionRoot<PARENT, ROOT>, ReturnCreateProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
