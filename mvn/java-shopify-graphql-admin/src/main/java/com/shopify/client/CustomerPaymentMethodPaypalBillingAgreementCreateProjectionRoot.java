package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodPaypalBillingAgreementCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodPaypalBillingAgreementCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerPaymentMethodPaypalBillingAgreementCreatePayload"));
  }

  public CustomerPaymentMethodPaypalBillingAgreementCreateProjectionRoot<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentMethodProjection<CustomerPaymentMethodPaypalBillingAgreementCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodPaypalBillingAgreementCreateProjectionRoot<PARENT, ROOT>> customerPaymentMethod(
      ) {
    CustomerPaymentMethodProjection<CustomerPaymentMethodPaypalBillingAgreementCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodPaypalBillingAgreementCreateProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodProjection<>(this, this);    
    getFields().put("customerPaymentMethod", projection);
    return projection;
  }

  public CustomerPaymentMethodUserErrorProjection<CustomerPaymentMethodPaypalBillingAgreementCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodPaypalBillingAgreementCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerPaymentMethodUserErrorProjection<CustomerPaymentMethodPaypalBillingAgreementCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodPaypalBillingAgreementCreateProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
