package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class DeliveryProfileFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public DeliveryProfileFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DeliveryProfile"));
  }

  public DeliveryProfileFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> productVariantsCount(
      ) {
     CountProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("productVariantsCount", projection);
     return projection;
  }

  public DeliveryProductVariantsCountProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> productVariantsCountV2(
      ) {
     DeliveryProductVariantsCountProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProductVariantsCountProjection<>(this, getRoot());
     getFields().put("productVariantsCountV2", projection);
     return projection;
  }

  public DeliveryProfileItemConnectionProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> profileItems(
      ) {
     DeliveryProfileItemConnectionProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileItemConnectionProjection<>(this, getRoot());
     getFields().put("profileItems", projection);
     return projection;
  }

  public DeliveryProfileItemConnectionProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> profileItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DeliveryProfileItemConnectionProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileItemConnectionProjection<>(this, getRoot());    
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

  public DeliveryProfileLocationGroupProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> profileLocationGroups(
      ) {
     DeliveryProfileLocationGroupProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileLocationGroupProjection<>(this, getRoot());
     getFields().put("profileLocationGroups", projection);
     return projection;
  }

  public DeliveryProfileLocationGroupProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> profileLocationGroups(
      String locationGroupId) {
    DeliveryProfileLocationGroupProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryProfileLocationGroupProjection<>(this, getRoot());    
    getFields().put("profileLocationGroups", projection);
    getInputArguments().computeIfAbsent("profileLocationGroups", k -> new ArrayList<>());                      
    InputArgument locationGroupIdArg = new InputArgument("locationGroupId", locationGroupId);
    getInputArguments().get("profileLocationGroups").add(locationGroupIdArg);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      ) {
     SellingPlanGroupConnectionProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());
     getFields().put("sellingPlanGroups", projection);
     return projection;
  }

  public SellingPlanGroupConnectionProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanGroupConnectionProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> projection = new SellingPlanGroupConnectionProjection<>(this, getRoot());    
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

  public LocationProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> unassignedLocations(
      ) {
     LocationProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("unassignedLocations", projection);
     return projection;
  }

  public LocationConnectionProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> unassignedLocationsPaginated(
      ) {
     LocationConnectionProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());
     getFields().put("unassignedLocationsPaginated", projection);
     return projection;
  }

  public LocationConnectionProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> unassignedLocationsPaginated(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    LocationConnectionProjection<DeliveryProfileFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationConnectionProjection<>(this, getRoot());    
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

  public DeliveryProfileFragmentProjection<PARENT, ROOT> activeMethodDefinitionsCount() {
    getFields().put("activeMethodDefinitionsCount", null);
    return this;
  }

  public DeliveryProfileFragmentProjection<PARENT, ROOT> _default() {
    getFields().put("default", null);
    return this;
  }

  public DeliveryProfileFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryProfileFragmentProjection<PARENT, ROOT> legacyMode() {
    getFields().put("legacyMode", null);
    return this;
  }

  public DeliveryProfileFragmentProjection<PARENT, ROOT> locationsWithoutRatesCount() {
    getFields().put("locationsWithoutRatesCount", null);
    return this;
  }

  public DeliveryProfileFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public DeliveryProfileFragmentProjection<PARENT, ROOT> originLocationCount() {
    getFields().put("originLocationCount", null);
    return this;
  }

  public DeliveryProfileFragmentProjection<PARENT, ROOT> zoneCountryCount() {
    getFields().put("zoneCountryCount", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on DeliveryProfile {");
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
