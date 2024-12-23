package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class PaymentTermsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PaymentTermsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PaymentTerms"));
  }

  public PaymentTermsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderProjection<PaymentTermsProjection<PARENT, ROOT>, ROOT> draftOrder() {
     DraftOrderProjection<PaymentTermsProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderProjection<>(this, getRoot());
     getFields().put("draftOrder", projection);
     return projection;
  }

  public OrderProjection<PaymentTermsProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<PaymentTermsProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public PaymentScheduleConnectionProjection<PaymentTermsProjection<PARENT, ROOT>, ROOT> paymentSchedules(
      ) {
     PaymentScheduleConnectionProjection<PaymentTermsProjection<PARENT, ROOT>, ROOT> projection = new PaymentScheduleConnectionProjection<>(this, getRoot());
     getFields().put("paymentSchedules", projection);
     return projection;
  }

  public PaymentScheduleConnectionProjection<PaymentTermsProjection<PARENT, ROOT>, ROOT> paymentSchedules(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    PaymentScheduleConnectionProjection<PaymentTermsProjection<PARENT, ROOT>, ROOT> projection = new PaymentScheduleConnectionProjection<>(this, getRoot());    
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

  public PaymentTermsTypeProjection<PaymentTermsProjection<PARENT, ROOT>, ROOT> paymentTermsType() {
     PaymentTermsTypeProjection<PaymentTermsProjection<PARENT, ROOT>, ROOT> projection = new PaymentTermsTypeProjection<>(this, getRoot());
     getFields().put("paymentTermsType", projection);
     return projection;
  }

  public PaymentTermsProjection<PARENT, ROOT> dueInDays() {
    getFields().put("dueInDays", null);
    return this;
  }

  public PaymentTermsProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public PaymentTermsProjection<PARENT, ROOT> overdue() {
    getFields().put("overdue", null);
    return this;
  }

  public PaymentTermsProjection<PARENT, ROOT> paymentTermsName() {
    getFields().put("paymentTermsName", null);
    return this;
  }

  public PaymentTermsProjection<PARENT, ROOT> translatedName() {
    getFields().put("translatedName", null);
    return this;
  }
}
