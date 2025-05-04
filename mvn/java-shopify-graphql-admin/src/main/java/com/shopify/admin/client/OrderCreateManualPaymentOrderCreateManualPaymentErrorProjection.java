package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCreateManualPaymentOrderCreateManualPaymentErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCreateManualPaymentOrderCreateManualPaymentErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderCreateManualPaymentOrderCreateManualPaymentError"));
  }

  public OrderCreateManualPaymentOrderCreateManualPaymentErrorProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public OrderCreateManualPaymentOrderCreateManualPaymentErrorCodeProjection<OrderCreateManualPaymentOrderCreateManualPaymentErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OrderCreateManualPaymentOrderCreateManualPaymentErrorCodeProjection<OrderCreateManualPaymentOrderCreateManualPaymentErrorProjection<PARENT, ROOT>, ROOT> projection = new OrderCreateManualPaymentOrderCreateManualPaymentErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OrderCreateManualPaymentOrderCreateManualPaymentErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public OrderCreateManualPaymentOrderCreateManualPaymentErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
