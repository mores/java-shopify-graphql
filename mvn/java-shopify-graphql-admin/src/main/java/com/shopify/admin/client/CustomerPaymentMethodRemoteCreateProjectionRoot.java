package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodRemoteCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodRemoteCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerPaymentMethodRemoteCreatePayload"));
  }

  public CustomerPaymentMethodRemoteCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentMethodProjection<CustomerPaymentMethodRemoteCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodRemoteCreateProjectionRoot<PARENT, ROOT>> customerPaymentMethod(
      ) {
    CustomerPaymentMethodProjection<CustomerPaymentMethodRemoteCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodRemoteCreateProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodProjection<>(this, this);    
    getFields().put("customerPaymentMethod", projection);
    return projection;
  }

  public CustomerPaymentMethodRemoteUserErrorProjection<CustomerPaymentMethodRemoteCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodRemoteCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerPaymentMethodRemoteUserErrorProjection<CustomerPaymentMethodRemoteCreateProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodRemoteCreateProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodRemoteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
