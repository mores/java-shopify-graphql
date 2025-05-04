package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class InventoryItemProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryItemProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryItem"));
  }

  public InventoryItemProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> countryCodeOfOrigin(
      ) {
    CountryCodeProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> projection = new CountryCodeProjection<>(this, this);    
    getFields().put("countryCodeOfOrigin", projection);
    return projection;
  }

  public CountryHarmonizedSystemCodeConnectionProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> countryHarmonizedSystemCodes(
      ) {
    CountryHarmonizedSystemCodeConnectionProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> projection = new CountryHarmonizedSystemCodeConnectionProjection<>(this, this);    
    getFields().put("countryHarmonizedSystemCodes", projection);
    return projection;
  }

  public CountryHarmonizedSystemCodeConnectionProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> countryHarmonizedSystemCodes(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CountryHarmonizedSystemCodeConnectionProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> projection = new CountryHarmonizedSystemCodeConnectionProjection<>(this, this);    
    getFields().put("countryHarmonizedSystemCodes", projection);
    getInputArguments().computeIfAbsent("countryHarmonizedSystemCodes", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("countryHarmonizedSystemCodes").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("countryHarmonizedSystemCodes").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("countryHarmonizedSystemCodes").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("countryHarmonizedSystemCodes").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("countryHarmonizedSystemCodes").add(reverseArg);
    return projection;
  }

  public InventoryLevelProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> inventoryLevel(
      ) {
    InventoryLevelProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> projection = new InventoryLevelProjection<>(this, this);    
    getFields().put("inventoryLevel", projection);
    return projection;
  }

  public InventoryLevelProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> inventoryLevel(
      String locationId) {
    InventoryLevelProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> projection = new InventoryLevelProjection<>(this, this);    
    getFields().put("inventoryLevel", projection);
    getInputArguments().computeIfAbsent("inventoryLevel", k -> new ArrayList<>());                      
    InputArgument locationIdArg = new InputArgument("locationId", locationId);
    getInputArguments().get("inventoryLevel").add(locationIdArg);
    return projection;
  }

  public InventoryLevelConnectionProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> inventoryLevels(
      ) {
    InventoryLevelConnectionProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> projection = new InventoryLevelConnectionProjection<>(this, this);    
    getFields().put("inventoryLevels", projection);
    return projection;
  }

  public InventoryLevelConnectionProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> inventoryLevels(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    InventoryLevelConnectionProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> projection = new InventoryLevelConnectionProjection<>(this, this);    
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

  public CountProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> locationsCount(
      ) {
    CountProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("locationsCount", projection);
    return projection;
  }

  public InventoryItemMeasurementProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> measurement(
      ) {
    InventoryItemMeasurementProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> projection = new InventoryItemMeasurementProjection<>(this, this);    
    getFields().put("measurement", projection);
    return projection;
  }

  public EditablePropertyProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> trackedEditable(
      ) {
    EditablePropertyProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> projection = new EditablePropertyProjection<>(this, this);    
    getFields().put("trackedEditable", projection);
    return projection;
  }

  public MoneyV2Projection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> unitCost(
      ) {
    MoneyV2Projection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("unitCost", projection);
    return projection;
  }

  public ProductVariantProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> variant(
      ) {
    ProductVariantProjection<InventoryItemProjectionRoot<PARENT, ROOT>, InventoryItemProjectionRoot<PARENT, ROOT>> projection = new ProductVariantProjection<>(this, this);    
    getFields().put("variant", projection);
    return projection;
  }

  public InventoryItemProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public InventoryItemProjectionRoot<PARENT, ROOT> duplicateSkuCount() {
    getFields().put("duplicateSkuCount", null);
    return this;
  }

  public InventoryItemProjectionRoot<PARENT, ROOT> harmonizedSystemCode() {
    getFields().put("harmonizedSystemCode", null);
    return this;
  }

  public InventoryItemProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryItemProjectionRoot<PARENT, ROOT> inventoryHistoryUrl() {
    getFields().put("inventoryHistoryUrl", null);
    return this;
  }

  public InventoryItemProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public InventoryItemProjectionRoot<PARENT, ROOT> provinceCodeOfOrigin() {
    getFields().put("provinceCodeOfOrigin", null);
    return this;
  }

  public InventoryItemProjectionRoot<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public InventoryItemProjectionRoot<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public InventoryItemProjectionRoot<PARENT, ROOT> tracked() {
    getFields().put("tracked", null);
    return this;
  }

  public InventoryItemProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
