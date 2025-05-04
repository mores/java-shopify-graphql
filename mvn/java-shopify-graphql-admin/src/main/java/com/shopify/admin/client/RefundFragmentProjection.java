package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class RefundFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public RefundFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Refund"));
  }

  public RefundFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RefundDutyProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> duties() {
     RefundDutyProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new RefundDutyProjection<>(this, getRoot());
     getFields().put("duties", projection);
     return projection;
  }

  public OrderProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public OrderAdjustmentConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> orderAdjustments(
      ) {
     OrderAdjustmentConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderAdjustmentConnectionProjection<>(this, getRoot());
     getFields().put("orderAdjustments", projection);
     return projection;
  }

  public OrderAdjustmentConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> orderAdjustments(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderAdjustmentConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderAdjustmentConnectionProjection<>(this, getRoot());    
    getFields().put("orderAdjustments", projection);
    getInputArguments().computeIfAbsent("orderAdjustments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("orderAdjustments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("orderAdjustments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("orderAdjustments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("orderAdjustments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("orderAdjustments").add(reverseArg);
    return projection;
  }

  public RefundLineItemConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> refundLineItems(
      ) {
     RefundLineItemConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new RefundLineItemConnectionProjection<>(this, getRoot());
     getFields().put("refundLineItems", projection);
     return projection;
  }

  public RefundLineItemConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> refundLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    RefundLineItemConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new RefundLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("refundLineItems", projection);
    getInputArguments().computeIfAbsent("refundLineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("refundLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("refundLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("refundLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("refundLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("refundLineItems").add(reverseArg);
    return projection;
  }

  public RefundShippingLineConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> refundShippingLines(
      ) {
     RefundShippingLineConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new RefundShippingLineConnectionProjection<>(this, getRoot());
     getFields().put("refundShippingLines", projection);
     return projection;
  }

  public RefundShippingLineConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> refundShippingLines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    RefundShippingLineConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new RefundShippingLineConnectionProjection<>(this, getRoot());    
    getFields().put("refundShippingLines", projection);
    getInputArguments().computeIfAbsent("refundShippingLines", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("refundShippingLines").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("refundShippingLines").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("refundShippingLines").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("refundShippingLines").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("refundShippingLines").add(reverseArg);
    return projection;
  }

  public ReturnProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> _return() {
     ReturnProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReturnProjection<>(this, getRoot());
     getFields().put("return", projection);
     return projection;
  }

  public StaffMemberProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public MoneyV2Projection<RefundFragmentProjection<PARENT, ROOT>, ROOT> totalRefunded() {
     MoneyV2Projection<RefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalRefunded", projection);
     return projection;
  }

  public MoneyBagProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> totalRefundedSet() {
     MoneyBagProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalRefundedSet", projection);
     return projection;
  }

  public OrderTransactionConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> transactions(
      ) {
     OrderTransactionConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionConnectionProjection<>(this, getRoot());
     getFields().put("transactions", projection);
     return projection;
  }

  public OrderTransactionConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> transactions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderTransactionConnectionProjection<RefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionConnectionProjection<>(this, getRoot());    
    getFields().put("transactions", projection);
    getInputArguments().computeIfAbsent("transactions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("transactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("transactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("transactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("transactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("transactions").add(reverseArg);
    return projection;
  }

  public RefundFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public RefundFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RefundFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public RefundFragmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public RefundFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Refund {");
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
