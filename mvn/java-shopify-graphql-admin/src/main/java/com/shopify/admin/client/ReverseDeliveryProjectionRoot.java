package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class ReverseDeliveryProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseDeliveryProjectionRoot() {
    super(null, null, java.util.Optional.of("ReverseDelivery"));
  }

  public ReverseDeliveryProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseDeliveryDeliverableProjection<ReverseDeliveryProjectionRoot<PARENT, ROOT>, ReverseDeliveryProjectionRoot<PARENT, ROOT>> deliverable(
      ) {
    ReverseDeliveryDeliverableProjection<ReverseDeliveryProjectionRoot<PARENT, ROOT>, ReverseDeliveryProjectionRoot<PARENT, ROOT>> projection = new ReverseDeliveryDeliverableProjection<>(this, this);    
    getFields().put("deliverable", projection);
    return projection;
  }

  public ReverseDeliveryLineItemConnectionProjection<ReverseDeliveryProjectionRoot<PARENT, ROOT>, ReverseDeliveryProjectionRoot<PARENT, ROOT>> reverseDeliveryLineItems(
      ) {
    ReverseDeliveryLineItemConnectionProjection<ReverseDeliveryProjectionRoot<PARENT, ROOT>, ReverseDeliveryProjectionRoot<PARENT, ROOT>> projection = new ReverseDeliveryLineItemConnectionProjection<>(this, this);    
    getFields().put("reverseDeliveryLineItems", projection);
    return projection;
  }

  public ReverseDeliveryLineItemConnectionProjection<ReverseDeliveryProjectionRoot<PARENT, ROOT>, ReverseDeliveryProjectionRoot<PARENT, ROOT>> reverseDeliveryLineItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    ReverseDeliveryLineItemConnectionProjection<ReverseDeliveryProjectionRoot<PARENT, ROOT>, ReverseDeliveryProjectionRoot<PARENT, ROOT>> projection = new ReverseDeliveryLineItemConnectionProjection<>(this, this);    
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

  public ReverseFulfillmentOrderProjection<ReverseDeliveryProjectionRoot<PARENT, ROOT>, ReverseDeliveryProjectionRoot<PARENT, ROOT>> reverseFulfillmentOrder(
      ) {
    ReverseFulfillmentOrderProjection<ReverseDeliveryProjectionRoot<PARENT, ROOT>, ReverseDeliveryProjectionRoot<PARENT, ROOT>> projection = new ReverseFulfillmentOrderProjection<>(this, this);    
    getFields().put("reverseFulfillmentOrder", projection);
    return projection;
  }

  public ReverseDeliveryProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
