package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
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
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("fulfillmentLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("fulfillmentLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("fulfillmentLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("fulfillmentLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("fulfillmentLineItems").add(reverseArg);
    return projection;
  }

  public FulfillmentLineItemConnectionProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> fulfillmentLineItemsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    FulfillmentLineItemConnectionProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("fulfillmentLineItems", projection);
    getInputArguments().computeIfAbsent("fulfillmentLineItems", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("fulfillmentLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("fulfillmentLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("fulfillmentLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("fulfillmentLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("fulfillmentLineItems").add(reverseArg);
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
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("trackingInfo").add(firstArg);
    return projection;
  }

  public FulfillmentTrackingInfoProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> trackingInfoWithVariableReferences(
      String firstReference) {
    FulfillmentTrackingInfoProjection<FulfillmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentTrackingInfoProjection<>(this, getRoot());    
    getFields().put("trackingInfo", projection);
    getInputArguments().computeIfAbsent("trackingInfo", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("trackingInfo").add(firstArg);
    return projection;
  }

  public FulfillmentProjection<PARENT, ROOT> trackingCompany() {
    getFields().put("trackingCompany", null);
    return this;
  }
}
