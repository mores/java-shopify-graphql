package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentTermsCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentTermsCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("PaymentTermsCreatePayload"));
  }

  public PaymentTermsCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentTermsProjection<PaymentTermsCreateProjectionRoot<PARENT, ROOT>, PaymentTermsCreateProjectionRoot<PARENT, ROOT>> paymentTerms(
      ) {
    PaymentTermsProjection<PaymentTermsCreateProjectionRoot<PARENT, ROOT>, PaymentTermsCreateProjectionRoot<PARENT, ROOT>> projection = new PaymentTermsProjection<>(this, this);    
    getFields().put("paymentTerms", projection);
    return projection;
  }

  public PaymentTermsCreateUserErrorProjection<PaymentTermsCreateProjectionRoot<PARENT, ROOT>, PaymentTermsCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PaymentTermsCreateUserErrorProjection<PaymentTermsCreateProjectionRoot<PARENT, ROOT>, PaymentTermsCreateProjectionRoot<PARENT, ROOT>> projection = new PaymentTermsCreateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
