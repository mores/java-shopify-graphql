package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.FulfillmentEventSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class FulfillmentFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public FulfillmentFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Fulfillment"));
  }

  public FulfillmentFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentDisplayStatusProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> displayStatus(
      ) {
     FulfillmentDisplayStatusProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentDisplayStatusProjection<>(this, getRoot());
     getFields().put("displayStatus", projection);
     return projection;
  }

  public FulfillmentEventConnectionProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> events(
      ) {
     FulfillmentEventConnectionProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentEventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public FulfillmentEventConnectionProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      FulfillmentEventSortKeys sortKey) {
    FulfillmentEventConnectionProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentEventConnectionProjection<>(this, getRoot());    
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

  public FulfillmentLineItemConnectionProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentLineItems(
      ) {
     FulfillmentLineItemConnectionProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentLineItemConnectionProjection<>(this, getRoot());
     getFields().put("fulfillmentLineItems", projection);
     return projection;
  }

  public FulfillmentLineItemConnectionProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentLineItemConnectionProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentLineItemConnectionProjection<>(this, getRoot());    
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

  public FulfillmentOrderConnectionProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentOrders(
      ) {
     FulfillmentOrderConnectionProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());
     getFields().put("fulfillmentOrders", projection);
     return projection;
  }

  public FulfillmentOrderConnectionProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentOrders(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentOrderConnectionProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderConnectionProjection<>(this, getRoot());    
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

  public LocationProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public OrderProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public FulfillmentOriginAddressProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> originAddress(
      ) {
     FulfillmentOriginAddressProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOriginAddressProjection<>(this, getRoot());
     getFields().put("originAddress", projection);
     return projection;
  }

  public FulfillmentServiceProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> service() {
     FulfillmentServiceProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("service", projection);
     return projection;
  }

  public FulfillmentStatusProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> status() {
     FulfillmentStatusProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public FulfillmentTrackingInfoProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> trackingInfo(
      ) {
     FulfillmentTrackingInfoProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentTrackingInfoProjection<>(this, getRoot());
     getFields().put("trackingInfo", projection);
     return projection;
  }

  public FulfillmentTrackingInfoProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> trackingInfo(
      Integer first) {
    FulfillmentTrackingInfoProjection<FulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentTrackingInfoProjection<>(this, getRoot());    
    getFields().put("trackingInfo", projection);
    getInputArguments().computeIfAbsent("trackingInfo", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("trackingInfo").add(firstArg);
    return projection;
  }

  public FulfillmentFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public FulfillmentFragmentProjection<PARENT, ROOT> deliveredAt() {
    getFields().put("deliveredAt", null);
    return this;
  }

  public FulfillmentFragmentProjection<PARENT, ROOT> estimatedDeliveryAt() {
    getFields().put("estimatedDeliveryAt", null);
    return this;
  }

  public FulfillmentFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentFragmentProjection<PARENT, ROOT> inTransitAt() {
    getFields().put("inTransitAt", null);
    return this;
  }

  public FulfillmentFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public FulfillmentFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public FulfillmentFragmentProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public FulfillmentFragmentProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }

  public FulfillmentFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Fulfillment {");
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
