package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class ReturnableFulfillmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnableFulfillmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnableFulfillment"));
  }

  public ReturnableFulfillmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentProjection<ReturnableFulfillmentProjection<PARENT, ROOT>, ROOT> fulfillment() {
     FulfillmentProjection<ReturnableFulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentProjection<>(this, getRoot());
     getFields().put("fulfillment", projection);
     return projection;
  }

  public ReturnableFulfillmentLineItemConnectionProjection<ReturnableFulfillmentProjection<PARENT, ROOT>, ROOT> returnableFulfillmentLineItems(
      ) {
     ReturnableFulfillmentLineItemConnectionProjection<ReturnableFulfillmentProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentLineItemConnectionProjection<>(this, getRoot());
     getFields().put("returnableFulfillmentLineItems", projection);
     return projection;
  }

  public ReturnableFulfillmentLineItemConnectionProjection<ReturnableFulfillmentProjection<PARENT, ROOT>, ROOT> returnableFulfillmentLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReturnableFulfillmentLineItemConnectionProjection<ReturnableFulfillmentProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentLineItemConnectionProjection<>(this, getRoot());    
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

  public ReturnableFulfillmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
