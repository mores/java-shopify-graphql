package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class ReverseFulfillmentOrderProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseFulfillmentOrderProjectionRoot() {
    super(null, null, java.util.Optional.of("ReverseFulfillmentOrder"));
  }

  public ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseFulfillmentOrderLineItemConnectionProjection<ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>> lineItems(
      ) {
    ReverseFulfillmentOrderLineItemConnectionProjection<ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new ReverseFulfillmentOrderLineItemConnectionProjection<>(this, this);    
    getFields().put("lineItems", projection);
    return projection;
  }

  public ReverseFulfillmentOrderLineItemConnectionProjection<ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReverseFulfillmentOrderLineItemConnectionProjection<ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new ReverseFulfillmentOrderLineItemConnectionProjection<>(this, this);    
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

  public OrderProjection<ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public ReverseDeliveryConnectionProjection<ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>> reverseDeliveries(
      ) {
    ReverseDeliveryConnectionProjection<ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new ReverseDeliveryConnectionProjection<>(this, this);    
    getFields().put("reverseDeliveries", projection);
    return projection;
  }

  public ReverseDeliveryConnectionProjection<ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>> reverseDeliveries(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReverseDeliveryConnectionProjection<ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new ReverseDeliveryConnectionProjection<>(this, this);    
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

  public ReverseFulfillmentOrderStatusProjection<ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>> status(
      ) {
    ReverseFulfillmentOrderStatusProjection<ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new ReverseFulfillmentOrderStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public ReverseFulfillmentOrderThirdPartyConfirmationProjection<ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>> thirdPartyConfirmation(
      ) {
    ReverseFulfillmentOrderThirdPartyConfirmationProjection<ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>, ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT>> projection = new ReverseFulfillmentOrderThirdPartyConfirmationProjection<>(this, this);    
    getFields().put("thirdPartyConfirmation", projection);
    return projection;
  }

  public ReverseFulfillmentOrderProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
