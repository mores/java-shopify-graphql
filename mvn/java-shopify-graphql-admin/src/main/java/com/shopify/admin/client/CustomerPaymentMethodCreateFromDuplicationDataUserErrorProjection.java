package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodCreateFromDuplicationDataUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodCreateFromDuplicationDataUserErrorProjection(PARENT parent,
      ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerPaymentMethodCreateFromDuplicationDataUserError"));
  }

  public CustomerPaymentMethodCreateFromDuplicationDataUserErrorProjection<PARENT, ROOT> __typename(
      ) {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerPaymentMethodCreateFromDuplicationDataUserErrorCodeProjection<CustomerPaymentMethodCreateFromDuplicationDataUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     CustomerPaymentMethodCreateFromDuplicationDataUserErrorCodeProjection<CustomerPaymentMethodCreateFromDuplicationDataUserErrorProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodCreateFromDuplicationDataUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public CustomerPaymentMethodCreateFromDuplicationDataUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public CustomerPaymentMethodCreateFromDuplicationDataUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
