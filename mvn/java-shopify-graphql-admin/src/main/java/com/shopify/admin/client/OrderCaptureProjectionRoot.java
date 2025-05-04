package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCaptureProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCaptureProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderCapturePayload"));
  }

  public OrderCaptureProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderTransactionProjection<OrderCaptureProjectionRoot<PARENT, ROOT>, OrderCaptureProjectionRoot<PARENT, ROOT>> transaction(
      ) {
    OrderTransactionProjection<OrderCaptureProjectionRoot<PARENT, ROOT>, OrderCaptureProjectionRoot<PARENT, ROOT>> projection = new OrderTransactionProjection<>(this, this);    
    getFields().put("transaction", projection);
    return projection;
  }

  public UserErrorProjection<OrderCaptureProjectionRoot<PARENT, ROOT>, OrderCaptureProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<OrderCaptureProjectionRoot<PARENT, ROOT>, OrderCaptureProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
