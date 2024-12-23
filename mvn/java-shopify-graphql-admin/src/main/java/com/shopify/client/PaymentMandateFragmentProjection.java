package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class PaymentMandateFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public PaymentMandateFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentMandate"));
  }

  public PaymentMandateFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PaymentInstrumentProjection<PaymentMandateFragmentProjection<PARENT, ROOT>, ROOT> paymentInstrument(
      ) {
     PaymentInstrumentProjection<PaymentMandateFragmentProjection<PARENT, ROOT>, ROOT> projection = new PaymentInstrumentProjection<>(this, getRoot());
     getFields().put("paymentInstrument", projection);
     return projection;
  }

  public PaymentMandateFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on PaymentMandate {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
