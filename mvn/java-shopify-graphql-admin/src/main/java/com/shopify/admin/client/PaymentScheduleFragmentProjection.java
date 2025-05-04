package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class PaymentScheduleFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public PaymentScheduleFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentSchedule"));
  }

  public PaymentScheduleFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<PaymentScheduleFragmentProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<PaymentScheduleFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public PaymentTermsProjection<PaymentScheduleFragmentProjection<PARENT, ROOT>, ROOT> paymentTerms(
      ) {
     PaymentTermsProjection<PaymentScheduleFragmentProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsProjection<>(this, getRoot());
     getFields().put("paymentTerms", projection);
     return projection;
  }

  public PaymentScheduleFragmentProjection<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public PaymentScheduleFragmentProjection<PARENT, ROOT> dueAt() {
    getFields().put("dueAt", null);
    return this;
  }

  public PaymentScheduleFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PaymentScheduleFragmentProjection<PARENT, ROOT> issuedAt() {
    getFields().put("issuedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on PaymentSchedule {");
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
