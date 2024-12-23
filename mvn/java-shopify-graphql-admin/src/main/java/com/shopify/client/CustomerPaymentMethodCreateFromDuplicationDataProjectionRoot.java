package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodCreateFromDuplicationDataProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodCreateFromDuplicationDataProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerPaymentMethodCreateFromDuplicationDataPayload"));
  }

  public CustomerPaymentMethodCreateFromDuplicationDataProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentMethodProjection<CustomerPaymentMethodCreateFromDuplicationDataProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodCreateFromDuplicationDataProjectionRoot<PARENT, ROOT>> customerPaymentMethod(
      ) {
    CustomerPaymentMethodProjection<CustomerPaymentMethodCreateFromDuplicationDataProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodCreateFromDuplicationDataProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodProjection<>(this, this);    
    getFields().put("customerPaymentMethod", projection);
    return projection;
  }

  public CustomerPaymentMethodCreateFromDuplicationDataUserErrorProjection<CustomerPaymentMethodCreateFromDuplicationDataProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodCreateFromDuplicationDataProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerPaymentMethodCreateFromDuplicationDataUserErrorProjection<CustomerPaymentMethodCreateFromDuplicationDataProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodCreateFromDuplicationDataProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodCreateFromDuplicationDataUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
