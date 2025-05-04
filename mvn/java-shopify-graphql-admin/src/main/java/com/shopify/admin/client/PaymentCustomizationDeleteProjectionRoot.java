package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentCustomizationDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentCustomizationDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("PaymentCustomizationDeletePayload"));
  }

  public PaymentCustomizationDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentCustomizationErrorProjection<PaymentCustomizationDeleteProjectionRoot<PARENT, ROOT>, PaymentCustomizationDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PaymentCustomizationErrorProjection<PaymentCustomizationDeleteProjectionRoot<PARENT, ROOT>, PaymentCustomizationDeleteProjectionRoot<PARENT, ROOT>> projection = new PaymentCustomizationErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public PaymentCustomizationDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
