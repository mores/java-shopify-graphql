package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class ReturnableFulfillmentProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnableFulfillmentProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnableFulfillment"));
  }

  public ReturnableFulfillmentProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentProjection<ReturnableFulfillmentProjectionRoot<PARENT, ROOT>, ReturnableFulfillmentProjectionRoot<PARENT, ROOT>> fulfillment(
      ) {
    FulfillmentProjection<ReturnableFulfillmentProjectionRoot<PARENT, ROOT>, ReturnableFulfillmentProjectionRoot<PARENT, ROOT>> projection = new FulfillmentProjection<>(this, this);    
    getFields().put("fulfillment", projection);
    return projection;
  }

  public ReturnableFulfillmentLineItemConnectionProjection<ReturnableFulfillmentProjectionRoot<PARENT, ROOT>, ReturnableFulfillmentProjectionRoot<PARENT, ROOT>> returnableFulfillmentLineItems(
      ) {
    ReturnableFulfillmentLineItemConnectionProjection<ReturnableFulfillmentProjectionRoot<PARENT, ROOT>, ReturnableFulfillmentProjectionRoot<PARENT, ROOT>> projection = new ReturnableFulfillmentLineItemConnectionProjection<>(this, this);    
    getFields().put("returnableFulfillmentLineItems", projection);
    return projection;
  }

  public ReturnableFulfillmentLineItemConnectionProjection<ReturnableFulfillmentProjectionRoot<PARENT, ROOT>, ReturnableFulfillmentProjectionRoot<PARENT, ROOT>> returnableFulfillmentLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReturnableFulfillmentLineItemConnectionProjection<ReturnableFulfillmentProjectionRoot<PARENT, ROOT>, ReturnableFulfillmentProjectionRoot<PARENT, ROOT>> projection = new ReturnableFulfillmentLineItemConnectionProjection<>(this, this);    
    getFields().put("returnableFulfillmentLineItems", projection);
    getInputArguments().computeIfAbsent("returnableFulfillmentLineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("returnableFulfillmentLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("returnableFulfillmentLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("returnableFulfillmentLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("returnableFulfillmentLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("returnableFulfillmentLineItems").add(reverseArg);
    return projection;
  }

  public ReturnableFulfillmentProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
