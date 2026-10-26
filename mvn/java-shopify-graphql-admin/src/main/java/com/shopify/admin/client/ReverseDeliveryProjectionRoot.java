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
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("reverseDeliveryLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("reverseDeliveryLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("reverseDeliveryLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("reverseDeliveryLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("reverseDeliveryLineItems").add(reverseArg);
    return projection;
  }

  public ReverseDeliveryLineItemConnectionProjection<ReverseDeliveryProjectionRoot<PARENT, ROOT>, ReverseDeliveryProjectionRoot<PARENT, ROOT>> reverseDeliveryLineItemsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    ReverseDeliveryLineItemConnectionProjection<ReverseDeliveryProjectionRoot<PARENT, ROOT>, ReverseDeliveryProjectionRoot<PARENT, ROOT>> projection = new ReverseDeliveryLineItemConnectionProjection<>(this, this);    
    getFields().put("reverseDeliveryLineItems", projection);
    getInputArguments().computeIfAbsent("reverseDeliveryLineItems", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("reverseDeliveryLineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("reverseDeliveryLineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("reverseDeliveryLineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("reverseDeliveryLineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
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
