package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.RefundDutyInput;
import com.shopify.admin.types.RefundShippingInput;
import com.shopify.admin.types.ReturnRefundLineItemInput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ReturnProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnProjectionRoot() {
    super(null, null, java.util.Optional.of("Return"));
  }

  public ReturnProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnDeclineProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> decline(
      ) {
    ReturnDeclineProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ReturnDeclineProjection<>(this, this);    
    getFields().put("decline", projection);
    return projection;
  }

  public ExchangeLineItemConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> exchangeLineItems(
      ) {
    ExchangeLineItemConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ExchangeLineItemConnectionProjection<>(this, this);    
    getFields().put("exchangeLineItems", projection);
    return projection;
  }

  public ExchangeLineItemConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> exchangeLineItems(
      Boolean includeRemovedItems, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ExchangeLineItemConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ExchangeLineItemConnectionProjection<>(this, this);    
    getFields().put("exchangeLineItems", projection);
    getInputArguments().computeIfAbsent("exchangeLineItems", k -> new ArrayList<>());                      
    InputArgument includeRemovedItemsArg = new InputArgument("includeRemovedItems", includeRemovedItems);
    getInputArguments().get("exchangeLineItems").add(includeRemovedItemsArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("exchangeLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("exchangeLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("exchangeLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("exchangeLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("exchangeLineItems").add(reverseArg);
    return projection;
  }

  public OrderProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public RefundConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> refunds(
      ) {
    RefundConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new RefundConnectionProjection<>(this, this);    
    getFields().put("refunds", projection);
    return projection;
  }

  public RefundConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> refunds(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    RefundConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new RefundConnectionProjection<>(this, this);    
    getFields().put("refunds", projection);
    getInputArguments().computeIfAbsent("refunds", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("refunds").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("refunds").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("refunds").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("refunds").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("refunds").add(reverseArg);
    return projection;
  }

  public ReturnLineItemTypeConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> returnLineItems(
      ) {
    ReturnLineItemTypeConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ReturnLineItemTypeConnectionProjection<>(this, this);    
    getFields().put("returnLineItems", projection);
    return projection;
  }

  public ReturnLineItemTypeConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> returnLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReturnLineItemTypeConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ReturnLineItemTypeConnectionProjection<>(this, this);    
    getFields().put("returnLineItems", projection);
    getInputArguments().computeIfAbsent("returnLineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("returnLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("returnLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("returnLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("returnLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("returnLineItems").add(reverseArg);
    return projection;
  }

  public ReturnShippingFeeProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> returnShippingFees(
      ) {
    ReturnShippingFeeProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ReturnShippingFeeProjection<>(this, this);    
    getFields().put("returnShippingFees", projection);
    return projection;
  }

  public ReverseFulfillmentOrderConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> reverseFulfillmentOrders(
      ) {
    ReverseFulfillmentOrderConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ReverseFulfillmentOrderConnectionProjection<>(this, this);    
    getFields().put("reverseFulfillmentOrders", projection);
    return projection;
  }

  public ReverseFulfillmentOrderConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> reverseFulfillmentOrders(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReverseFulfillmentOrderConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ReverseFulfillmentOrderConnectionProjection<>(this, this);    
    getFields().put("reverseFulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("reverseFulfillmentOrders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("reverseFulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("reverseFulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("reverseFulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("reverseFulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("reverseFulfillmentOrders").add(reverseArg);
    return projection;
  }

  public ReturnStatusProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> status(
      ) {
    ReturnStatusProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ReturnStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public SuggestedReturnRefundProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> suggestedRefund(
      ) {
    SuggestedReturnRefundProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new SuggestedReturnRefundProjection<>(this, this);    
    getFields().put("suggestedRefund", projection);
    return projection;
  }

  public SuggestedReturnRefundProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> suggestedRefund(
      List<ReturnRefundLineItemInput> returnRefundLineItems, RefundShippingInput refundShipping,
      List<RefundDutyInput> refundDuties) {
    SuggestedReturnRefundProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new SuggestedReturnRefundProjection<>(this, this);    
    getFields().put("suggestedRefund", projection);
    getInputArguments().computeIfAbsent("suggestedRefund", k -> new ArrayList<>());                      
    InputArgument returnRefundLineItemsArg = new InputArgument("returnRefundLineItems", returnRefundLineItems);
    getInputArguments().get("suggestedRefund").add(returnRefundLineItemsArg);
    InputArgument refundShippingArg = new InputArgument("refundShipping", refundShipping);
    getInputArguments().get("suggestedRefund").add(refundShippingArg);
    InputArgument refundDutiesArg = new InputArgument("refundDuties", refundDuties);
    getInputArguments().get("suggestedRefund").add(refundDutiesArg);
    return projection;
  }

  public ReturnProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReturnProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ReturnProjectionRoot<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }
}
