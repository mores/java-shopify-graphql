package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class RefundProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RefundProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Refund"));
  }

  public RefundProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RefundDutyProjection<RefundProjection<PARENT, ROOT>, ROOT> duties() {
     RefundDutyProjection<RefundProjection<PARENT, ROOT>, ROOT> projection = new RefundDutyProjection<>(this, getRoot());
     getFields().put("duties", projection);
     return projection;
  }

  public OrderProjection<RefundProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<RefundProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public OrderAdjustmentConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> orderAdjustments(
      ) {
     OrderAdjustmentConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> projection = new OrderAdjustmentConnectionProjection<>(this, getRoot());
     getFields().put("orderAdjustments", projection);
     return projection;
  }

  public OrderAdjustmentConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> orderAdjustments(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderAdjustmentConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> projection = new OrderAdjustmentConnectionProjection<>(this, getRoot());    
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

  public RefundLineItemConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> refundLineItems(
      ) {
     RefundLineItemConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> projection = new RefundLineItemConnectionProjection<>(this, getRoot());
     getFields().put("refundLineItems", projection);
     return projection;
  }

  public RefundLineItemConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> refundLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    RefundLineItemConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> projection = new RefundLineItemConnectionProjection<>(this, getRoot());    
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

  public RefundShippingLineConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> refundShippingLines(
      ) {
     RefundShippingLineConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> projection = new RefundShippingLineConnectionProjection<>(this, getRoot());
     getFields().put("refundShippingLines", projection);
     return projection;
  }

  public RefundShippingLineConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> refundShippingLines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    RefundShippingLineConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> projection = new RefundShippingLineConnectionProjection<>(this, getRoot());    
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

  public ReturnProjection<RefundProjection<PARENT, ROOT>, ROOT> _return() {
     ReturnProjection<RefundProjection<PARENT, ROOT>, ROOT> projection = new ReturnProjection<>(this, getRoot());
     getFields().put("return", projection);
     return projection;
  }

  public StaffMemberProjection<RefundProjection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<RefundProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public MoneyV2Projection<RefundProjection<PARENT, ROOT>, ROOT> totalRefunded() {
     MoneyV2Projection<RefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalRefunded", projection);
     return projection;
  }

  public MoneyBagProjection<RefundProjection<PARENT, ROOT>, ROOT> totalRefundedSet() {
     MoneyBagProjection<RefundProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalRefundedSet", projection);
     return projection;
  }

  public OrderTransactionConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> transactions() {
     OrderTransactionConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionConnectionProjection<>(this, getRoot());
     getFields().put("transactions", projection);
     return projection;
  }

  public OrderTransactionConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> transactions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderTransactionConnectionProjection<RefundProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionConnectionProjection<>(this, getRoot());    
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

  public RefundProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public RefundProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RefundProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public RefundProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public RefundProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
