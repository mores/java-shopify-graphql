package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCreateMandatePaymentUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCreateMandatePaymentUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderCreateMandatePaymentUserError"));
  }

  public OrderCreateMandatePaymentUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderCreateMandatePaymentUserErrorCodeProjection<OrderCreateMandatePaymentUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     OrderCreateMandatePaymentUserErrorCodeProjection<OrderCreateMandatePaymentUserErrorProjection<PARENT, ROOT>, ROOT> projection = new OrderCreateMandatePaymentUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public OrderCreateMandatePaymentUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public OrderCreateMandatePaymentUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
