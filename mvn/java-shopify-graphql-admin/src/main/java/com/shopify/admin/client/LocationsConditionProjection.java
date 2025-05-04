package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class LocationsConditionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationsConditionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("LocationsCondition"));
  }

  public LocationsConditionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MarketConditionApplicationTypeProjection<LocationsConditionProjection<PARENT, ROOT>, ROOT> applicationLevel(
      ) {
     MarketConditionApplicationTypeProjection<LocationsConditionProjection<PARENT, ROOT>, ROOT> projection = new MarketConditionApplicationTypeProjection<>(this, getRoot());
     getFields().put("applicationLevel", projection);
     return projection;
  }

  public LocationConnectionProjection<LocationsConditionProjection<PARENT, ROOT>, ROOT> locations(
      ) {
     LocationConnectionProjection<LocationsConditionProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());
     getFields().put("locations", projection);
     return projection;
  }

  public LocationConnectionProjection<LocationsConditionProjection<PARENT, ROOT>, ROOT> locations(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    LocationConnectionProjection<LocationsConditionProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
    getFields().put("locations", projection);
    getInputArguments().computeIfAbsent("locations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("locations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("locations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("locations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("locations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("locations").add(reverseArg);
    return projection;
  }
}
