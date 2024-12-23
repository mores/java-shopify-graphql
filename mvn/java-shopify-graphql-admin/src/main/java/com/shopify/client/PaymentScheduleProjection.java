package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PaymentScheduleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentScheduleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentSchedule"));
  }

  public PaymentScheduleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<PaymentScheduleProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<PaymentScheduleProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public PaymentTermsProjection<PaymentScheduleProjection<PARENT, ROOT>, ROOT> paymentTerms() {
     PaymentTermsProjection<PaymentScheduleProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsProjection<>(this, getRoot());
     getFields().put("paymentTerms", projection);
     return projection;
  }

  public PaymentScheduleProjection<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public PaymentScheduleProjection<PARENT, ROOT> dueAt() {
    getFields().put("dueAt", null);
    return this;
  }

  public PaymentScheduleProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PaymentScheduleProjection<PARENT, ROOT> issuedAt() {
    getFields().put("issuedAt", null);
    return this;
  }
}
