package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodGetUpdateUrlProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodGetUpdateUrlProjectionRoot() {
    super(null, null, java.util.Optional.of("CustomerPaymentMethodGetUpdateUrlPayload"));
  }

  public CustomerPaymentMethodGetUpdateUrlProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentMethodGetUpdateUrlUserErrorProjection<CustomerPaymentMethodGetUpdateUrlProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodGetUpdateUrlProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    CustomerPaymentMethodGetUpdateUrlUserErrorProjection<CustomerPaymentMethodGetUpdateUrlProjectionRoot<PARENT, ROOT>, CustomerPaymentMethodGetUpdateUrlProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodGetUpdateUrlUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CustomerPaymentMethodGetUpdateUrlProjectionRoot<PARENT, ROOT> updatePaymentMethodUrl() {
    getFields().put("updatePaymentMethodUrl", null);
    return this;
  }
}
