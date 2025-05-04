package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnRefundProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnRefundProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnRefundPayload"));
  }

  public ReturnRefundProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RefundProjection<ReturnRefundProjectionRoot<PARENT, ROOT>, ReturnRefundProjectionRoot<PARENT, ROOT>> refund(
      ) {
    RefundProjection<ReturnRefundProjectionRoot<PARENT, ROOT>, ReturnRefundProjectionRoot<PARENT, ROOT>> projection = new RefundProjection<>(this, this);    
    getFields().put("refund", projection);
    return projection;
  }

  public ReturnUserErrorProjection<ReturnRefundProjectionRoot<PARENT, ROOT>, ReturnRefundProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    ReturnUserErrorProjection<ReturnRefundProjectionRoot<PARENT, ROOT>, ReturnRefundProjectionRoot<PARENT, ROOT>> projection = new ReturnUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
