package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class ReverseDeliveryFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ReverseDeliveryFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseDelivery"));
  }

  public ReverseDeliveryFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseDeliveryDeliverableProjection<ReverseDeliveryFragmentProjection<PARENT, ROOT>, ROOT> deliverable(
      ) {
     ReverseDeliveryDeliverableProjection<ReverseDeliveryFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryDeliverableProjection<>(this, getRoot());
     getFields().put("deliverable", projection);
     return projection;
  }

  public ReverseDeliveryLineItemConnectionProjection<ReverseDeliveryFragmentProjection<PARENT, ROOT>, ROOT> reverseDeliveryLineItems(
      ) {
     ReverseDeliveryLineItemConnectionProjection<ReverseDeliveryFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryLineItemConnectionProjection<>(this, getRoot());
     getFields().put("reverseDeliveryLineItems", projection);
     return projection;
  }

  public ReverseDeliveryLineItemConnectionProjection<ReverseDeliveryFragmentProjection<PARENT, ROOT>, ROOT> reverseDeliveryLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReverseDeliveryLineItemConnectionProjection<ReverseDeliveryFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("reverseDeliveryLineItems", projection);
    getInputArguments().computeIfAbsent("reverseDeliveryLineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("reverseDeliveryLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("reverseDeliveryLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("reverseDeliveryLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("reverseDeliveryLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("reverseDeliveryLineItems").add(reverseArg);
    return projection;
  }

  public ReverseFulfillmentOrderProjection<ReverseDeliveryFragmentProjection<PARENT, ROOT>, ROOT> reverseFulfillmentOrder(
      ) {
     ReverseFulfillmentOrderProjection<ReverseDeliveryFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderProjection<>(this, getRoot());
     getFields().put("reverseFulfillmentOrder", projection);
     return projection;
  }

  public ReverseDeliveryFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ReverseDelivery {");
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
