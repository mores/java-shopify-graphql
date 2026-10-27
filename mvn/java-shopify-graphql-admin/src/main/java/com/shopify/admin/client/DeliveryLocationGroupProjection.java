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
      Boolean includeLegacy, Boolean includeInactive, Integer first, String after, Integer last,
      String before, Boolean reverse, LocationSortKeys sortKey, String query) {
    LocationConnectionProjection<DeliveryLocationGroupProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
    getFields().put("locations", projection);
    getInputArguments().computeIfAbsent("locations", k -> new ArrayList<>());                      
    InputArgument includeLegacyArg = new InputArgument("includeLegacy", includeLegacy, false, null);
    getInputArguments().get("locations").add(includeLegacyArg);
    InputArgument includeInactiveArg = new InputArgument("includeInactive", includeInactive, false, null);
    getInputArguments().get("locations").add(includeInactiveArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("locations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("locations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("locations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("locations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("locations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("locations").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("locations").add(queryArg);
    return projection;
  }

  public LocationConnectionProjection<DeliveryLocationGroupProjection<PARENT, ROOT>, ROOT> locationsWithVariableReferences(
      String includeLegacyReference, String includeInactiveReference, String firstReference,
      String afterReference, String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference) {
    LocationConnectionProjection<DeliveryLocationGroupProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
    getFields().put("locations", projection);
    getInputArguments().computeIfAbsent("locations", k -> new ArrayList<>());              
    InputArgument includeLegacyArg = new InputArgument("includeLegacy", includeLegacyReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("locations").add(includeLegacyArg);
    InputArgument includeInactiveArg = new InputArgument("includeInactive", includeInactiveReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("locations").add(includeInactiveArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("locations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("locations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("locations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("locations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("locations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("LocationSortKeys"));
    getInputArguments().get("locations").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("locations").add(queryArg);
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
