package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodPaypalBillingAgreementUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodPaypalBillingAgreementUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerPaymentMethodPaypalBillingAgreementUpdatePayload"));
  }

  public CustomerPaymentMethodPaypalBillingAgreementUpdateProjectionRoot<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentMethodProjection<CustomerPaymentMethodPaypalBillingAgreementUpdateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodPaypalBillingAgreementUpdateProjectionRoot<PARENT, ROOT>> customerPaymentMethod(
      ) {
    CustomerPaymentMethodProjection<CustomerPaymentMethodPaypalBillingAgreementUpdateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodPaypalBillingAgreementUpdateProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodProjection<>(this, this);    
    getFields().put("customerPaymentMethod", projection);
    return projection;
  }

  public CustomerPaymentMethodUserErrorProjection<CustomerPaymentMethodPaypalBillingAgreementUpdateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodPaypalBillingAgreementUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerPaymentMethodUserErrorProjection<CustomerPaymentMethodPaypalBillingAgreementUpdateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodPaypalBillingAgreementUpdateProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
