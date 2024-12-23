package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class RefundProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RefundProjectionRoot() {
    super(null, null, java.util.Optional.of("Refund"));
  }

  public RefundProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RefundDutyProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> duties(
      ) {
    RefundDutyProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> projection = new RefundDutyProjection<>(this, this);    
    getFields().put("duties", projection);
    return projection;
  }

  public OrderProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public OrderAdjustmentConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> orderAdjustments(
      ) {
    OrderAdjustmentConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> projection = new OrderAdjustmentConnectionProjection<>(this, this);    
    getFields().put("orderAdjustments", projection);
    return projection;
  }

  public OrderAdjustmentConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> orderAdjustments(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderAdjustmentConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> projection = new OrderAdjustmentConnectionProjection<>(this, this);    
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

  public RefundLineItemConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> refundLineItems(
      ) {
    RefundLineItemConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> projection = new RefundLineItemConnectionProjection<>(this, this);    
    getFields().put("refundLineItems", projection);
    return projection;
  }

  public RefundLineItemConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> refundLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    RefundLineItemConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> projection = new RefundLineItemConnectionProjection<>(this, this);    
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

  public RefundShippingLineConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> refundShippingLines(
      ) {
    RefundShippingLineConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> projection = new RefundShippingLineConnectionProjection<>(this, this);    
    getFields().put("refundShippingLines", projection);
    return projection;
  }

  public RefundShippingLineConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> refundShippingLines(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    RefundShippingLineConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> projection = new RefundShippingLineConnectionProjection<>(this, this);    
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

  public ReturnProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> _return(
      ) {
    ReturnProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> projection = new ReturnProjection<>(this, this);    
    getFields().put("return", projection);
    return projection;
  }

  public StaffMemberProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> staffMember(
      ) {
    StaffMemberProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("staffMember", projection);
    return projection;
  }

  public MoneyV2Projection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> totalRefunded(
      ) {
    MoneyV2Projection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalRefunded", projection);
    return projection;
  }

  public MoneyBagProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> totalRefundedSet(
      ) {
    MoneyBagProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> projection = new MoneyBagProjection<>(this, this);    
    getFields().put("totalRefundedSet", projection);
    return projection;
  }

  public OrderTransactionConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> transactions(
      ) {
    OrderTransactionConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> projection = new OrderTransactionConnectionProjection<>(this, this);    
    getFields().put("transactions", projection);
    return projection;
  }

  public OrderTransactionConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> transactions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderTransactionConnectionProjection<RefundProjectionRoot<PARENT, ROOT>, RefundProjectionRoot<PARENT, ROOT>> projection = new OrderTransactionConnectionProjection<>(this, this);    
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

  public RefundProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public RefundProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public RefundProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public RefundProjectionRoot<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public RefundProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
