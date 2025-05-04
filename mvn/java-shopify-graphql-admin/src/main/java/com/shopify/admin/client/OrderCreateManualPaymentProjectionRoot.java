package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCreateManualPaymentProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCreateManualPaymentProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderCreateManualPaymentPayload"));
  }

  public OrderCreateManualPaymentProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderProjection<OrderCreateManualPaymentProjectionRoot<PARENT, ROOT>, OrderCreateManualPaymentProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<OrderCreateManualPaymentProjectionRoot<PARENT, ROOT>, OrderCreateManualPaymentProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public OrderCreateManualPaymentOrderCreateManualPaymentErrorProjection<OrderCreateManualPaymentProjectionRoot<PARENT, ROOT>, OrderCreateManualPaymentProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderCreateManualPaymentOrderCreateManualPaymentErrorProjection<OrderCreateManualPaymentProjectionRoot<PARENT, ROOT>, OrderCreateManualPaymentProjectionRoot<PARENT, ROOT>> projection = new OrderCreateManualPaymentOrderCreateManualPaymentErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
