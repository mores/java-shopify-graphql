package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentTermsDeleteUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentTermsDeleteUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentTermsDeleteUserError"));
  }

  public PaymentTermsDeleteUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentTermsDeleteUserErrorCodeProjection<PaymentTermsDeleteUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PaymentTermsDeleteUserErrorCodeProjection<PaymentTermsDeleteUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsDeleteUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PaymentTermsDeleteUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PaymentTermsDeleteUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
