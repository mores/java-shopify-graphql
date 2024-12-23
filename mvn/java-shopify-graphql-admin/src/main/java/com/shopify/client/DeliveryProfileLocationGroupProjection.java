package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class DeliveryProfileLocationGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryProfileLocationGroupProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryProfileLocationGroup"));
  }

  public DeliveryProfileLocationGroupProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeliveryCountryAndZoneProjection<DeliveryProfileLocationGroupProjection<PARENT, ROOT>, ROOT> countriesInAnyZone(
      ) {
     DeliveryCountryAndZoneProjection<DeliveryProfileLocationGroupProjection<PARENT, ROOT>, ROOT> projection = new DeliveryCountryAndZoneProjection<>(this, getRoot());
     getFields().put("countriesInAnyZone", projection);
     return projection;
  }

  public DeliveryLocationGroupProjection<DeliveryProfileLocationGroupProjection<PARENT, ROOT>, ROOT> locationGroup(
      ) {
     DeliveryLocationGroupProjection<DeliveryProfileLocationGroupProjection<PARENT, ROOT>, ROOT> projection = new DeliveryLocationGroupProjection<>(this, getRoot());
     getFields().put("locationGroup", projection);
     return projection;
  }

  public DeliveryLocationGroupZoneConnectionProjection<DeliveryProfileLocationGroupProjection<PARENT, ROOT>, ROOT> locationGroupZones(
      ) {
     DeliveryLocationGroupZoneConnectionProjection<DeliveryProfileLocationGroupProjection<PARENT, ROOT>, ROOT> projection = new DeliveryLocationGroupZoneConnectionProjection<>(this, getRoot());
     getFields().put("locationGroupZones", projection);
     return projection;
  }

  public DeliveryLocationGroupZoneConnectionProjection<DeliveryProfileLocationGroupProjection<PARENT, ROOT>, ROOT> locationGroupZones(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DeliveryLocationGroupZoneConnectionProjection<DeliveryProfileLocationGroupProjection<PARENT, ROOT>, ROOT> projection = new DeliveryLocationGroupZoneConnectionProjection<>(this, getRoot());    
    getFields().put("locationGroupZones", projection);
    getInputArguments().computeIfAbsent("locationGroupZones", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("locationGroupZones").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("locationGroupZones").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("locationGroupZones").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("locationGroupZones").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("locationGroupZones").add(reverseArg);
    return projection;
  }
}
