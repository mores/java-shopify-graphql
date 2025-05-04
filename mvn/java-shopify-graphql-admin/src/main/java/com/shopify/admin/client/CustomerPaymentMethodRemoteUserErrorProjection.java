package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodRemoteUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodRemoteUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerPaymentMethodRemoteUserError"));
  }

  public CustomerPaymentMethodRemoteUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentMethodRemoteUserErrorCodeProjection<CustomerPaymentMethodRemoteUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CustomerPaymentMethodRemoteUserErrorCodeProjection<CustomerPaymentMethodRemoteUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodRemoteUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CustomerPaymentMethodRemoteUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CustomerPaymentMethodRemoteUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
