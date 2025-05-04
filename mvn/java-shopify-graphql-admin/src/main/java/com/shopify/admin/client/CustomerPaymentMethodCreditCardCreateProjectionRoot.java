package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodCreditCardCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodCreditCardCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerPaymentMethodCreditCardCreatePayload"));
  }

  public CustomerPaymentMethodCreditCardCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentMethodProjection<CustomerPaymentMethodCreditCardCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodCreditCardCreateProjectionRoot<PARENT, ROOT>> customerPaymentMethod(
      ) {
    CustomerPaymentMethodProjection<CustomerPaymentMethodCreditCardCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodCreditCardCreateProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodProjection<>(this, this);    
    getFields().put("customerPaymentMethod", projection);
    return projection;
  }

  public UserErrorProjection<CustomerPaymentMethodCreditCardCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodCreditCardCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerPaymentMethodCreditCardCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodCreditCardCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CustomerPaymentMethodCreditCardCreateProjectionRoot<PARENT, ROOT> processing() {
    getFields().put("processing", null);
    return this;
  }
}
