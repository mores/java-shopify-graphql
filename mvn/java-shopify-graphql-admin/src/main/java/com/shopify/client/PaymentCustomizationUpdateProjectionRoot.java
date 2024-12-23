package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentCustomizationUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentCustomizationUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("PaymentCustomizationUpdatePayload"));
  }

  public PaymentCustomizationUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentCustomizationProjection<PaymentCustomizationUpdateProjectionRoot<PARENT, ROOT>, PaymentCustomizationUpdateProjectionRoot<PARENT, ROOT>> paymentCustomization(
      ) {
    PaymentCustomizationProjection<PaymentCustomizationUpdateProjectionRoot<PARENT, ROOT>, PaymentCustomizationUpdateProjectionRoot<PARENT, ROOT>> projection = new PaymentCustomizationProjection<>(this, this);    
    getFields().put("paymentCustomization", projection);
    return projection;
  }

  public PaymentCustomizationErrorProjection<PaymentCustomizationUpdateProjectionRoot<PARENT, ROOT>, PaymentCustomizationUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PaymentCustomizationErrorProjection<PaymentCustomizationUpdateProjectionRoot<PARENT, ROOT>, PaymentCustomizationUpdateProjectionRoot<PARENT, ROOT>> projection = new PaymentCustomizationErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
