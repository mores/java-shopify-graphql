package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class DeliveryProfileProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryProfileProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryProfile"));
  }

  public DeliveryProfileProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> productVariantsCount() {
     CountProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("productVariantsCount", projection);
     return projection;
  }

  public DeliveryProductVariantsCountProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> productVariantsCountV2(
      ) {
     DeliveryProductVariantsCountProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProductVariantsCountProjection<>(this, getRoot());
     getFields().put("productVariantsCountV2", projection);
     return projection;
  }

  public DeliveryProfileItemConnectionProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> profileItems(
      ) {
     DeliveryProfileItemConnectionProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileItemConnectionProjection<>(this, getRoot());
     getFields().put("profileItems", projection);
     return projection;
  }

  public DeliveryProfileItemConnectionProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> profileItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DeliveryProfileItemConnectionProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileItemConnectionProjection<>(this, getRoot());    
    getFields().put("profileItems", projection);
    getInputArguments().computeIfAbsent("profileItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("profileItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("profileItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("profileItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("profileItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("profileItems").add(reverseArg);
    return projection;
  }

  public DeliveryProfileLocationGroupProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> profileLocationGroups(
      ) {
     DeliveryProfileLocationGroupProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileLocationGroupProjection<>(this, getRoot());
     getFields().put("profileLocationGroups", projection);
     return projection;
  }

  public DeliveryProfileLocationGroupProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> profileLocationGroups(
      String locationGroupId) {
    DeliveryProfileLocationGroupProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileLocationGroupProjection<>(this, getRoot());    
    getFields().put("profileLocationGroups", projection);
    getInputArguments().computeIfAbsent("profileLocationGroups", k -> new ArrayList<>());                      
    InputArgument locationGroupIdArg = new InputArgument("locationGroupId", locationGroupId);
    getInputArguments().get("profileLocationGroups").add(locationGroupIdArg);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      ) {
     SellingPlanGroupConnectionProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());
     getFields().put("sellingPlanGroups", projection);
     return projection;
  }

  public SellingPlanGroupConnectionProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanGroupConnectionProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());    
    getFields().put("sellingPlanGroups", projection);
    getInputArguments().computeIfAbsent("sellingPlanGroups", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("sellingPlanGroups").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("sellingPlanGroups").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("sellingPlanGroups").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("sellingPlanGroups").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("sellingPlanGroups").add(reverseArg);
    return projection;
  }

  public LocationProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> unassignedLocations() {
     LocationProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("unassignedLocations", projection);
     return projection;
  }

  public LocationConnectionProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> unassignedLocationsPaginated(
      ) {
     LocationConnectionProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());
     getFields().put("unassignedLocationsPaginated", projection);
     return projection;
  }

  public LocationConnectionProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> unassignedLocationsPaginated(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    LocationConnectionProjection<DeliveryProfileProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
    getFields().put("unassignedLocationsPaginated", projection);
    getInputArguments().computeIfAbsent("unassignedLocationsPaginated", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("unassignedLocationsPaginated").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("unassignedLocationsPaginated").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("unassignedLocationsPaginated").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("unassignedLocationsPaginated").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("unassignedLocationsPaginated").add(reverseArg);
    return projection;
  }

  public DeliveryProfileProjection<PARENT, ROOT> activeMethodDefinitionsCount() {
    getFields().put("activeMethodDefinitionsCount", null);
    return this;
  }

  public DeliveryProfileProjection<PARENT, ROOT> _default() {
    getFields().put("default", null);
    return this;
  }

  public DeliveryProfileProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryProfileProjection<PARENT, ROOT> legacyMode() {
    getFields().put("legacyMode", null);
    return this;
  }

  public DeliveryProfileProjection<PARENT, ROOT> locationsWithoutRatesCount() {
    getFields().put("locationsWithoutRatesCount", null);
    return this;
  }

  public DeliveryProfileProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public DeliveryProfileProjection<PARENT, ROOT> originLocationCount() {
    getFields().put("originLocationCount", null);
    return this;
  }

  public DeliveryProfileProjection<PARENT, ROOT> zoneCountryCount() {
    getFields().put("zoneCountryCount", null);
    return this;
  }
}
