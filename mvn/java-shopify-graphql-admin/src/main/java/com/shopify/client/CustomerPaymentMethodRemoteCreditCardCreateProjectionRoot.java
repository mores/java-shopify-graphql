package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodRemoteCreditCardCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodRemoteCreditCardCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerPaymentMethodRemoteCreditCardCreatePayload"));
  }

  public CustomerPaymentMethodRemoteCreditCardCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentMethodProjection<CustomerPaymentMethodRemoteCreditCardCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodRemoteCreditCardCreateProjectionRoot<PARENT, ROOT>> customerPaymentMethod(
      ) {
    CustomerPaymentMethodProjection<CustomerPaymentMethodRemoteCreditCardCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodRemoteCreditCardCreateProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodProjection<>(this, this);    
    getFields().put("customerPaymentMethod", projection);
    return projection;
  }

  public CustomerPaymentMethodUserErrorProjection<CustomerPaymentMethodRemoteCreditCardCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodRemoteCreditCardCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerPaymentMethodUserErrorProjection<CustomerPaymentMethodRemoteCreditCardCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodRemoteCreditCardCreateProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
