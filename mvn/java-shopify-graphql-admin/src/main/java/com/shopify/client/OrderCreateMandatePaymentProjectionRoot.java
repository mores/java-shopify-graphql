package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderCreateMandatePaymentProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderCreateMandatePaymentProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderCreateMandatePaymentPayload"));
  }

  public OrderCreateMandatePaymentProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<OrderCreateMandatePaymentProjectionRoot<PARENT, ROOT>, OrderCreateMandatePaymentProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<OrderCreateMandatePaymentProjectionRoot<PARENT, ROOT>, OrderCreateMandatePaymentProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public OrderCreateMandatePaymentUserErrorProjection<OrderCreateMandatePaymentProjectionRoot<PARENT, ROOT>, OrderCreateMandatePaymentProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    OrderCreateMandatePaymentUserErrorProjection<OrderCreateMandatePaymentProjectionRoot<PARENT, ROOT>, OrderCreateMandatePaymentProjectionRoot<PARENT, ROOT>> projection = new OrderCreateMandatePaymentUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public OrderCreateMandatePaymentProjectionRoot<PARENT, ROOT> paymentReferenceId() {
    getFields().put("paymentReferenceId", null);
    return this;
  }
}
