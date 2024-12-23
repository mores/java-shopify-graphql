package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodCreditCardUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodCreditCardUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerPaymentMethodCreditCardUpdatePayload"));
  }

  public CustomerPaymentMethodCreditCardUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentMethodProjection<CustomerPaymentMethodCreditCardUpdateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodCreditCardUpdateProjectionRoot<PARENT, ROOT>> customerPaymentMethod(
      ) {
    CustomerPaymentMethodProjection<CustomerPaymentMethodCreditCardUpdateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodCreditCardUpdateProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodProjection<>(this, this);    
    getFields().put("customerPaymentMethod", projection);
    return projection;
  }

  public UserErrorProjection<CustomerPaymentMethodCreditCardUpdateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodCreditCardUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerPaymentMethodCreditCardUpdateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodCreditCardUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CustomerPaymentMethodCreditCardUpdateProjectionRoot<PARENT, ROOT> processing() {
    getFields().put("processing", null);
    return this;
  }
}
