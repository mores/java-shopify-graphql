package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentCustomizationCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentCustomizationCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("PaymentCustomizationCreatePayload"));
  }

  public PaymentCustomizationCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentCustomizationProjection<PaymentCustomizationCreateProjectionRoot<PARENT, ROOT>, PaymentCustomizationCreateProjectionRoot<PARENT, ROOT>> paymentCustomization(
      ) {
    PaymentCustomizationProjection<PaymentCustomizationCreateProjectionRoot<PARENT, ROOT>, PaymentCustomizationCreateProjectionRoot<PARENT, ROOT>> projection = new PaymentCustomizationProjection<>(this, this);    
    getFields().put("paymentCustomization", projection);
    return projection;
  }

  public PaymentCustomizationErrorProjection<PaymentCustomizationCreateProjectionRoot<PARENT, ROOT>, PaymentCustomizationCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PaymentCustomizationErrorProjection<PaymentCustomizationCreateProjectionRoot<PARENT, ROOT>, PaymentCustomizationCreateProjectionRoot<PARENT, ROOT>> projection = new PaymentCustomizationErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
