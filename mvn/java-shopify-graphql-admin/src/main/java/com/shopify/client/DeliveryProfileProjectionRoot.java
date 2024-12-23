package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class DeliveryProfileProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeliveryProfileProjectionRoot() {
    super(null, null, java.util.Optional.of("DeliveryProfile"));
  }

  public DeliveryProfileProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> productVariantsCount(
      ) {
    CountProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("productVariantsCount", projection);
    return projection;
  }

  public DeliveryProductVariantsCountProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> productVariantsCountV2(
      ) {
    DeliveryProductVariantsCountProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> projection = new DeliveryProductVariantsCountProjection<>(this, this);    
    getFields().put("productVariantsCountV2", projection);
    return projection;
  }

  public DeliveryProfileItemConnectionProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> profileItems(
      ) {
    DeliveryProfileItemConnectionProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> projection = new DeliveryProfileItemConnectionProjection<>(this, this);    
    getFields().put("profileItems", projection);
    return projection;
  }

  public DeliveryProfileItemConnectionProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> profileItems(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    DeliveryProfileItemConnectionProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> projection = new DeliveryProfileItemConnectionProjection<>(this, this);    
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

  public DeliveryProfileLocationGroupProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> profileLocationGroups(
      ) {
    DeliveryProfileLocationGroupProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> projection = new DeliveryProfileLocationGroupProjection<>(this, this);    
    getFields().put("profileLocationGroups", projection);
    return projection;
  }

  public DeliveryProfileLocationGroupProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> profileLocationGroups(
      String locationGroupId) {
    DeliveryProfileLocationGroupProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> projection = new DeliveryProfileLocationGroupProjection<>(this, this);    
    getFields().put("profileLocationGroups", projection);
    getInputArguments().computeIfAbsent("profileLocationGroups", k -> new ArrayList<>());                      
    InputArgument locationGroupIdArg = new InputArgument("locationGroupId", locationGroupId);
    getInputArguments().get("profileLocationGroups").add(locationGroupIdArg);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      ) {
    SellingPlanGroupConnectionProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
    getFields().put("sellingPlanGroups", projection);
    return projection;
  }

  public SellingPlanGroupConnectionProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> sellingPlanGroups(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SellingPlanGroupConnectionProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupConnectionProjection<>(this, this);    
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

  public LocationProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> unassignedLocations(
      ) {
    LocationProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> projection = new LocationProjection<>(this, this);    
    getFields().put("unassignedLocations", projection);
    return projection;
  }

  public LocationConnectionProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> unassignedLocationsPaginated(
      ) {
    LocationConnectionProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> projection = new LocationConnectionProjection<>(this, this);    
    getFields().put("unassignedLocationsPaginated", projection);
    return projection;
  }

  public LocationConnectionProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> unassignedLocationsPaginated(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    LocationConnectionProjection<DeliveryProfileProjectionRoot<PARENT, ROOT>, DeliveryProfileProjectionRoot<PARENT, ROOT>> projection = new LocationConnectionProjection<>(this, this);    
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

  public DeliveryProfileProjectionRoot<PARENT, ROOT> activeMethodDefinitionsCount() {
    getFields().put("activeMethodDefinitionsCount", null);
    return this;
  }

  public DeliveryProfileProjectionRoot<PARENT, ROOT> _default() {
    getFields().put("default", null);
    return this;
  }

  public DeliveryProfileProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public DeliveryProfileProjectionRoot<PARENT, ROOT> legacyMode() {
    getFields().put("legacyMode", null);
    return this;
  }

  public DeliveryProfileProjectionRoot<PARENT, ROOT> locationsWithoutRatesCount() {
    getFields().put("locationsWithoutRatesCount", null);
    return this;
  }

  public DeliveryProfileProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public DeliveryProfileProjectionRoot<PARENT, ROOT> originLocationCount() {
    getFields().put("originLocationCount", null);
    return this;
  }

  public DeliveryProfileProjectionRoot<PARENT, ROOT> zoneCountryCount() {
    getFields().put("zoneCountryCount", null);
    return this;
  }
}
