package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentScheduleCaptureProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentScheduleCaptureProjectionRoot() {
    super(null, null, java.util.Optional.of("PaymentScheduleCapturePayload"));
  }

  public PaymentScheduleCaptureProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<PaymentScheduleCaptureProjectionRoot<PARENT, ROOT>, PaymentScheduleCaptureProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<PaymentScheduleCaptureProjectionRoot<PARENT, ROOT>, PaymentScheduleCaptureProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public OrderCreateMandatePaymentJobResultProjection<PaymentScheduleCaptureProjectionRoot<PARENT, ROOT>, PaymentScheduleCaptureProjectionRoot<PARENT, ROOT>> jobResult(
      ) {
    OrderCreateMandatePaymentJobResultProjection<PaymentScheduleCaptureProjectionRoot<PARENT, ROOT>, PaymentScheduleCaptureProjectionRoot<PARENT, ROOT>> projection = new OrderCreateMandatePaymentJobResultProjection<>(this, this);    
    getFields().put("jobResult", projection);
    return projection;
  }

  public PaymentScheduleCaptureUserErrorProjection<PaymentScheduleCaptureProjectionRoot<PARENT, ROOT>, PaymentScheduleCaptureProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PaymentScheduleCaptureUserErrorProjection<PaymentScheduleCaptureProjectionRoot<PARENT, ROOT>, PaymentScheduleCaptureProjectionRoot<PARENT, ROOT>> projection = new PaymentScheduleCaptureUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public PaymentScheduleCaptureProjectionRoot<PARENT, ROOT> paymentReferenceId() {
    getFields().put("paymentReferenceId", null);
    return this;
  }
}
