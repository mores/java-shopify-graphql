package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodRevokeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodRevokeProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerPaymentMethodRevokePayload"));
  }

  public CustomerPaymentMethodRevokeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<CustomerPaymentMethodRevokeProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodRevokeProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<CustomerPaymentMethodRevokeProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodRevokeProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CustomerPaymentMethodRevokeProjectionRoot<PARENT, ROOT> revokedCustomerPaymentMethodId() {
    getFields().put("revokedCustomerPaymentMethodId", null);
    return this;
  }
}
