package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class CalculatedRequestedOrderEditLineItemsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedRequestedOrderEditLineItemsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedRequestedOrderEditLineItems"));
  }

  public CalculatedRequestedOrderEditLineItemsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CalculatedRequestedOrderEditLineItemConnectionProjection<CalculatedRequestedOrderEditLineItemsProjection<PARENT, ROOT>, ROOT> removals(
      ) {
     CalculatedRequestedOrderEditLineItemConnectionProjection<CalculatedRequestedOrderEditLineItemsProjection<PARENT, ROOT>, ROOT> projection = new CalculatedRequestedOrderEditLineItemConnectionProjection<>(this, getRoot());
     getFields().put("removals", projection);
     return projection;
  }

  public CalculatedRequestedOrderEditLineItemConnectionProjection<CalculatedRequestedOrderEditLineItemsProjection<PARENT, ROOT>, ROOT> removals(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CalculatedRequestedOrderEditLineItemConnectionProjection<CalculatedRequestedOrderEditLineItemsProjection<PARENT, ROOT>, ROOT> projection = new CalculatedRequestedOrderEditLineItemConnectionProjection<>(this, getRoot());    
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
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("removals").add(reverseArg);
    return projection;
  }

  public CalculatedRequestedOrderEditLineItemConnectionProjection<CalculatedRequestedOrderEditLineItemsProjection<PARENT, ROOT>, ROOT> removalsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    CalculatedRequestedOrderEditLineItemConnectionProjection<CalculatedRequestedOrderEditLineItemsProjection<PARENT, ROOT>, ROOT> projection = new CalculatedRequestedOrderEditLineItemConnectionProjection<>(this, getRoot());    
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
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("removals").add(reverseArg);
    return projection;
  }
}
