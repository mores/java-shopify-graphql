package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodGetUpdateUrlUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodGetUpdateUrlUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerPaymentMethodGetUpdateUrlUserError"));
  }

  public CustomerPaymentMethodGetUpdateUrlUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentMethodGetUpdateUrlUserErrorCodeProjection<CustomerPaymentMethodGetUpdateUrlUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CustomerPaymentMethodGetUpdateUrlUserErrorCodeProjection<CustomerPaymentMethodGetUpdateUrlUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodGetUpdateUrlUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CustomerPaymentMethodGetUpdateUrlUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CustomerPaymentMethodGetUpdateUrlUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
