package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentTermsDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentTermsDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("PaymentTermsDeletePayload"));
  }

  public PaymentTermsDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentTermsDeleteUserErrorProjection<PaymentTermsDeleteProjectionRoot<PARENT, ROOT>, PaymentTermsDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PaymentTermsDeleteUserErrorProjection<PaymentTermsDeleteProjectionRoot<PARENT, ROOT>, PaymentTermsDeleteProjectionRoot<PARENT, ROOT>> projection = new PaymentTermsDeleteUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public PaymentTermsDeleteProjectionRoot<PARENT, ROOT> deletedId() {
    getFields().put("deletedId", null);
    return this;
  }
}
