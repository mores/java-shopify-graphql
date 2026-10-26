package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.RefundDutyInput;
import com.shopify.admin.types.RefundMethodAllocation;
import com.shopify.admin.types.RefundShippingInput;
import com.shopify.admin.types.ReturnProcessingStatusFilterInput;
import com.shopify.admin.types.ReturnRefundLineItemInput;
import com.shopify.admin.types.SuggestedOutcomeExchangeLineItemInput;
import com.shopify.admin.types.SuggestedOutcomeReturnLineItemInput;
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
      Boolean includeRemovedItems, ReturnProcessingStatusFilterInput processingStatus,
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ExchangeLineItemConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ExchangeLineItemConnectionProjection<>(this, this);    
    getFields().put("exchangeLineItems", projection);
    getInputArguments().computeIfAbsent("exchangeLineItems", k -> new ArrayList<>());                      
    InputArgument includeRemovedItemsArg = new InputArgument("includeRemovedItems", includeRemovedItems, false, null);
    getInputArguments().get("exchangeLineItems").add(includeRemovedItemsArg);
    InputArgument processingStatusArg = new InputArgument("processingStatus", processingStatus, false, null);
    getInputArguments().get("exchangeLineItems").add(processingStatusArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("exchangeLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("exchangeLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("exchangeLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("exchangeLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("exchangeLineItems").add(reverseArg);
    return projection;
  }

  public ExchangeLineItemConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> exchangeLineItemsWithVariableReferences(
      String includeRemovedItemsReference, String processingStatusReference, String firstReference,
      String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ExchangeLineItemConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ExchangeLineItemConnectionProjection<>(this, this);    
    getFields().put("exchangeLineItems", projection);
    getInputArguments().computeIfAbsent("exchangeLineItems", k -> new ArrayList<>());              
    InputArgument includeRemovedItemsArg = new InputArgument("includeRemovedItems", includeRemovedItemsReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("exchangeLineItems").add(includeRemovedItemsArg);
    InputArgument processingStatusArg = new InputArgument("processingStatus", processingStatusReference, true, new graphql.language.TypeName("ReturnProcessingStatusFilterInput"));
    getInputArguments().get("exchangeLineItems").add(processingStatusArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("exchangeLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("exchangeLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("exchangeLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("exchangeLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
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
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("refunds").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("refunds").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("refunds").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("refunds").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("refunds").add(reverseArg);
    return projection;
  }

  public RefundConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> refundsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    RefundConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new RefundConnectionProjection<>(this, this);    
    getFields().put("refunds", projection);
    getInputArguments().computeIfAbsent("refunds", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("refunds").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("refunds").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("refunds").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("refunds").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
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
      ReturnProcessingStatusFilterInput processingStatus, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ReturnLineItemTypeConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ReturnLineItemTypeConnectionProjection<>(this, this);    
    getFields().put("returnLineItems", projection);
    getInputArguments().computeIfAbsent("returnLineItems", k -> new ArrayList<>());                      
    InputArgument processingStatusArg = new InputArgument("processingStatus", processingStatus, false, null);
    getInputArguments().get("returnLineItems").add(processingStatusArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("returnLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("returnLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("returnLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("returnLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("returnLineItems").add(reverseArg);
    return projection;
  }

  public ReturnLineItemTypeConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> returnLineItemsWithVariableReferences(
      String processingStatusReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    ReturnLineItemTypeConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ReturnLineItemTypeConnectionProjection<>(this, this);    
    getFields().put("returnLineItems", projection);
    getInputArguments().computeIfAbsent("returnLineItems", k -> new ArrayList<>());              
    InputArgument processingStatusArg = new InputArgument("processingStatus", processingStatusReference, true, new graphql.language.TypeName("ReturnProcessingStatusFilterInput"));
    getInputArguments().get("returnLineItems").add(processingStatusArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("returnLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("returnLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("returnLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("returnLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
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
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("reverseFulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("reverseFulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("reverseFulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("reverseFulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("reverseFulfillmentOrders").add(reverseArg);
    return projection;
  }

  public ReverseFulfillmentOrderConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> reverseFulfillmentOrdersWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ReverseFulfillmentOrderConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ReverseFulfillmentOrderConnectionProjection<>(this, this);    
    getFields().put("reverseFulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("reverseFulfillmentOrders", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("reverseFulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("reverseFulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("reverseFulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("reverseFulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("reverseFulfillmentOrders").add(reverseArg);
    return projection;
  }

  public StaffMemberProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> staffMember(
      ) {
    StaffMemberProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new StaffMemberProjection<>(this, this);    
    getFields().put("staffMember", projection);
    return projection;
  }

  public ReturnStatusProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> status(
      ) {
    ReturnStatusProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new ReturnStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public SuggestedReturnFinancialOutcomeProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> suggestedFinancialOutcome(
      ) {
    SuggestedReturnFinancialOutcomeProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new SuggestedReturnFinancialOutcomeProjection<>(this, this);    
    getFields().put("suggestedFinancialOutcome", projection);
    return projection;
  }

  public SuggestedReturnFinancialOutcomeProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> suggestedFinancialOutcome(
      List<SuggestedOutcomeReturnLineItemInput> returnLineItems,
      List<SuggestedOutcomeExchangeLineItemInput> exchangeLineItems,
      RefundShippingInput refundShipping, String tipLineId, List<RefundDutyInput> refundDuties,
      RefundMethodAllocation refundMethodAllocation) {
    SuggestedReturnFinancialOutcomeProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new SuggestedReturnFinancialOutcomeProjection<>(this, this);    
    getFields().put("suggestedFinancialOutcome", projection);
    getInputArguments().computeIfAbsent("suggestedFinancialOutcome", k -> new ArrayList<>());                      
    InputArgument returnLineItemsArg = new InputArgument("returnLineItems", returnLineItems, false, null);
    getInputArguments().get("suggestedFinancialOutcome").add(returnLineItemsArg);
    InputArgument exchangeLineItemsArg = new InputArgument("exchangeLineItems", exchangeLineItems, false, null);
    getInputArguments().get("suggestedFinancialOutcome").add(exchangeLineItemsArg);
    InputArgument refundShippingArg = new InputArgument("refundShipping", refundShipping, false, null);
    getInputArguments().get("suggestedFinancialOutcome").add(refundShippingArg);
    InputArgument tipLineIdArg = new InputArgument("tipLineId", tipLineId, false, null);
    getInputArguments().get("suggestedFinancialOutcome").add(tipLineIdArg);
    InputArgument refundDutiesArg = new InputArgument("refundDuties", refundDuties, false, null);
    getInputArguments().get("suggestedFinancialOutcome").add(refundDutiesArg);
    InputArgument refundMethodAllocationArg = new InputArgument("refundMethodAllocation", refundMethodAllocation, false, null);
    getInputArguments().get("suggestedFinancialOutcome").add(refundMethodAllocationArg);
    return projection;
  }

  public SuggestedReturnFinancialOutcomeProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> suggestedFinancialOutcomeWithVariableReferences(
      String returnLineItemsReference, String exchangeLineItemsReference,
      String refundShippingReference, String tipLineIdReference, String refundDutiesReference,
      String refundMethodAllocationReference) {
    SuggestedReturnFinancialOutcomeProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new SuggestedReturnFinancialOutcomeProjection<>(this, this);    
    getFields().put("suggestedFinancialOutcome", projection);
    getInputArguments().computeIfAbsent("suggestedFinancialOutcome", k -> new ArrayList<>());              
    InputArgument returnLineItemsArg = new InputArgument("returnLineItems", returnLineItemsReference, true, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("SuggestedOutcomeReturnLineItemInput")))));
    getInputArguments().get("suggestedFinancialOutcome").add(returnLineItemsArg);
    InputArgument exchangeLineItemsArg = new InputArgument("exchangeLineItems", exchangeLineItemsReference, true, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("SuggestedOutcomeExchangeLineItemInput")))));
    getInputArguments().get("suggestedFinancialOutcome").add(exchangeLineItemsArg);
    InputArgument refundShippingArg = new InputArgument("refundShipping", refundShippingReference, true, new graphql.language.TypeName("RefundShippingInput"));
    getInputArguments().get("suggestedFinancialOutcome").add(refundShippingArg);
    InputArgument tipLineIdArg = new InputArgument("tipLineId", tipLineIdReference, true, new graphql.language.TypeName("ID"));
    getInputArguments().get("suggestedFinancialOutcome").add(tipLineIdArg);
    InputArgument refundDutiesArg = new InputArgument("refundDuties", refundDutiesReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("RefundDutyInput"))));
    getInputArguments().get("suggestedFinancialOutcome").add(refundDutiesArg);
    InputArgument refundMethodAllocationArg = new InputArgument("refundMethodAllocation", refundMethodAllocationReference, true, new graphql.language.TypeName("RefundMethodAllocation"));
    getInputArguments().get("suggestedFinancialOutcome").add(refundMethodAllocationArg);
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
    InputArgument returnRefundLineItemsArg = new InputArgument("returnRefundLineItems", returnRefundLineItems, false, null);
    getInputArguments().get("suggestedRefund").add(returnRefundLineItemsArg);
    InputArgument refundShippingArg = new InputArgument("refundShipping", refundShipping, false, null);
    getInputArguments().get("suggestedRefund").add(refundShippingArg);
    InputArgument refundDutiesArg = new InputArgument("refundDuties", refundDuties, false, null);
    getInputArguments().get("suggestedRefund").add(refundDutiesArg);
    return projection;
  }

  public SuggestedReturnRefundProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> suggestedRefundWithVariableReferences(
      String returnRefundLineItemsReference, String refundShippingReference,
      String refundDutiesReference) {
    SuggestedReturnRefundProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new SuggestedReturnRefundProjection<>(this, this);    
    getFields().put("suggestedRefund", projection);
    getInputArguments().computeIfAbsent("suggestedRefund", k -> new ArrayList<>());              
    InputArgument returnRefundLineItemsArg = new InputArgument("returnRefundLineItems", returnRefundLineItemsReference, true, new graphql.language.NonNullType(new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ReturnRefundLineItemInput")))));
    getInputArguments().get("suggestedRefund").add(returnRefundLineItemsArg);
    InputArgument refundShippingArg = new InputArgument("refundShipping", refundShippingReference, true, new graphql.language.TypeName("RefundShippingInput"));
    getInputArguments().get("suggestedRefund").add(refundShippingArg);
    InputArgument refundDutiesArg = new InputArgument("refundDuties", refundDutiesReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("RefundDutyInput"))));
    getInputArguments().get("suggestedRefund").add(refundDutiesArg);
    return projection;
  }

  public OrderTransactionConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> transactions(
      ) {
    OrderTransactionConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new OrderTransactionConnectionProjection<>(this, this);    
    getFields().put("transactions", projection);
    return projection;
  }

  public OrderTransactionConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> transactions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderTransactionConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new OrderTransactionConnectionProjection<>(this, this);    
    getFields().put("transactions", projection);
    getInputArguments().computeIfAbsent("transactions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("transactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("transactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("transactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("transactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("transactions").add(reverseArg);
    return projection;
  }

  public OrderTransactionConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> transactionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    OrderTransactionConnectionProjection<ReturnProjectionRoot<PARENT, ROOT>, ReturnProjectionRoot<PARENT, ROOT>> projection = new OrderTransactionConnectionProjection<>(this, this);    
    getFields().put("transactions", projection);
    getInputArguments().computeIfAbsent("transactions", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("transactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("transactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("transactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("transactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("transactions").add(reverseArg);
    return projection;
  }

  public ReturnProjectionRoot<PARENT, ROOT> closedAt() {
    getFields().put("closedAt", null);
    return this;
  }

  public ReturnProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ReturnProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReturnProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ReturnProjectionRoot<PARENT, ROOT> requestApprovedAt() {
    getFields().put("requestApprovedAt", null);
    return this;
  }

  public ReturnProjectionRoot<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }
}
