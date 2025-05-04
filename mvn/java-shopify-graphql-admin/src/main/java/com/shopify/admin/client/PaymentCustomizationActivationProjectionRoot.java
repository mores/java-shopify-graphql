package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentCustomizationActivationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentCustomizationActivationProjectionRoot() {
    super(null, null, java.util.Optional.of("PaymentCustomizationActivationPayload"));
  }

  public PaymentCustomizationActivationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentCustomizationErrorProjection<PaymentCustomizationActivationProjectionRoot<PARENT, ROOT>, PaymentCustomizationActivationProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PaymentCustomizationErrorProjection<PaymentCustomizationActivationProjectionRoot<PARENT, ROOT>, PaymentCustomizationActivationProjectionRoot<PARENT, ROOT>> projection = new PaymentCustomizationErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public PaymentCustomizationActivationProjectionRoot<PARENT, ROOT> ids() {
    getFields().put("ids", null);
    return this;
  }
}
