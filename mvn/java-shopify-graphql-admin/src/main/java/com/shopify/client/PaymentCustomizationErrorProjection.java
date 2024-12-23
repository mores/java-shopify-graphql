package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentCustomizationErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentCustomizationErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentCustomizationError"));
  }

  public PaymentCustomizationErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentCustomizationErrorCodeProjection<PaymentCustomizationErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PaymentCustomizationErrorCodeProjection<PaymentCustomizationErrorProjection<PARENT, ROOT>, ROOT> projection = new PaymentCustomizationErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PaymentCustomizationErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PaymentCustomizationErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
