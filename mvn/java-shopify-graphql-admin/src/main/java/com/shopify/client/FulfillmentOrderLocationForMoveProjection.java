package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class FulfillmentOrderLocationForMoveProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderLocationForMoveProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderLocationForMove"));
  }

  public FulfillmentOrderLocationForMoveProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderLocationForMoveProjection<PARENT, ROOT>, ROOT> availableLineItems(
      ) {
     FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderLocationForMoveProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemConnectionProjection<>(this, getRoot());
     getFields().put("availableLineItems", projection);
     return projection;
  }

  public FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderLocationForMoveProjection<PARENT, ROOT>, ROOT> availableLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderLocationForMoveProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("availableLineItems", projection);
    getInputArguments().computeIfAbsent("availableLineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("availableLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("availableLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("availableLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("availableLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("availableLineItems").add(reverseArg);
    return projection;
  }

  public CountProjection<FulfillmentOrderLocationForMoveProjection<PARENT, ROOT>, ROOT> availableLineItemsCount(
      ) {
     CountProjection<FulfillmentOrderLocationForMoveProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("availableLineItemsCount", projection);
     return projection;
  }

  public LocationProjection<FulfillmentOrderLocationForMoveProjection<PARENT, ROOT>, ROOT> location(
      ) {
     LocationProjection<FulfillmentOrderLocationForMoveProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderLocationForMoveProjection<PARENT, ROOT>, ROOT> unavailableLineItems(
      ) {
     FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderLocationForMoveProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemConnectionProjection<>(this, getRoot());
     getFields().put("unavailableLineItems", projection);
     return projection;
  }

  public FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderLocationForMoveProjection<PARENT, ROOT>, ROOT> unavailableLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    FulfillmentOrderLineItemConnectionProjection<FulfillmentOrderLocationForMoveProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("unavailableLineItems", projection);
    getInputArguments().computeIfAbsent("unavailableLineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("unavailableLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("unavailableLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("unavailableLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("unavailableLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("unavailableLineItems").add(reverseArg);
    return projection;
  }

  public CountProjection<FulfillmentOrderLocationForMoveProjection<PARENT, ROOT>, ROOT> unavailableLineItemsCount(
      ) {
     CountProjection<FulfillmentOrderLocationForMoveProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("unavailableLineItemsCount", projection);
     return projection;
  }

  public FulfillmentOrderLocationForMoveProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }

  public FulfillmentOrderLocationForMoveProjection<PARENT, ROOT> movable() {
    getFields().put("movable", null);
    return this;
  }
}
