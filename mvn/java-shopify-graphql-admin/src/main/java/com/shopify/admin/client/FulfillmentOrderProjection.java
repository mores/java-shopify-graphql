package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.FulfillmentOrderMerchantRequestKind;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class FulfillmentOrderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrder"));
  }

  public FulfillmentOrderProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderAssignedLocationProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> assignedLocation(
      ) {
     FulfillmentOrderAssignedLocationProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderAssignedLocationProjection<>(this, getRoot());
     getFields().put("assignedLocation", projection);
     return projection;
  }

  public DeliveryMethodProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> deliveryMethod() {
     DeliveryMethodProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new DeliveryMethodProjection<>(this, getRoot());
     getFields().put("deliveryMethod", projection);
     return projection;
  }

  public FulfillmentOrderDestinationProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> destination(
      ) {
     FulfillmentOrderDestinationProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderDestinationProjection<>(this, getRoot());
     getFields().put("destination", projection);
     return projection;
  }

  public FulfillmentHoldProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> fulfillmentHolds(
      ) {
     FulfillmentHoldProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentHoldProjection<>(this, getRoot());
     getFields().put("fulfillmentHolds", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> fulfillmentOrdersForMerge(
      ) {
     FulfillmentOrderConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());
     getFields().put("fulfillmentOrdersForMerge", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> fulfillmentOrdersForMerge(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentOrderConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());    
    getFields().put("fulfillmentOrdersForMerge", projection);
    getInputArguments().computeIfAbsent("fulfillmentOrdersForMerge", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("fulfillmentOrdersForMerge").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("fulfillmentOrdersForMerge").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("fulfillmentOrdersForMerge").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("fulfillmentOrdersForMerge").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("fulfillmentOrdersForMerge").add(reverseArg);
    return projection;
  }

  public FulfillmentConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> fulfillments(
      ) {
     FulfillmentConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentConnectionProjection<>(this, getRoot());
     getFields().put("fulfillments", projection);
     return projection;
  }

  public FulfillmentConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> fulfillments(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentConnectionProjection<>(this, getRoot());    
    getFields().put("fulfillments", projection);
    getInputArguments().computeIfAbsent("fulfillments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("fulfillments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("fulfillments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("fulfillments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("fulfillments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("fulfillments").add(reverseArg);
    return projection;
  }

  public FulfillmentOrderInternationalDutiesProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> internationalDuties(
      ) {
     FulfillmentOrderInternationalDutiesProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderInternationalDutiesProjection<>(this, getRoot());
     getFields().put("internationalDuties", projection);
     return projection;
  }

  public FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("lineItems").add(reverseArg);
    return projection;
  }

  public FulfillmentOrderLocationForMoveConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> locationsForMove(
      ) {
     FulfillmentOrderLocationForMoveConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLocationForMoveConnectionProjection<>(this, getRoot());
     getFields().put("locationsForMove", projection);
     return projection;
  }

  public FulfillmentOrderLocationForMoveConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> locationsForMove(
      List<String> lineItemIds, String query, List<String> locationIds, Integer first, String after,
      Integer last, String before, Boolean reverse) {
    FulfillmentOrderLocationForMoveConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLocationForMoveConnectionProjection<>(this, getRoot());    
    getFields().put("locationsForMove", projection);
    getInputArguments().computeIfAbsent("locationsForMove", k -> new ArrayList<>());                      
    InputArgument lineItemIdsArg = new InputArgument("lineItemIds", lineItemIds);
    getInputArguments().get("locationsForMove").add(lineItemIdsArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("locationsForMove").add(queryArg);
    InputArgument locationIdsArg = new InputArgument("locationIds", locationIds);
    getInputArguments().get("locationsForMove").add(locationIdsArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("locationsForMove").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("locationsForMove").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("locationsForMove").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("locationsForMove").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("locationsForMove").add(reverseArg);
    return projection;
  }

  public FulfillmentOrderMerchantRequestConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> merchantRequests(
      ) {
     FulfillmentOrderMerchantRequestConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderMerchantRequestConnectionProjection<>(this, getRoot());
     getFields().put("merchantRequests", projection);
     return projection;
  }

  public FulfillmentOrderMerchantRequestConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> merchantRequests(
      FulfillmentOrderMerchantRequestKind kind, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    FulfillmentOrderMerchantRequestConnectionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderMerchantRequestConnectionProjection<>(this, getRoot());    
    getFields().put("merchantRequests", projection);
    getInputArguments().computeIfAbsent("merchantRequests", k -> new ArrayList<>());                      
    InputArgument kindArg = new InputArgument("kind", kind);
    getInputArguments().get("merchantRequests").add(kindArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("merchantRequests").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("merchantRequests").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("merchantRequests").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("merchantRequests").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("merchantRequests").add(reverseArg);
    return projection;
  }

  public OrderProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public FulfillmentOrderRequestStatusProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> requestStatus(
      ) {
     FulfillmentOrderRequestStatusProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderRequestStatusProjection<>(this, getRoot());
     getFields().put("requestStatus", projection);
     return projection;
  }

  public FulfillmentOrderStatusProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> status() {
     FulfillmentOrderStatusProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public FulfillmentOrderSupportedActionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> supportedActions(
      ) {
     FulfillmentOrderSupportedActionProjection<FulfillmentOrderProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderSupportedActionProjection<>(this, getRoot());
     getFields().put("supportedActions", projection);
     return projection;
  }

  public FulfillmentOrderProjection<PARENT, ROOT> channelId() {
    getFields().put("channelId", null);
    return this;
  }

  public FulfillmentOrderProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public FulfillmentOrderProjection<PARENT, ROOT> fulfillAt() {
    getFields().put("fulfillAt", null);
    return this;
  }

  public FulfillmentOrderProjection<PARENT, ROOT> fulfillBy() {
    getFields().put("fulfillBy", null);
    return this;
  }

  public FulfillmentOrderProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentOrderProjection<PARENT, ROOT> orderId() {
    getFields().put("orderId", null);
    return this;
  }

  public FulfillmentOrderProjection<PARENT, ROOT> orderName() {
    getFields().put("orderName", null);
    return this;
  }

  public FulfillmentOrderProjection<PARENT, ROOT> orderProcessedAt() {
    getFields().put("orderProcessedAt", null);
    return this;
  }

  public FulfillmentOrderProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
