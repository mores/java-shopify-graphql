package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class ReturnableFulfillmentFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ReturnableFulfillmentFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnableFulfillment"));
  }

  public ReturnableFulfillmentFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentProjection<ReturnableFulfillmentFragmentProjection<PARENT, ROOT>, ROOT> fulfillment(
      ) {
     FulfillmentProjection<ReturnableFulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentProjection<>(this, getRoot());
     getFields().put("fulfillment", projection);
     return projection;
  }

  public ReturnableFulfillmentLineItemConnectionProjection<ReturnableFulfillmentFragmentProjection<PARENT, ROOT>, ROOT> returnableFulfillmentLineItems(
      ) {
     ReturnableFulfillmentLineItemConnectionProjection<ReturnableFulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentLineItemConnectionProjection<>(this, getRoot());
     getFields().put("returnableFulfillmentLineItems", projection);
     return projection;
  }

  public ReturnableFulfillmentLineItemConnectionProjection<ReturnableFulfillmentFragmentProjection<PARENT, ROOT>, ROOT> returnableFulfillmentLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReturnableFulfillmentLineItemConnectionProjection<ReturnableFulfillmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentLineItemConnectionProjection<>(this, getRoot());    
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

  public ReturnableFulfillmentFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ReturnableFulfillment {");
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
