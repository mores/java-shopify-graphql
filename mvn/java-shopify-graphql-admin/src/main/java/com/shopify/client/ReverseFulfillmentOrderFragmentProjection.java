package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class ReverseFulfillmentOrderFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ReverseFulfillmentOrderFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseFulfillmentOrder"));
  }

  public ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseFulfillmentOrderLineItemConnectionProjection<ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     ReverseFulfillmentOrderLineItemConnectionProjection<ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderLineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public ReverseFulfillmentOrderLineItemConnectionProjection<ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReverseFulfillmentOrderLineItemConnectionProjection<ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("lineItems").add(reverseArg);
    return projection;
  }

  public OrderProjection<ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public ReverseDeliveryConnectionProjection<ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> reverseDeliveries(
      ) {
     ReverseDeliveryConnectionProjection<ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryConnectionProjection<>(this, getRoot());
     getFields().put("reverseDeliveries", projection);
     return projection;
  }

  public ReverseDeliveryConnectionProjection<ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> reverseDeliveries(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReverseDeliveryConnectionProjection<ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseDeliveryConnectionProjection<>(this, getRoot());    
    getFields().put("reverseDeliveries", projection);
    getInputArguments().computeIfAbsent("reverseDeliveries", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("reverseDeliveries").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("reverseDeliveries").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("reverseDeliveries").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("reverseDeliveries").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("reverseDeliveries").add(reverseArg);
    return projection;
  }

  public ReverseFulfillmentOrderStatusProjection<ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ReverseFulfillmentOrderStatusProjection<ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ReverseFulfillmentOrderThirdPartyConfirmationProjection<ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> thirdPartyConfirmation(
      ) {
     ReverseFulfillmentOrderThirdPartyConfirmationProjection<ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderThirdPartyConfirmationProjection<>(this, getRoot());
     getFields().put("thirdPartyConfirmation", projection);
     return projection;
  }

  public ReverseFulfillmentOrderFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ReverseFulfillmentOrder {");
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
