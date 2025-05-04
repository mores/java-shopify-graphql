package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.LocationSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class DeliveryLocationGroupProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryLocationGroupProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryLocationGroup"));
  }

  public DeliveryLocationGroupProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationConnectionProjection<DeliveryLocationGroupProjection<PARENT, ROOT>, ROOT> locations(
      ) {
     LocationConnectionProjection<DeliveryLocationGroupProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());
     getFields().put("locations", projection);
     return projection;
  }

  public LocationConnectionProjection<DeliveryLocationGroupProjection<PARENT, ROOT>, ROOT> locations(
      Integer first, String after, Integer last, String before, Boolean reverse,
      LocationSortKeys sortKey, String query, Boolean includeLegacy, Boolean includeInactive) {
    LocationConnectionProjection<DeliveryLocationGroupProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
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
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("locations").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("locations").add(queryArg);
    InputArgument includeLegacyArg = new InputArgument("includeLegacy", includeLegacy);
    getInputArguments().get("locations").add(includeLegacyArg);
    InputArgument includeInactiveArg = new InputArgument("includeInactive", includeInactive);
    getInputArguments().get("locations").add(includeInactiveArg);
    return projection;
  }

  public CountProjection<DeliveryLocationGroupProjection<PARENT, ROOT>, ROOT> locationsCount() {
     CountProjection<DeliveryLocationGroupProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("locationsCount", projection);
     return projection;
  }

  public DeliveryLocationGroupProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
