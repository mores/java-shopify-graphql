package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class InventoryItemFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public InventoryItemFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryItem"));
  }

  public InventoryItemFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> countryCodeOfOrigin(
      ) {
     CountryCodeProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("countryCodeOfOrigin", projection);
     return projection;
  }

  public CountryHarmonizedSystemCodeConnectionProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> countryHarmonizedSystemCodes(
      ) {
     CountryHarmonizedSystemCodeConnectionProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountryHarmonizedSystemCodeConnectionProjection<>(this, getRoot());
     getFields().put("countryHarmonizedSystemCodes", projection);
     return projection;
  }

  public CountryHarmonizedSystemCodeConnectionProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> countryHarmonizedSystemCodes(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CountryHarmonizedSystemCodeConnectionProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountryHarmonizedSystemCodeConnectionProjection<>(this, getRoot());    
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

  public InventoryLevelProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> inventoryLevel(
      ) {
     InventoryLevelProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelProjection<>(this, getRoot());
     getFields().put("inventoryLevel", projection);
     return projection;
  }

  public InventoryLevelProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> inventoryLevel(
      String locationId) {
    InventoryLevelProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelProjection<>(this, getRoot());    
    getFields().put("inventoryLevel", projection);
    getInputArguments().computeIfAbsent("inventoryLevel", k -> new ArrayList<>());                      
    InputArgument locationIdArg = new InputArgument("locationId", locationId);
    getInputArguments().get("inventoryLevel").add(locationIdArg);
    return projection;
  }

  public InventoryLevelConnectionProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> inventoryLevels(
      ) {
     InventoryLevelConnectionProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelConnectionProjection<>(this, getRoot());
     getFields().put("inventoryLevels", projection);
     return projection;
  }

  public InventoryLevelConnectionProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> inventoryLevels(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    InventoryLevelConnectionProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryLevelConnectionProjection<>(this, getRoot());    
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

  public CountProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> locationsCount() {
     CountProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("locationsCount", projection);
     return projection;
  }

  public InventoryItemMeasurementProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> measurement(
      ) {
     InventoryItemMeasurementProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryItemMeasurementProjection<>(this, getRoot());
     getFields().put("measurement", projection);
     return projection;
  }

  public EditablePropertyProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> trackedEditable(
      ) {
     EditablePropertyProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new EditablePropertyProjection<>(this, getRoot());
     getFields().put("trackedEditable", projection);
     return projection;
  }

  public MoneyV2Projection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> unitCost() {
     MoneyV2Projection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("unitCost", projection);
     return projection;
  }

  public ProductVariantProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> variant() {
     ProductVariantProjection<InventoryItemFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductVariantProjection<>(this, getRoot());
     getFields().put("variant", projection);
     return projection;
  }

  public InventoryItemFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public InventoryItemFragmentProjection<PARENT, ROOT> duplicateSkuCount() {
    getFields().put("duplicateSkuCount", null);
    return this;
  }

  public InventoryItemFragmentProjection<PARENT, ROOT> harmonizedSystemCode() {
    getFields().put("harmonizedSystemCode", null);
    return this;
  }

  public InventoryItemFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryItemFragmentProjection<PARENT, ROOT> inventoryHistoryUrl() {
    getFields().put("inventoryHistoryUrl", null);
    return this;
  }

  public InventoryItemFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public InventoryItemFragmentProjection<PARENT, ROOT> provinceCodeOfOrigin() {
    getFields().put("provinceCodeOfOrigin", null);
    return this;
  }

  public InventoryItemFragmentProjection<PARENT, ROOT> requiresShipping() {
    getFields().put("requiresShipping", null);
    return this;
  }

  public InventoryItemFragmentProjection<PARENT, ROOT> sku() {
    getFields().put("sku", null);
    return this;
  }

  public InventoryItemFragmentProjection<PARENT, ROOT> tracked() {
    getFields().put("tracked", null);
    return this;
  }

  public InventoryItemFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on InventoryItem {");
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
