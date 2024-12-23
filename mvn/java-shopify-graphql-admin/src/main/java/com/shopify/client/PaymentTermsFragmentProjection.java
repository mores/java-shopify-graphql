package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class PaymentTermsFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public PaymentTermsFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentTerms"));
  }

  public PaymentTermsFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderProjection<PaymentTermsFragmentProjection<PARENT, ROOT>, ROOT> draftOrder() {
     DraftOrderProjection<PaymentTermsFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderProjection<>(this, getRoot());
     getFields().put("draftOrder", projection);
     return projection;
  }

  public OrderProjection<PaymentTermsFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<PaymentTermsFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public PaymentScheduleConnectionProjection<PaymentTermsFragmentProjection<PARENT, ROOT>, ROOT> paymentSchedules(
      ) {
     PaymentScheduleConnectionProjection<PaymentTermsFragmentProjection<PARENT, ROOT>, ROOT> projection = new PaymentScheduleConnectionProjection<>(this, getRoot());
     getFields().put("paymentSchedules", projection);
     return projection;
  }

  public PaymentScheduleConnectionProjection<PaymentTermsFragmentProjection<PARENT, ROOT>, ROOT> paymentSchedules(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    PaymentScheduleConnectionProjection<PaymentTermsFragmentProjection<PARENT, ROOT>, ROOT> projection = new PaymentScheduleConnectionProjection<>(this, getRoot());    
    getFields().put("paymentSchedules", projection);
    getInputArguments().computeIfAbsent("paymentSchedules", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("paymentSchedules").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("paymentSchedules").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("paymentSchedules").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("paymentSchedules").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("paymentSchedules").add(reverseArg);
    return projection;
  }

  public PaymentTermsTypeProjection<PaymentTermsFragmentProjection<PARENT, ROOT>, ROOT> paymentTermsType(
      ) {
     PaymentTermsTypeProjection<PaymentTermsFragmentProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsTypeProjection<>(this, getRoot());
     getFields().put("paymentTermsType", projection);
     return projection;
  }

  public PaymentTermsFragmentProjection<PARENT, ROOT> dueInDays() {
    getFields().put("dueInDays", null);
    return this;
  }

  public PaymentTermsFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PaymentTermsFragmentProjection<PARENT, ROOT> overdue() {
    getFields().put("overdue", null);
    return this;
  }

  public PaymentTermsFragmentProjection<PARENT, ROOT> paymentTermsName() {
    getFields().put("paymentTermsName", null);
    return this;
  }

  public PaymentTermsFragmentProjection<PARENT, ROOT> translatedName() {
    getFields().put("translatedName", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on PaymentTerms {");
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
