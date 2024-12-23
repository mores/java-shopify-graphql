package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.FulfillmentEventSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class FulfillmentProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentProjectionRoot() {
    super(null, null, java.util.Optional.of("Fulfillment"));
  }

  public FulfillmentProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentDisplayStatusProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> displayStatus(
      ) {
    FulfillmentDisplayStatusProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> projection = new FulfillmentDisplayStatusProjection<>(this, this);    
    getFields().put("displayStatus", projection);
    return projection;
  }

  public FulfillmentEventConnectionProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> events(
      ) {
    FulfillmentEventConnectionProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> projection = new FulfillmentEventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public FulfillmentEventConnectionProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      FulfillmentEventSortKeys sortKey) {
    FulfillmentEventConnectionProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> projection = new FulfillmentEventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("events").add(sortKeyArg);
    return projection;
  }

  public FulfillmentLineItemConnectionProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> fulfillmentLineItems(
      ) {
    FulfillmentLineItemConnectionProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> projection = new FulfillmentLineItemConnectionProjection<>(this, this);    
    getFields().put("fulfillmentLineItems", projection);
    return projection;
  }

  public FulfillmentLineItemConnectionProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> fulfillmentLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentLineItemConnectionProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> projection = new FulfillmentLineItemConnectionProjection<>(this, this);    
    getFields().put("fulfillmentLineItems", projection);
    getInputArguments().computeIfAbsent("fulfillmentLineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("fulfillmentLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("fulfillmentLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("fulfillmentLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("fulfillmentLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("fulfillmentLineItems").add(reverseArg);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> fulfillmentOrders(
      ) {
    FulfillmentOrderConnectionProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderConnectionProjection<>(this, this);    
    getFields().put("fulfillmentOrders", projection);
    return projection;
  }

  public FulfillmentOrderConnectionProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> fulfillmentOrders(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentOrderConnectionProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderConnectionProjection<>(this, this);    
    getFields().put("fulfillmentOrders", projection);
    getInputArguments().computeIfAbsent("fulfillmentOrders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("fulfillmentOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("fulfillmentOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("fulfillmentOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("fulfillmentOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("fulfillmentOrders").add(reverseArg);
    return projection;
  }

  public LocationProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> location(
      ) {
    LocationProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("location", projection);
    return projection;
  }

  public OrderProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public FulfillmentOriginAddressProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> originAddress(
      ) {
    FulfillmentOriginAddressProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOriginAddressProjection<>(this, this);    
    getFields().put("originAddress", projection);
    return projection;
  }

  public FulfillmentServiceProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> service(
      ) {
    FulfillmentServiceProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> projection = new FulfillmentServiceProjection<>(this, this);    
    getFields().put("service", projection);
    return projection;
  }

  public FulfillmentStatusProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> status(
      ) {
    FulfillmentStatusProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> projection = new FulfillmentStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public FulfillmentTrackingInfoProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> trackingInfo(
      ) {
    FulfillmentTrackingInfoProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> projection = new FulfillmentTrackingInfoProjection<>(this, this);    
    getFields().put("trackingInfo", projection);
    return projection;
  }

  public FulfillmentTrackingInfoProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> trackingInfo(
      Integer first) {
    FulfillmentTrackingInfoProjection<FulfillmentProjectionRoot<PARENT, ROOT>, FulfillmentProjectionRoot<PARENT, ROOT>> projection = new FulfillmentTrackingInfoProjection<>(this, this);    
    getFields().put("trackingInfo", projection);
    getInputArguments().computeIfAbsent("trackingInfo", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("trackingInfo").add(firstArg);
    return projection;
  }

  public FulfillmentProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public FulfillmentProjectionRoot<PARENT, ROOT> deliveredAt() {
    getFields().put("deliveredAt", null);
    return this;
  }

  public FulfillmentProjectionRoot<PARENT, ROOT> estimatedDeliveryAt() {
    getFields().put("estimatedDeliveryAt", null);
    return this;
  }

  public FulfillmentProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentProjectionRoot<PARENT, ROOT> inTransitAt() {
    getFields().put("inTransitAt", null);
    return this;
  }

  public FulfillmentProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public FulfillmentProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public FulfillmentProjectionRoot<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public FulfillmentProjectionRoot<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }

  public FulfillmentProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
