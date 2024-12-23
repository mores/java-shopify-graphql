package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentTermsUpdateUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentTermsUpdateUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentTermsUpdateUserError"));
  }

  public PaymentTermsUpdateUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentTermsUpdateUserErrorCodeProjection<PaymentTermsUpdateUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     PaymentTermsUpdateUserErrorCodeProjection<PaymentTermsUpdateUserErrorProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsUpdateUserErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public PaymentTermsUpdateUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public PaymentTermsUpdateUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
