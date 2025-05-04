package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.FulfillmentOrderMerchantRequestKind;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class FulfillmentOrderProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrder"));
  }

  public FulfillmentOrderProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderAssignedLocationProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> assignedLocation(
      ) {
    FulfillmentOrderAssignedLocationProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderAssignedLocationProjection<>(this, this);    
    getFields().put("assignedLocation", projection);
    return projection;
  }

  public DeliveryMethodProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> deliveryMethod(
      ) {
    DeliveryMethodProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new DeliveryMethodProjection<>(this, this);    
    getFields().put("deliveryMethod", projection);
    return projection;
  }

  public FulfillmentOrderDestinationProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> destination(
      ) {
    FulfillmentOrderDestinationProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderDestinationProjection<>(this, this);    
    getFields().put("destination", projection);
    return projection;
  }

  public FulfillmentHoldProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> fulfillmentHolds(
      ) {
    FulfillmentHoldProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentHoldProjection<>(this, this);    
    getFields().put("fulfillmentHolds", projection);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> fulfillmentOrdersForMerge(
      ) {
    FulfillmentOrderConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderConnectionProjection<>(this, this);    
    getFields().put("fulfillmentOrdersForMerge", projection);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> fulfillmentOrdersForMerge(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentOrderConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderConnectionProjection<>(this, this);    
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

  public FulfillmentConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> fulfillments(
      ) {
    FulfillmentConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentConnectionProjection<>(this, this);    
    getFields().put("fulfillments", projection);
    return projection;
  }

  public FulfillmentConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> fulfillments(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentConnectionProjection<>(this, this);    
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

  public FulfillmentOrderInternationalDutiesProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> internationalDuties(
      ) {
    FulfillmentOrderInternationalDutiesProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderInternationalDutiesProjection<>(this, this);    
    getFields().put("internationalDuties", projection);
    return projection;
  }

  public FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> lineItems(
      ) {
    FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderLineItemConnectionProjection<>(this, this);    
    getFields().put("lineItems", projection);
    return projection;
  }

  public FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderLineItemConnectionProjection<>(this, this);    
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

  public FulfillmentOrderLocationForMoveConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> locationsForMove(
      ) {
    FulfillmentOrderLocationForMoveConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderLocationForMoveConnectionProjection<>(this, this);    
    getFields().put("locationsForMove", projection);
    return projection;
  }

  public FulfillmentOrderLocationForMoveConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> locationsForMove(
      List<String> lineItemIds, String query, List<String> locationIds, Integer first, String after,
      Integer last, String before, Boolean reverse) {
    FulfillmentOrderLocationForMoveConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderLocationForMoveConnectionProjection<>(this, this);    
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

  public FulfillmentOrderMerchantRequestConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> merchantRequests(
      ) {
    FulfillmentOrderMerchantRequestConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderMerchantRequestConnectionProjection<>(this, this);    
    getFields().put("merchantRequests", projection);
    return projection;
  }

  public FulfillmentOrderMerchantRequestConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> merchantRequests(
      FulfillmentOrderMerchantRequestKind kind, Integer first, String after, Integer last,
      String before, Boolean reverse) {
    FulfillmentOrderMerchantRequestConnectionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderMerchantRequestConnectionProjection<>(this, this);    
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

  public OrderProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public FulfillmentOrderRequestStatusProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> requestStatus(
      ) {
    FulfillmentOrderRequestStatusProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderRequestStatusProjection<>(this, this);    
    getFields().put("requestStatus", projection);
    return projection;
  }

  public FulfillmentOrderStatusProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> status(
      ) {
    FulfillmentOrderStatusProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public FulfillmentOrderSupportedActionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> supportedActions(
      ) {
    FulfillmentOrderSupportedActionProjection<FulfillmentOrderProjectionRoot<PARENT, ROOT>, FulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderSupportedActionProjection<>(this, this);    
    getFields().put("supportedActions", projection);
    return projection;
  }

  public FulfillmentOrderProjectionRoot<PARENT, ROOT> channelId() {
    getFields().put("channelId", null);
    return this;
  }

  public FulfillmentOrderProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public FulfillmentOrderProjectionRoot<PARENT, ROOT> fulfillAt() {
    getFields().put("fulfillAt", null);
    return this;
  }

  public FulfillmentOrderProjectionRoot<PARENT, ROOT> fulfillBy() {
    getFields().put("fulfillBy", null);
    return this;
  }

  public FulfillmentOrderProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentOrderProjectionRoot<PARENT, ROOT> orderId() {
    getFields().put("orderId", null);
    return this;
  }

  public FulfillmentOrderProjectionRoot<PARENT, ROOT> orderName() {
    getFields().put("orderName", null);
    return this;
  }

  public FulfillmentOrderProjectionRoot<PARENT, ROOT> orderProcessedAt() {
    getFields().put("orderProcessedAt", null);
    return this;
  }

  public FulfillmentOrderProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
