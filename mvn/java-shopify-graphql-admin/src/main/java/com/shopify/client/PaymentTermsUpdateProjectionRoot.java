package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentTermsUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentTermsUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("PaymentTermsUpdatePayload"));
  }

  public PaymentTermsUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentTermsProjection<PaymentTermsUpdateProjectionRoot<PARENT, ROOT>, PaymentTermsUpdateProjectionRoot<PARENT, ROOT>> paymentTerms(
      ) {
    PaymentTermsProjection<PaymentTermsUpdateProjectionRoot<PARENT, ROOT>, PaymentTermsUpdateProjectionRoot<PARENT, ROOT>> projection = new PaymentTermsProjection<>(this, this);    
    getFields().put("paymentTerms", projection);
    return projection;
  }

  public PaymentTermsUpdateUserErrorProjection<PaymentTermsUpdateProjectionRoot<PARENT, ROOT>, PaymentTermsUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    PaymentTermsUpdateUserErrorProjection<PaymentTermsUpdateProjectionRoot<PARENT, ROOT>, PaymentTermsUpdateProjectionRoot<PARENT, ROOT>> projection = new PaymentTermsUpdateUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
