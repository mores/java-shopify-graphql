package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentScheduleCaptureUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentScheduleCaptureUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentScheduleCaptureUserError"));
  }

  public PaymentScheduleCaptureUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentScheduleCaptureUserErrorCodeProjection<PaymentScheduleCaptureUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PaymentScheduleCaptureUserErrorCodeProjection<PaymentScheduleCaptureUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PaymentScheduleCaptureUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PaymentScheduleCaptureUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PaymentScheduleCaptureUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
