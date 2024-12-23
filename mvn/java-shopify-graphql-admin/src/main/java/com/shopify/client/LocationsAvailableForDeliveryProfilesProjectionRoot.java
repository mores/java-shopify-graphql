package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public LocationsAvailableForDeliveryProfilesProjectionRoot() {
    super(null, null, java.util.Optional.of("Location"));
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationAddressProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> address(
      ) {
    LocationAddressProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new LocationAddressProjection<>(this, this);    
    getFields().put("address", projection);
    return projection;
  }

  public FulfillmentServiceProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> fulfillmentService(
      ) {
    FulfillmentServiceProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new FulfillmentServiceProjection<>(this, this);    
    getFields().put("fulfillmentService", projection);
    return projection;
  }

  public InventoryLevelProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> inventoryLevel(
      ) {
    InventoryLevelProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new InventoryLevelProjection<>(this, this);    
    getFields().put("inventoryLevel", projection);
    return projection;
  }

  public InventoryLevelProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> inventoryLevel(
      String inventoryItemId) {
    InventoryLevelProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new InventoryLevelProjection<>(this, this);    
    getFields().put("inventoryLevel", projection);
    getInputArguments().computeIfAbsent("inventoryLevel", k -> new ArrayList<>());                      
    InputArgument inventoryItemIdArg = new InputArgument("inventoryItemId", inventoryItemId);
    getInputArguments().get("inventoryLevel").add(inventoryItemIdArg);
    return projection;
  }

  public InventoryLevelConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> inventoryLevels(
      ) {
    InventoryLevelConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new InventoryLevelConnectionProjection<>(this, this);    
    getFields().put("inventoryLevels", projection);
    return projection;
  }

  public InventoryLevelConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> inventoryLevels(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    InventoryLevelConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new InventoryLevelConnectionProjection<>(this, this);    
    getFields().put("inventoryLevels", projection);
    getInputArguments().computeIfAbsent("inventoryLevels", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("inventoryLevels").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("inventoryLevels").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("inventoryLevels").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("inventoryLevels").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("inventoryLevels").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("inventoryLevels").add(queryArg);
    return projection;
  }

  public DeliveryLocalPickupSettingsProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> localPickupSettingsV2(
      ) {
    DeliveryLocalPickupSettingsProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new DeliveryLocalPickupSettingsProjection<>(this, this);    
    getFields().put("localPickupSettingsV2", projection);
    return projection;
  }

  public MetafieldProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatus);
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public PrivateMetafieldProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> privateMetafield(
      ) {
    PrivateMetafieldProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    return projection;
  }

  public PrivateMetafieldProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> privateMetafields(
      ) {
    PrivateMetafieldConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    getInputArguments().computeIfAbsent("privateMetafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafields").add(namespaceArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("privateMetafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("privateMetafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("privateMetafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("privateMetafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("privateMetafields").add(reverseArg);
    return projection;
  }

  public LocationSuggestedAddressProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> suggestedAddresses(
      ) {
    LocationSuggestedAddressProjection<LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>, LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT>> projection = new LocationSuggestedAddressProjection<>(this, this);    
    getFields().put("suggestedAddresses", projection);
    return projection;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> activatable() {
    getFields().put("activatable", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> addressVerified() {
    getFields().put("addressVerified", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> deactivatable() {
    getFields().put("deactivatable", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> deactivatedAt() {
    getFields().put("deactivatedAt", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> deletable() {
    getFields().put("deletable", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> fulfillsOnlineOrders() {
    getFields().put("fulfillsOnlineOrders", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> hasActiveInventory() {
    getFields().put("hasActiveInventory", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> hasUnfulfilledOrders() {
    getFields().put("hasUnfulfilledOrders", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> isActive() {
    getFields().put("isActive", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> isFulfillmentService() {
    getFields().put("isFulfillmentService", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> isPrimary() {
    getFields().put("isPrimary", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> shipsInventory() {
    getFields().put("shipsInventory", null);
    return this;
  }

  public LocationsAvailableForDeliveryProfilesProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
