package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.FulfillmentEventSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class FulfillmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Fulfillment"));
  }

  public FulfillmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentDisplayStatusProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> displayStatus(
      ) {
     FulfillmentDisplayStatusProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentDisplayStatusProjection<>(this, getRoot());
     getFields().put("displayStatus", projection);
     return projection;
  }

  public FulfillmentEventConnectionProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> events() {
     FulfillmentEventConnectionProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentEventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public FulfillmentEventConnectionProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      FulfillmentEventSortKeys sortKey) {
    FulfillmentEventConnectionProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentEventConnectionProjection<>(this, getRoot());    
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

  public FulfillmentLineItemConnectionProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> fulfillmentLineItems(
      ) {
     FulfillmentLineItemConnectionProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentLineItemConnectionProjection<>(this, getRoot());
     getFields().put("fulfillmentLineItems", projection);
     return projection;
  }

  public FulfillmentLineItemConnectionProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> fulfillmentLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentLineItemConnectionProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentLineItemConnectionProjection<>(this, getRoot());    
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

  public FulfillmentOrderConnectionProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> fulfillmentOrders(
      ) {
     FulfillmentOrderConnectionProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());
     getFields().put("fulfillmentOrders", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> fulfillmentOrders(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentOrderConnectionProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());    
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

  public LocationProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public OrderProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public FulfillmentOriginAddressProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> originAddress(
      ) {
     FulfillmentOriginAddressProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOriginAddressProjection<>(this, getRoot());
     getFields().put("originAddress", projection);
     return projection;
  }

  public FulfillmentServiceProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> service() {
     FulfillmentServiceProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("service", projection);
     return projection;
  }

  public FulfillmentStatusProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> status() {
     FulfillmentStatusProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public FulfillmentTrackingInfoProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> trackingInfo(
      ) {
     FulfillmentTrackingInfoProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentTrackingInfoProjection<>(this, getRoot());
     getFields().put("trackingInfo", projection);
     return projection;
  }

  public FulfillmentTrackingInfoProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> trackingInfo(
      Integer first) {
    FulfillmentTrackingInfoProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentTrackingInfoProjection<>(this, getRoot());    
    getFields().put("trackingInfo", projection);
    getInputArguments().computeIfAbsent("trackingInfo", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("trackingInfo").add(firstArg);
    return projection;
  }

  public FulfillmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public FulfillmentProjection<PARENT, ROOT> deliveredAt() {
    getFields().put("deliveredAt", null);
    return this;
  }

  public FulfillmentProjection<PARENT, ROOT> estimatedDeliveryAt() {
    getFields().put("estimatedDeliveryAt", null);
    return this;
  }

  public FulfillmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentProjection<PARENT, ROOT> inTransitAt() {
    getFields().put("inTransitAt", null);
    return this;
  }

  public FulfillmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public FulfillmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public FulfillmentProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public FulfillmentProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }

  public FulfillmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
