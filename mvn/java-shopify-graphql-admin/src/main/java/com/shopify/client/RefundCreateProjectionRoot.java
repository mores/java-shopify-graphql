package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RefundCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RefundCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("RefundCreatePayload"));
  }

  public RefundCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderProjection<RefundCreateProjectionRoot<PARENT, ROOT>, RefundCreateProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<RefundCreateProjectionRoot<PARENT, ROOT>, RefundCreateProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public RefundProjection<RefundCreateProjectionRoot<PARENT, ROOT>, RefundCreateProjectionRoot<PARENT, ROOT>> refund(
      ) {
    RefundProjection<RefundCreateProjectionRoot<PARENT, ROOT>, RefundCreateProjectionRoot<PARENT, ROOT>> projection = new RefundProjection<>(this, this);    
    getFields().put("refund", projection);
    return projection;
  }

  public UserErrorProjection<RefundCreateProjectionRoot<PARENT, ROOT>, RefundCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<RefundCreateProjectionRoot<PARENT, ROOT>, RefundCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
