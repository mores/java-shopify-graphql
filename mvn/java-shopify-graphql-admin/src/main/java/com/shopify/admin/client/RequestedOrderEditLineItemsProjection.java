package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class RequestedOrderEditLineItemsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RequestedOrderEditLineItemsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RequestedOrderEditLineItems"));
  }

  public RequestedOrderEditLineItemsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RequestedOrderEditLineItemConnectionProjection<RequestedOrderEditLineItemsProjection<PARENT, ROOT>, ROOT> removals(
      ) {
     RequestedOrderEditLineItemConnectionProjection<RequestedOrderEditLineItemsProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditLineItemConnectionProjection<>(this, getRoot());
     getFields().put("removals", projection);
     return projection;
  }

  public RequestedOrderEditLineItemConnectionProjection<RequestedOrderEditLineItemsProjection<PARENT, ROOT>, ROOT> removals(
      Integer first, String after, Integer last, String before) {
    RequestedOrderEditLineItemConnectionProjection<RequestedOrderEditLineItemsProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("removals", projection);
    getInputArguments().computeIfAbsent("removals", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("removals").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("removals").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("removals").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("removals").add(beforeArg);
    return projection;
  }

  public RequestedOrderEditLineItemConnectionProjection<RequestedOrderEditLineItemsProjection<PARENT, ROOT>, ROOT> removalsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference) {
    RequestedOrderEditLineItemConnectionProjection<RequestedOrderEditLineItemsProjection<PARENT, ROOT>, ROOT> projection = new RequestedOrderEditLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("removals", projection);
    getInputArguments().computeIfAbsent("removals", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("removals").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("removals").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("removals").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("removals").add(beforeArg);
    return projection;
  }
}
