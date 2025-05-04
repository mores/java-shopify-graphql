package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentMandateProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentMandateProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentMandate"));
  }

  public PaymentMandateProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentInstrumentProjection<PaymentMandateProjection<PARENT, ROOT>, ROOT> paymentInstrument(
      ) {
     PaymentInstrumentProjection<PaymentMandateProjection<PARENT, ROOT>, ROOT> projection = new PaymentInstrumentProjection<>(this, getRoot());
     getFields().put("paymentInstrument", projection);
     return projection;
  }

  public PaymentMandateProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
