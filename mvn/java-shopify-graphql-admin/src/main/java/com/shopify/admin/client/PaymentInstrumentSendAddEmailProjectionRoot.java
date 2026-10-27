package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentInstrumentSendAddEmailProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentInstrumentSendAddEmailProjectionRoot() {
    super(null, null, java.util.Optional.of("PaymentInstrumentSendAddEmailPayload"));
  }

  public PaymentInstrumentSendAddEmailProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<PaymentInstrumentSendAddEmailProjectionRoot<PARENT, ROOT>, PaymentInstrumentSendAddEmailProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<PaymentInstrumentSendAddEmailProjectionRoot<PARENT, ROOT>, PaymentInstrumentSendAddEmailProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public UserErrorProjection<PaymentInstrumentSendAddEmailProjectionRoot<PARENT, ROOT>, PaymentInstrumentSendAddEmailProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<PaymentInstrumentSendAddEmailProjectionRoot<PARENT, ROOT>, PaymentInstrumentSendAddEmailProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
