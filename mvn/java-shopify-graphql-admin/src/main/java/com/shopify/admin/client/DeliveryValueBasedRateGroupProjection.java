package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class DeliveryValueBasedRateGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryValueBasedRateGroupProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryValueBasedRateGroup"));
  }

  public DeliveryValueBasedRateGroupProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryRateGroupConditionsProjection<DeliveryValueBasedRateGroupProjection<PARENT, ROOT>, ROOT> conditions(
      ) {
     DeliveryRateGroupConditionsProjection<DeliveryValueBasedRateGroupProjection<PARENT, ROOT>, ROOT> projection = new DeliveryRateGroupConditionsProjection<>(this, getRoot());
     getFields().put("conditions", projection);
     return projection;
  }

  public DeliveryValueBasedRateConnectionProjection<DeliveryValueBasedRateGroupProjection<PARENT, ROOT>, ROOT> rates(
      ) {
     DeliveryValueBasedRateConnectionProjection<DeliveryValueBasedRateGroupProjection<PARENT, ROOT>, ROOT> projection = new DeliveryValueBasedRateConnectionProjection<>(this, getRoot());
     getFields().put("rates", projection);
     return projection;
  }

  public DeliveryValueBasedRateConnectionProjection<DeliveryValueBasedRateGroupProjection<PARENT, ROOT>, ROOT> rates(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DeliveryValueBasedRateConnectionProjection<DeliveryValueBasedRateGroupProjection<PARENT, ROOT>, ROOT> projection = new DeliveryValueBasedRateConnectionProjection<>(this, getRoot());    
    getFields().put("rates", projection);
    getInputArguments().computeIfAbsent("rates", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("rates").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("rates").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("rates").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("rates").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("rates").add(reverseArg);
    return projection;
  }

  public DeliveryValueBasedRateConnectionProjection<DeliveryValueBasedRateGroupProjection<PARENT, ROOT>, ROOT> ratesWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    DeliveryValueBasedRateConnectionProjection<DeliveryValueBasedRateGroupProjection<PARENT, ROOT>, ROOT> projection = new DeliveryValueBasedRateConnectionProjection<>(this, getRoot());    
    getFields().put("rates", projection);
    getInputArguments().computeIfAbsent("rates", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("rates").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("rates").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("rates").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("rates").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("rates").add(reverseArg);
    return projection;
  }

  public DeliveryValueBasedRateGroupProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
