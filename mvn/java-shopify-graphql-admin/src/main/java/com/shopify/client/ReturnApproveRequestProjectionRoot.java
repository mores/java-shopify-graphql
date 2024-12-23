package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnApproveRequestProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnApproveRequestProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnApproveRequestPayload"));
  }

  public ReturnApproveRequestProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnProjection<ReturnApproveRequestProjectionRoot<PARENT, ROOT>, ReturnApproveRequestProjectionRoot<PARENT, ROOT>> _return(
      ) {
    ReturnProjection<ReturnApproveRequestProjectionRoot<PARENT, ROOT>, ReturnApproveRequestProjectionRoot<PARENT, ROOT>> projection = new ReturnProjection<>(this, this);    
    getFields().put("return", projection);
    return projection;
  }

  public ReturnUserErrorProjection<ReturnApproveRequestProjectionRoot<PARENT, ROOT>, ReturnApproveRequestProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<ReturnApproveRequestProjectionRoot<PARENT, ROOT>, ReturnApproveRequestProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
