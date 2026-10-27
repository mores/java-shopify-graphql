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
      Boolean includeRemovedItems, ReturnProcessingStatusFilterInput processingStatus,
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ExchangeLineItemConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ExchangeLineItemConnectionProjection<>(this, getRoot());    
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

  public ExchangeLineItemConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> exchangeLineItemsWithVariableReferences(
      String includeRemovedItemsReference, String processingStatusReference, String firstReference,
      String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ExchangeLineItemConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ExchangeLineItemConnectionProjection<>(this, getRoot());    
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

  public RefundConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> refundsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    RefundConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new RefundConnectionProjection<>(this, getRoot());    
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

  public ReturnLineItemTypeConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> returnLineItems(
      ) {
     ReturnLineItemTypeConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ReturnLineItemTypeConnectionProjection<>(this, getRoot());
     getFields().put("returnLineItems", projection);
     return projection;
  }

  public ReturnLineItemTypeConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> returnLineItems(
      ReturnProcessingStatusFilterInput processingStatus, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    ReturnLineItemTypeConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ReturnLineItemTypeConnectionProjection<>(this, getRoot());    
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

  public ReturnLineItemTypeConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> returnLineItemsWithVariableReferences(
      String processingStatusReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    ReturnLineItemTypeConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ReturnLineItemTypeConnectionProjection<>(this, getRoot());    
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

  public ReverseFulfillmentOrderConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> reverseFulfillmentOrdersWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ReverseFulfillmentOrderConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderConnectionProjection<>(this, getRoot());    
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

  public StaffMemberProjection<ReturnProjection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
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
      RefundShippingInput refundShipping, String tipLineId, List<RefundDutyInput> refundDuties,
      RefundMethodAllocation refundMethodAllocation) {
    SuggestedReturnFinancialOutcomeProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new SuggestedReturnFinancialOutcomeProjection<>(this, getRoot());    
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

  public SuggestedReturnFinancialOutcomeProjection<ReturnProjection<PARENT, ROOT>, ROOT> suggestedFinancialOutcomeWithVariableReferences(
      String returnLineItemsReference, String exchangeLineItemsReference,
      String refundShippingReference, String tipLineIdReference, String refundDutiesReference,
      String refundMethodAllocationReference) {
    SuggestedReturnFinancialOutcomeProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new SuggestedReturnFinancialOutcomeProjection<>(this, getRoot());    
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
    InputArgument returnRefundLineItemsArg = new InputArgument("returnRefundLineItems", returnRefundLineItems, false, null);
    getInputArguments().get("suggestedRefund").add(returnRefundLineItemsArg);
    InputArgument refundShippingArg = new InputArgument("refundShipping", refundShipping, false, null);
    getInputArguments().get("suggestedRefund").add(refundShippingArg);
    InputArgument refundDutiesArg = new InputArgument("refundDuties", refundDuties, false, null);
    getInputArguments().get("suggestedRefund").add(refundDutiesArg);
    return projection;
  }

  public SuggestedReturnRefundProjection<ReturnProjection<PARENT, ROOT>, ROOT> suggestedRefundWithVariableReferences(
      String returnRefundLineItemsReference, String refundShippingReference,
      String refundDutiesReference) {
    SuggestedReturnRefundProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new SuggestedReturnRefundProjection<>(this, getRoot());    
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

  public OrderTransactionConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> transactions() {
     OrderTransactionConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionConnectionProjection<>(this, getRoot());
     getFields().put("transactions", projection);
     return projection;
  }

  public OrderTransactionConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> transactions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    OrderTransactionConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionConnectionProjection<>(this, getRoot());    
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

  public OrderTransactionConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> transactionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    OrderTransactionConnectionProjection<ReturnProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionConnectionProjection<>(this, getRoot());    
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
