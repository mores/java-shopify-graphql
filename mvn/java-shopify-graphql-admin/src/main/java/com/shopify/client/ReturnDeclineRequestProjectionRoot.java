package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnDeclineRequestProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnDeclineRequestProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnDeclineRequestPayload"));
  }

  public ReturnDeclineRequestProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnProjection<ReturnDeclineRequestProjectionRoot<PARENT, ROOT>, ReturnDeclineRequestProjectionRoot<PARENT, ROOT>> _return(
      ) {
    ReturnProjection<ReturnDeclineRequestProjectionRoot<PARENT, ROOT>, ReturnDeclineRequestProjectionRoot<PARENT, ROOT>> projection = new ReturnProjection<>(this, this);    
    getFields().put("return", projection);
    return projection;
  }

  public ReturnUserErrorProjection<ReturnDeclineRequestProjectionRoot<PARENT, ROOT>, ReturnDeclineRequestProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<ReturnDeclineRequestProjectionRoot<PARENT, ROOT>, ReturnDeclineRequestProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
