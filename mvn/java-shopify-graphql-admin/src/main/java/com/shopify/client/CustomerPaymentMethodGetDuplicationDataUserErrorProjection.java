package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodGetDuplicationDataUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodGetDuplicationDataUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerPaymentMethodGetDuplicationDataUserError"));
  }

  public CustomerPaymentMethodGetDuplicationDataUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentMethodGetDuplicationDataUserErrorCodeProjection<CustomerPaymentMethodGetDuplicationDataUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CustomerPaymentMethodGetDuplicationDataUserErrorCodeProjection<CustomerPaymentMethodGetDuplicationDataUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodGetDuplicationDataUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CustomerPaymentMethodGetDuplicationDataUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CustomerPaymentMethodGetDuplicationDataUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
