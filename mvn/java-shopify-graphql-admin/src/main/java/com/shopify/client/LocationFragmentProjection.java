package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class LocationFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public LocationFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Location"));
  }

  public LocationFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationAddressProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> address() {
     LocationAddressProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationAddressProjection<>(this, getRoot());
     getFields().put("address", projection);
     return projection;
  }

  public FulfillmentServiceProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> fulfillmentService(
      ) {
     FulfillmentServiceProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentServiceProjection<>(this, getRoot());
     getFields().put("fulfillmentService", projection);
     return projection;
  }

  public InventoryLevelProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> inventoryLevel() {
     InventoryLevelProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelProjection<>(this, getRoot());
     getFields().put("inventoryLevel", projection);
     return projection;
  }

  public InventoryLevelProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> inventoryLevel(
      String inventoryItemId) {
    InventoryLevelProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelProjection<>(this, getRoot());    
    getFields().put("inventoryLevel", projection);
    getInputArguments().computeIfAbsent("inventoryLevel", k -> new ArrayList<>());                      
    InputArgument inventoryItemIdArg = new InputArgument("inventoryItemId", inventoryItemId);
    getInputArguments().get("inventoryLevel").add(inventoryItemIdArg);
    return projection;
  }

  public InventoryLevelConnectionProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> inventoryLevels(
      ) {
     InventoryLevelConnectionProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelConnectionProjection<>(this, getRoot());
     getFields().put("inventoryLevels", projection);
     return projection;
  }

  public InventoryLevelConnectionProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> inventoryLevels(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    InventoryLevelConnectionProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelConnectionProjection<>(this, getRoot());    
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

  public DeliveryLocalPickupSettingsProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> localPickupSettingsV2(
      ) {
     DeliveryLocalPickupSettingsProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new DeliveryLocalPickupSettingsProjection<>(this, getRoot());
     getFields().put("localPickupSettingsV2", projection);
     return projection;
  }

  public MetafieldProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
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

  public MetafieldConnectionProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      ) {
     MetafieldConnectionProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public LocationSuggestedAddressProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> suggestedAddresses(
      ) {
     LocationSuggestedAddressProjection<LocationFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationSuggestedAddressProjection<>(this, getRoot());
     getFields().put("suggestedAddresses", projection);
     return projection;
  }

  public LocationFragmentProjection<PARENT, ROOT> activatable() {
    getFields().put("activatable", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> addressVerified() {
    getFields().put("addressVerified", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> deactivatable() {
    getFields().put("deactivatable", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> deactivatedAt() {
    getFields().put("deactivatedAt", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> deletable() {
    getFields().put("deletable", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> fulfillsOnlineOrders() {
    getFields().put("fulfillsOnlineOrders", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> hasActiveInventory() {
    getFields().put("hasActiveInventory", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> hasUnfulfilledOrders() {
    getFields().put("hasUnfulfilledOrders", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> isActive() {
    getFields().put("isActive", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> isFulfillmentService() {
    getFields().put("isFulfillmentService", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> isPrimary() {
    getFields().put("isPrimary", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> shipsInventory() {
    getFields().put("shipsInventory", null);
    return this;
  }

  public LocationFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Location {");
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
