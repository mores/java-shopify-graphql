package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodSendUpdateEmailProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodSendUpdateEmailProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerPaymentMethodSendUpdateEmailPayload"));
  }

  public CustomerPaymentMethodSendUpdateEmailProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerPaymentMethodSendUpdateEmailProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodSendUpdateEmailProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<CustomerPaymentMethodSendUpdateEmailProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodSendUpdateEmailProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public UserErrorProjection<CustomerPaymentMethodSendUpdateEmailProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodSendUpdateEmailProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerPaymentMethodSendUpdateEmailProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodSendUpdateEmailProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
