package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.FulfillmentOrderMerchantRequestKind;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class FulfillmentOrderFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public FulfillmentOrderFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrder"));
  }

  public FulfillmentOrderFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderAssignedLocationProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> assignedLocation(
      ) {
     FulfillmentOrderAssignedLocationProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderAssignedLocationProjection<>(this, getRoot());
     getFields().put("assignedLocation", projection);
     return projection;
  }

  public DeliveryMethodProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> deliveryMethod(
      ) {
     DeliveryMethodProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryMethodProjection<>(this, getRoot());
     getFields().put("deliveryMethod", projection);
     return projection;
  }

  public FulfillmentOrderDestinationProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> destination(
      ) {
     FulfillmentOrderDestinationProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderDestinationProjection<>(this, getRoot());
     getFields().put("destination", projection);
     return projection;
  }

  public FulfillmentHoldProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentHolds(
      ) {
     FulfillmentHoldProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentHoldProjection<>(this, getRoot());
     getFields().put("fulfillmentHolds", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentOrdersForMerge(
      ) {
     FulfillmentOrderConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());
     getFields().put("fulfillmentOrdersForMerge", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentOrdersForMerge(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentOrderConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());    
    getFields().put("fulfillmentOrdersForMerge", projection);
    getInputArguments().computeIfAbsent("fulfillmentOrdersForMerge", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("fulfillmentOrdersForMerge").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("fulfillmentOrdersForMerge").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("fulfillmentOrdersForMerge").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("fulfillmentOrdersForMerge").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("fulfillmentOrdersForMerge").add(reverseArg);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentOrdersForMergeWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    FulfillmentOrderConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());    
    getFields().put("fulfillmentOrdersForMerge", projection);
    getInputArguments().computeIfAbsent("fulfillmentOrdersForMerge", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("fulfillmentOrdersForMerge").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("fulfillmentOrdersForMerge").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("fulfillmentOrdersForMerge").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("fulfillmentOrdersForMerge").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("fulfillmentOrdersForMerge").add(reverseArg);
    return projection;
  }

  public FulfillmentConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> fulfillments(
      ) {
     FulfillmentConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentConnectionProjection<>(this, getRoot());
     getFields().put("fulfillments", projection);
     return projection;
  }

  public FulfillmentConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> fulfillments(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentConnectionProjection<>(this, getRoot());    
    getFields().put("fulfillments", projection);
    getInputArguments().computeIfAbsent("fulfillments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("fulfillments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("fulfillments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("fulfillments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("fulfillments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("fulfillments").add(reverseArg);
    return projection;
  }

  public FulfillmentConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    FulfillmentConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentConnectionProjection<>(this, getRoot());    
    getFields().put("fulfillments", projection);
    getInputArguments().computeIfAbsent("fulfillments", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("fulfillments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("fulfillments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("fulfillments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("fulfillments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("fulfillments").add(reverseArg);
    return projection;
  }

  public FulfillmentOrderInternationalDutiesProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> internationalDuties(
      ) {
     FulfillmentOrderInternationalDutiesProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderInternationalDutiesProjection<>(this, getRoot());
     getFields().put("internationalDuties", projection);
     return projection;
  }

  public FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("lineItems").add(reverseArg);
    return projection;
  }

  public FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> lineItemsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("lineItems").add(reverseArg);
    return projection;
  }

  public FulfillmentOrderLocationForMoveConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> locationsForMove(
      ) {
     FulfillmentOrderLocationForMoveConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLocationForMoveConnectionProjection<>(this, getRoot());
     getFields().put("locationsForMove", projection);
     return projection;
  }

  public FulfillmentOrderLocationForMoveConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> locationsForMove(
      List<String> lineItemIds, String query, List<String> locationIds, Integer first, String after,
      Integer last, String before, Boolean reverse) {
    FulfillmentOrderLocationForMoveConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLocationForMoveConnectionProjection<>(this, getRoot());    
    getFields().put("locationsForMove", projection);
    getInputArguments().computeIfAbsent("locationsForMove", k -> new ArrayList<>());                      
    InputArgument lineItemIdsArg = new InputArgument("lineItemIds", lineItemIds, false, null);
    getInputArguments().get("locationsForMove").add(lineItemIdsArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("locationsForMove").add(queryArg);
    InputArgument locationIdsArg = new InputArgument("locationIds", locationIds, false, null);
    getInputArguments().get("locationsForMove").add(locationIdsArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("locationsForMove").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("locationsForMove").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("locationsForMove").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("locationsForMove").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("locationsForMove").add(reverseArg);
    return projection;
  }

  public FulfillmentOrderLocationForMoveConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> locationsForMoveWithVariableReferences(
      String lineItemIdsReference, String queryReference, String locationIdsReference,
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    FulfillmentOrderLocationForMoveConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLocationForMoveConnectionProjection<>(this, getRoot());    
    getFields().put("locationsForMove", projection);
    getInputArguments().computeIfAbsent("locationsForMove", k -> new ArrayList<>());              
    InputArgument lineItemIdsArg = new InputArgument("lineItemIds", lineItemIdsReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))));
    getInputArguments().get("locationsForMove").add(lineItemIdsArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("locationsForMove").add(queryArg);
    InputArgument locationIdsArg = new InputArgument("locationIds", locationIdsReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID"))));
    getInputArguments().get("locationsForMove").add(locationIdsArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("locationsForMove").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("locationsForMove").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("locationsForMove").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("locationsForMove").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("locationsForMove").add(reverseArg);
    return projection;
  }

  public FulfillmentOrderMerchantRequestConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> merchantRequests(
      ) {
     FulfillmentOrderMerchantRequestConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderMerchantRequestConnectionProjection<>(this, getRoot());
     getFields().put("merchantRequests", projection);
     return projection;
  }

  public FulfillmentOrderMerchantRequestConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> merchantRequests(
      FulfillmentOrderMerchantRequestKind kind, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    FulfillmentOrderMerchantRequestConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderMerchantRequestConnectionProjection<>(this, getRoot());    
    getFields().put("merchantRequests", projection);
    getInputArguments().computeIfAbsent("merchantRequests", k -> new ArrayList<>());                      
    InputArgument kindArg = new InputArgument("kind", kind, false, null);
    getInputArguments().get("merchantRequests").add(kindArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("merchantRequests").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("merchantRequests").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("merchantRequests").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("merchantRequests").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("merchantRequests").add(reverseArg);
    return projection;
  }

  public FulfillmentOrderMerchantRequestConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> merchantRequestsWithVariableReferences(
      String kindReference, String firstReference, String afterReference, String lastReference,
      String beforeReference, String reverseReference) {
    FulfillmentOrderMerchantRequestConnectionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderMerchantRequestConnectionProjection<>(this, getRoot());    
    getFields().put("merchantRequests", projection);
    getInputArguments().computeIfAbsent("merchantRequests", k -> new ArrayList<>());              
    InputArgument kindArg = new InputArgument("kind", kindReference, true, new graphql.language.TypeName("FulfillmentOrderMerchantRequestKind"));
    getInputArguments().get("merchantRequests").add(kindArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("merchantRequests").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("merchantRequests").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("merchantRequests").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("merchantRequests").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("merchantRequests").add(reverseArg);
    return projection;
  }

  public OrderProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public WeightProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> remainingLineItemsWeight(
      ) {
     WeightProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new WeightProjection<>(this, getRoot());
     getFields().put("remainingLineItemsWeight", projection);
     return projection;
  }

  public FulfillmentOrderRequestStatusProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> requestStatus(
      ) {
     FulfillmentOrderRequestStatusProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderRequestStatusProjection<>(this, getRoot());
     getFields().put("requestStatus", projection);
     return projection;
  }

  public FulfillmentOrderStatusProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     FulfillmentOrderStatusProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public FulfillmentOrderSupportedActionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> supportedActions(
      ) {
     FulfillmentOrderSupportedActionProjection<FulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderSupportedActionProjection<>(this, getRoot());
     getFields().put("supportedActions", projection);
     return projection;
  }

  public FulfillmentOrderFragmentProjection<PARENT, ROOT> channelId() {
    getFields().put("channelId", null);
    return this;
  }

  public FulfillmentOrderFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public FulfillmentOrderFragmentProjection<PARENT, ROOT> fulfillAt() {
    getFields().put("fulfillAt", null);
    return this;
  }

  public FulfillmentOrderFragmentProjection<PARENT, ROOT> fulfillBy() {
    getFields().put("fulfillBy", null);
    return this;
  }

  public FulfillmentOrderFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentOrderFragmentProjection<PARENT, ROOT> orderId() {
    getFields().put("orderId", null);
    return this;
  }

  public FulfillmentOrderFragmentProjection<PARENT, ROOT> orderName() {
    getFields().put("orderName", null);
    return this;
  }

  public FulfillmentOrderFragmentProjection<PARENT, ROOT> orderProcessedAt() {
    getFields().put("orderProcessedAt", null);
    return this;
  }

  public FulfillmentOrderFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on FulfillmentOrder {");
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
