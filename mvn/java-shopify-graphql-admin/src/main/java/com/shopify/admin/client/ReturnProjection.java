package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.RefundDutyInput;
import com.shopify.admin.types.RefundMethodAllocation;
import com.shopify.admin.types.RefundShippingInput;
import com.shopify.admin.types.ReturnRefundLineItemInput;
import com.shopify.admin.types.SuggestedOutcomeExchangeLineItemInput;
import com.shopify.admin.types.SuggestedOutcomeReturnLineItemInput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class ReturnProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Return"));
  }

  public ReturnProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnDeclineProjection<ReturnProjection<PARENT, ROOT>, ROOT> decline() {
     ReturnDeclineProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ReturnDeclineProjection<>(this, getRoot());
     getFields().put("decline", projection);
     return projection;
  }

  public ExchangeLineItemConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> exchangeLineItems(
      ) {
     ExchangeLineItemConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ExchangeLineItemConnectionProjection<>(this, getRoot());
     getFields().put("exchangeLineItems", projection);
     return projection;
  }

  public ExchangeLineItemConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> exchangeLineItems(
      Boolean includeRemovedItems, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    ExchangeLineItemConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ExchangeLineItemConnectionProjection<>(this, getRoot());    
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

  public OrderProjection<ReturnProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public RefundConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> refunds() {
     RefundConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new RefundConnectionProjection<>(this, getRoot());
     getFields().put("refunds", projection);
     return projection;
  }

  public RefundConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> refunds(Integer first,
      String after, Integer last, String before, Boolean reverse) {
    RefundConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new RefundConnectionProjection<>(this, getRoot());    
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

  public ReturnLineItemTypeConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> returnLineItems(
      ) {
     ReturnLineItemTypeConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ReturnLineItemTypeConnectionProjection<>(this, getRoot());
     getFields().put("returnLineItems", projection);
     return projection;
  }

  public ReturnLineItemTypeConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> returnLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReturnLineItemTypeConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ReturnLineItemTypeConnectionProjection<>(this, getRoot());    
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

  public ReturnShippingFeeProjection<ReturnProjection<PARENT, ROOT>, ROOT> returnShippingFees() {
     ReturnShippingFeeProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ReturnShippingFeeProjection<>(this, getRoot());
     getFields().put("returnShippingFees", projection);
     return projection;
  }

  public ReverseFulfillmentOrderConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> reverseFulfillmentOrders(
      ) {
     ReverseFulfillmentOrderConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderConnectionProjection<>(this, getRoot());
     getFields().put("reverseFulfillmentOrders", projection);
     return projection;
  }

  public ReverseFulfillmentOrderConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> reverseFulfillmentOrders(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReverseFulfillmentOrderConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderConnectionProjection<>(this, getRoot());    
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

  public ReturnStatusProjection<ReturnProjection<PARENT, ROOT>, ROOT> status() {
     ReturnStatusProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ReturnStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public SuggestedReturnFinancialOutcomeProjection<ReturnProjection<PARENT, ROOT>, ROOT> suggestedFinancialOutcome(
      ) {
     SuggestedReturnFinancialOutcomeProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new SuggestedReturnFinancialOutcomeProjection<>(this, getRoot());
     getFields().put("suggestedFinancialOutcome", projection);
     return projection;
  }

  public SuggestedReturnFinancialOutcomeProjection<ReturnProjection<PARENT, ROOT>, ROOT> suggestedFinancialOutcome(
      List<SuggestedOutcomeReturnLineItemInput> returnLineItems,
      List<SuggestedOutcomeExchangeLineItemInput> exchangeLineItems,
      RefundShippingInput refundShipping, List<RefundDutyInput> refundDuties,
      RefundMethodAllocation refundMethodAllocation) {
    SuggestedReturnFinancialOutcomeProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new SuggestedReturnFinancialOutcomeProjection<>(this, getRoot());    
    getFields().put("suggestedFinancialOutcome", projection);
    getInputArguments().computeIfAbsent("suggestedFinancialOutcome", k -> new ArrayList<>());                      
    InputArgument returnLineItemsArg = new InputArgument("returnLineItems", returnLineItems);
    getInputArguments().get("suggestedFinancialOutcome").add(returnLineItemsArg);
    InputArgument exchangeLineItemsArg = new InputArgument("exchangeLineItems", exchangeLineItems);
    getInputArguments().get("suggestedFinancialOutcome").add(exchangeLineItemsArg);
    InputArgument refundShippingArg = new InputArgument("refundShipping", refundShipping);
    getInputArguments().get("suggestedFinancialOutcome").add(refundShippingArg);
    InputArgument refundDutiesArg = new InputArgument("refundDuties", refundDuties);
    getInputArguments().get("suggestedFinancialOutcome").add(refundDutiesArg);
    InputArgument refundMethodAllocationArg = new InputArgument("refundMethodAllocation", refundMethodAllocation);
    getInputArguments().get("suggestedFinancialOutcome").add(refundMethodAllocationArg);
    return projection;
  }

  public SuggestedReturnRefundProjection<ReturnProjection<PARENT, ROOT>, ROOT> suggestedRefund() {
     SuggestedReturnRefundProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new SuggestedReturnRefundProjection<>(this, getRoot());
     getFields().put("suggestedRefund", projection);
     return projection;
  }

  public SuggestedReturnRefundProjection<ReturnProjection<PARENT, ROOT>, ROOT> suggestedRefund(
      List<ReturnRefundLineItemInput> returnRefundLineItems, RefundShippingInput refundShipping,
      List<RefundDutyInput> refundDuties) {
    SuggestedReturnRefundProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new SuggestedReturnRefundProjection<>(this, getRoot());    
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

  public ReturnProjection<PARENT, ROOT> closedAt() {
    getFields().put("closedAt", null);
    return this;
  }

  public ReturnProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ReturnProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReturnProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ReturnProjection<PARENT, ROOT> requestApprovedAt() {
    getFields().put("requestApprovedAt", null);
    return this;
  }

  public ReturnProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }
}
